package rdf;

import com.thoughtworks.xstream.mapper.Mapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RDFImpl {

  private final String VALUE_FORMAT = "<%s>\t<%s>\t\"%s\".";

  private final String URL_FORMAT = "<%s>\t<%s>\t<%s>.";

  private RDFIDImpl rdfIDImpl = new RDFIDImpl();
  private Map<String, Boolean> blankNode = new HashMap<>();
  private Map<String, String> key = new HashMap<>();


  public String rdf(Object obj) {

    if (obj == null) {
      return "";
    }

    Class<?> currentClass = obj.getClass();

    //System.out.println(currentClass.getCanonicalName());

    rdfIDImpl.extractInfoKey(obj);


    for (Field f : currentClass.getDeclaredFields()) {

      f.setAccessible(true);

      if (f.getType().equals(String.class) ||
              f.getType().isPrimitive()) {
        if (f.isAnnotationPresent(RDF.class)) {

          RDF annotation = f.getAnnotation(RDF.class);

          Object a =  null;


          try {
             a =  f.get(obj);
          } catch (IllegalAccessException e) {
              a =  null;
          }


          if (!annotation.id() && obj != null && a != null ) {
            String text;
            try {
              text = f.get(obj).toString();
            } catch (IllegalAccessException e) {
              text = "";
            }

            if (text != null && !text.isEmpty()) {

              Boolean isBlankNodeAlreadyProcess = blankNode.get(currentClass.getCanonicalName());

              if (rdfIDImpl.isComposite(currentClass.getCanonicalName())) { //_BlankNode

                if (annotation.print() && annotation.value() && (isBlankNodeAlreadyProcess == null || !isBlankNodeAlreadyProcess)) {
                  blankNode.put(currentClass.getCanonicalName(), Boolean.TRUE);
                  System.out.println(String.format(URL_FORMAT,
                          rdfIDImpl.getMainId(),
                          rdfIDImpl.getProperty(currentClass.getCanonicalName()),
                          rdfIDImpl.getKey(currentClass.getPackage().getName())));
                }
              }


              if (rdfIDImpl.isURL(currentClass.getCanonicalName())) { // _Relation


                String value = String.format(URL_FORMAT,
                        rdfIDImpl.getMainId(),
                        rdfIDImpl.getProperty(currentClass.getCanonicalName()),
                        rdfIDImpl.getKey(currentClass.getPackage().getName()));

                if (currentClass.getPackage().getName().equals("pt.dbpedia.org.lattes.autorship")) {
                  value = String.format(URL_FORMAT,
                          rdfIDImpl.getKey(currentClass.getPackage().getName()),
                          rdfIDImpl.getProperty(currentClass.getCanonicalName()),
                          rdfIDImpl.getKey(currentClass.getCanonicalName()));

                  rdfIDImpl.keys.put(currentClass.getPackage().getName(), rdfIDImpl.getKey(currentClass.getCanonicalName()));
                  rdfIDImpl.keys.put(currentClass.getCanonicalName(), rdfIDImpl.getKey(currentClass.getCanonicalName()));

                }




                isBlankNodeAlreadyProcess = blankNode.get(value) ;
                if ((isBlankNodeAlreadyProcess == null || !isBlankNodeAlreadyProcess) && annotation.print()) {

                  blankNode.put(value, Boolean.TRUE);
                  if (!value.contains("http://lattes.org/ontology/production")) {

                    String arr[] = value.split("\t");

                    if (arr[1].contains("sameAs") && arr[2].contains(arr[0])) {
                     // System.out.println(value);
                    } else {
                      System.out.println(value);
                    }

                  }  else  {

                    System.out.println(String.format(URL_FORMAT,
                            rdfIDImpl.getMainId(),
                            "http://lattes.cnpq.br/ontology/author",
                            rdfIDImpl.getKey(currentClass.getPackage().getName())));
                  }
                }

              }

              if (annotation.print()) {

                if (annotation.value()) {
                  System.out.println(String.format(VALUE_FORMAT,
                          rdfIDImpl.getKey(currentClass.getPackage().getName()),
                          annotation.property(),
                          text));
                } else {

                  if (annotation.property().equals("http://lattes.cnpq.br/ontology/author")) {

                    System.out.println(String.format(URL_FORMAT,
                            rdfIDImpl.getKey(currentClass.getPackage().getName()),
                            annotation.property(),
                            annotation.base().concat(text)));


                    System.out.println(String.format(URL_FORMAT,
                            annotation.base().concat(text),
                            annotation.property(),
                              rdfIDImpl.getKey(currentClass.getPackage().getName())));


                  } else {


                      System.out.println(String.format(URL_FORMAT,
                              rdfIDImpl.getKey(currentClass.getPackage().getName()),
                              annotation.property(),
                              annotation.base().concat(text)));

                  }

                }
              }
            }
          }
        }
      } else if (f.getType().equals(List.class)) {
        try {
          List currentArray = (List) f.get(obj);

          if (currentArray != null) {
            currentArray.stream().forEach(o -> rdf(o));
          }
        } catch (IllegalAccessException e) {

        }

      } else {
        try {
          rdf(f.get(obj));
        } catch (IllegalAccessException e) {

        }
      }

    }

    return "";

  }


}
