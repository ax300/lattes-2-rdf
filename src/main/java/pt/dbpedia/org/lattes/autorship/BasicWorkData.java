package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("DADOS-BASICOS-DO-TRABALHO")
public class BasicWorkData {

  @RDF(property = "http://lattes.org/ontology/production", print = false, value = false, id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @RDF(property = "http://www.w3.org/1999/02/22-rdf-syntax-ns#Class")
  private static final String type = "http://lattes.cnpq.br/ontology/Publication";

  @XStreamAsAttribute
  @XStreamAlias("IDIOMA")
  private String language;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
  private String isSciencePublication;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-TRABALHO-INGLES")
  private String enTitle;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-RELEVANCIA")
  private String isRelevant;

  @XStreamAsAttribute
  @XStreamAlias("HOME-PAGE-DO-TRABALHO")
  private String homePage;

  @XStreamAsAttribute
  @XStreamAlias("MEIO-DE-DIVULGACAO")
  private String mediaType;

  @XStreamAsAttribute
  @XStreamAlias("PAIS-DO-EVENTO")
  private String country;

  @RDF(property = "http://purl.org/dc/elements/1.1/date")
  @XStreamAsAttribute
  @XStreamAlias("ANO-DO-TRABALHO")
  private String year;

  @RDF(property = "http://purl.org/dc/elements/1.1/title")
  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-TRABALHO")
  private String title;

  @XStreamAsAttribute
  @XStreamAlias("NATURE")
  private String nature;



}


