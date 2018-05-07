package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("DETALHAMENTO-DO-TRABALHO")
public class WorkInfo {

  @RDF(property = "http://www.w3.org/2002/07/owl#sameAs", secondary= true, value = false,  print=false, id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @RDF(property =  "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
  private static final String type = "http://lattes.org/ontology/ProceedingsArticle";

  @XStreamAsAttribute
  @XStreamAlias("NOME-DO-EVENTO-INGLES")
  private String enConferenceName;

  @XStreamAsAttribute
  @XStreamAlias("CIDADE-DA-EDITORA")
  private String editorCity;

  @RDF(property = "http://purl.org/dc/terms/publisher")
  @XStreamAsAttribute
  @XStreamAlias("NOME-DA-EDITORA")
  private String editorName;

  @RDF(property = "http://purl.org/ontology/bibo/isbn", value = false, base = "https://isbnsearch.org/isbn/", id = false, strategy = RDFKeyStrategy.URL)
  @XStreamAsAttribute
  @XStreamAlias("ISBN")
  private String isbn;

  @RDF(property = "http://purl.org/ontology/bibo/pageEnd")
  @XStreamAsAttribute
  @XStreamAlias("PAGINA-FINAL")
  private String endPage;

  @RDF(property = "http://purl.org/ontology/bibo/pageStart")
  @XStreamAsAttribute
  @XStreamAlias("PAGINA-INICIAL")
  private String startPage;

  @RDF(property = "http://lattes.org/ontology/Serie")
  @XStreamAsAttribute
  @XStreamAlias("SERIE")
  private String serie;

  @RDF(property = "http://lattes.org/ontology/Fascicle")
  @XStreamAsAttribute
  @XStreamAlias("FASCICULO")
  private String fascicle;

  @RDF(property = "http://purl.org/ontology/bibo/volume")
  @XStreamAsAttribute
  @XStreamAlias("VOLUME")
  private String volume;

  @RDF(property = "http://lattes.org/ontology/ProceedingsTitle")
  @XStreamAsAttribute
  @XStreamAlias("TITULO-DOS-ANAIS-OU-PROCEEDINGS")
  private String proceedingsTitle;

  @RDF(property = "http://lattes.org/ontology/ProceedingsYear")
  @XStreamAsAttribute
  @XStreamAlias("ANO-DE-REALIZACAO")
  private String year;

  @XStreamAsAttribute
  @XStreamAlias("CIDADE-DO-EVENTO")
  private String city;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DO-EVENTO")
  private String confereceName;

  @XStreamAsAttribute
  @XStreamAlias("CLASSIFICACAO-DO-EVENTO")
  private String conferenceClass;

}
