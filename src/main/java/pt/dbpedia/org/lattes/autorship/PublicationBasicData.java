package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("DADOS-BASICOS-DE-EDITORACAO")
public class PublicationBasicData {

  @XStreamAsAttribute
  @XStreamAlias("PAIS")
  private String country;

  @XStreamAsAttribute
  @XStreamAlias("IDIOMA")
  private String language;

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
  @XStreamAlias("NATUREZA")
  private String nature;

  @XStreamAsAttribute
  @XStreamAlias("ANO")
  private String year;

  @XStreamAsAttribute
  @XStreamAlias("TITULO")
  private String title;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-INGLES")
  private String enTitle;

}
