package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
public class BasicChapterData {

  @RDF(property = "http://lattes.org/ontology/production", value = false, print = false, id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @RDF(property = "http://www.w3.org/1999/02/22-rdf-syntax-ns#Class")
  private static final String type = "http://lattes.cnpq.br/ontology/Publication";


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
  @XStreamAlias("PAIS-DE-PUBLICACAO")
  private String publicationCountry;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-CAPITULO-DO-LIVRO-INGLES")
  private String englishTitle;

  @RDF(property = "http://purl.org/dc/terms/title")
  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-CAPITULO-DO-LIVRO")
  private String title;

  @RDF(property = "http://purl.org/dc/elements/1.1/date")
  @XStreamAsAttribute
  @XStreamAlias("ANO")
  private String year;







}
