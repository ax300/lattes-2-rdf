package rdf;

import lombok.Getter;

import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class RDFIDImpl {

  public Map<String, String> keys = new HashMap<>();
  private Map<String, RDFKeyStrategy> keysStrategy = new HashMap<>();
  private Map<String, String> keysProperty = new HashMap<>();


  @Getter
  private String mainId = "";

  @Getter
  private String mainIdCode = "";

  private String lastKey;

  private RDFKeyStrategy extractRDFIDStrategy(Object obj) {

    Class<?> currentClass = obj.getClass();

    for (Field f : currentClass.getDeclaredFields()) {
      f.setAccessible(true);
      if (f.getType().equals(String.class) ||
              f.getType().isPrimitive()) {
        if (f.isAnnotationPresent(RDF.class)) {
          RDF annotation = f.getAnnotation(RDF.class);
          if (annotation.id()) {
            return annotation.strategy();
          }
        }
      }

    }

    return RDFKeyStrategy.DEFAULT;
  }

  private String extractRDFIDProperty(Object obj) {

    Class<?> currentClass = obj.getClass();

    for (Field f : currentClass.getDeclaredFields()) {
      f.setAccessible(true);
      if (f.getType().equals(String.class) ||
              f.getType().isPrimitive()) {
        if (f.isAnnotationPresent(RDF.class)) {
          RDF annotation = f.getAnnotation(RDF.class);
          if (annotation.id()) {
            return annotation.property();
          }
        }
      }

    }

    return "";
  }

  private String extractRDFID(Object obj, Optional<RDFKeyStrategy> strategy) throws Exception {

    Class<?> currentClass = obj.getClass();

    for (Field f : currentClass.getDeclaredFields()) {
      f.setAccessible(true);
      if (f.getType().equals(String.class) ||
              f.getType().isPrimitive()) {
        if (f.isAnnotationPresent(RDF.class)) {
          RDF annotation = f.getAnnotation(RDF.class);
          if (annotation.id() && isComposite(annotation.strategy())) {
            String text = f.get(obj).toString();
            return String.format("%s#%s", mainId, text);
          } else if (annotation.id() && strategy.isPresent() && isCodeOnly(strategy.get())) {
            String text = f.get(obj).toString();
            return text;
          } else if (annotation.id() && isURL(annotation.strategy())) {
            Object textObj = f.get(obj);

            String text = null;

            if (textObj != null) {
              text = f.get(obj).toString();
            }


            //TODO: REFATORAR
            if (text == null || text.isEmpty()) {
              String id = String.format("%s", "http://lattes.cnpq.br/uuid/".concat(UUID.randomUUID().toString().replace("-","")));

              f.set(obj, id);

              return id;

            } else {
              text = URLEncoder.encode(text, "UTF-8");
            }
            return text.contains(annotation.base()) ? text : annotation.base().toString().concat(text);
          } else if (annotation.id()) {
            String text = f.get(obj).toString();
            return text.contains(annotation.base()) ? text : annotation.base().toString().concat(text);
          }
        }
      }

    }

    return "";
  }

  public void extractInfoKey(Object obj) {

    Class<?> currentClass = obj.getClass();

    try {

      String currentKey = extractRDFID(obj, Optional.empty());


      //TODO: REFATORAR
      if (currentKey != null && !currentKey.isEmpty()) {
        keys.put(currentClass.getCanonicalName(), currentKey);
        if (!currentClass.getCanonicalName().equals("pt.dbpedia.org.lattes.autorship.WorkInfo") && !currentClass.getCanonicalName().equals("pt.dbpedia.org.lattes.autorship.ArticleInfo") && !currentClass.getCanonicalName().equals("pt.dbpedia.org.lattes.autorship.BookInfo") && !currentClass.getCanonicalName().equals("pt.dbpedia.org.lattes.autorship.ChapterInfo")) {
          keys.put(currentClass.getPackage().getName(), currentKey);
        }
        keys.put(currentClass.getCanonicalName(), currentKey);
      }

      keys.put(currentClass.getCanonicalName(), currentKey);

      keys.put(extractRDFID(obj, Optional.empty()), mainId); // URL
      keysStrategy.put(currentClass.getCanonicalName(), extractRDFIDStrategy(obj));
      keysProperty.put(currentClass.getCanonicalName(), extractRDFIDProperty(obj));



      if (this.mainId.isEmpty()) {
        this.mainId = extractRDFID(obj, Optional.empty());
        this.mainIdCode = extractRDFID(obj, Optional.of(RDFKeyStrategy.CODE_ONLY));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public String getKey(String packageName) {
    String result = keys.get(packageName);

    if (result == null || result.isEmpty()) {
      return mainId;
    }

    return result;

  }

  public String getProperty(String className) {
    String result = keysProperty.get(className);

    return result;

  }

  public RDFKeyStrategy getEstrategy(String className) {

    RDFKeyStrategy result = keysStrategy.get(className);

    if (result == null) {
      return RDFKeyStrategy.DEFAULT;
    }

    return result;

  }

  public Boolean isComposite(String className) {

    RDFKeyStrategy strategy = getEstrategy(className);

    return RDFKeyStrategy.COMPOSITE.equals(strategy);
  }

  public Boolean isURL(String url) {

    RDFKeyStrategy strategy = getEstrategy(url);

    return RDFKeyStrategy.URL.equals(strategy);
  }

  public Boolean isURL(RDFKeyStrategy rdfKeyStrategy) {
    return RDFKeyStrategy.URL.equals(rdfKeyStrategy);
  }

  public Boolean isComposite(RDFKeyStrategy rdfKeyStrategy) {
    return RDFKeyStrategy.COMPOSITE.equals(rdfKeyStrategy);
  }

  public Boolean isCodeOnly(RDFKeyStrategy rdfKeyStrategy) {
    return RDFKeyStrategy.CODE_ONLY.equals(rdfKeyStrategy);
  }

}
