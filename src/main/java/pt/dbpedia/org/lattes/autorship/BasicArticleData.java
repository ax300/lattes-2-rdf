package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("DADOS-BASICOS-DO-ARTIGO")
public class BasicArticleData {

  @RDF(property = "http://lattes.org/ontology/production", print = false, value = false, id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @XStreamAsAttribute
  @XStreamAlias("IDIOMA")
  private String language;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
  private String isSciencePublication;

  @RDF(property = "http://purl.org/ontology/bibo/doi", value = false, base = "https://doi.org/", id = false, strategy = RDFKeyStrategy.URL)
  @XStreamAsAttribute
  @XStreamAlias("DOI")
  private String doi;


  @RDF(property = "http://www.w3.org/1999/02/22-rdf-syntax-ns#Class")
  private static final String type = "http://lattes.cnpq.br/ontology/Publication";

  @XStreamAsAttribute
  @XStreamAlias("HOME-PAGE-DO-TRABALHO")
  private String homePage;

  @XStreamAsAttribute
  @XStreamAlias("MEIO-DE-DIVULGACAO")
  private String mediaType;

  @XStreamAsAttribute
  @XStreamAlias("NATUREZA")
  private String origin;

  @RDF(property = "http://purl.org/dc/elements/1.1/title", language="en")
  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-ARTIGO-INGLES")
  private String enTitle;

  @XStreamAsAttribute
  @XStreamAlias("PAIS-DE-PUBLICACAO")
  private String publicationCountry;

  @RDF(property = "http://purl.org/dc/elements/1.1/date")
  @XStreamAsAttribute
  @XStreamAlias("ANO-DO-ARTIGO")
  private String publicationYear;

  @RDF(property = "http://purl.org/dc/elements/1.1/title")
  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-ARTIGO")
  private String publicationTitle;

}
