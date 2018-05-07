package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
public class BasicOtherPublicationData {

  @XStreamAsAttribute
  @XStreamAlias("IDIOMA")
  private String language;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
  private String isScienceEvent;

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
  @XStreamAlias("PAIS-DE-PUBLICACAO")
  private String country;

  @XStreamAsAttribute
  @XStreamAlias("NATUREZA-INGLES")
  private String enNature;

  @XStreamAsAttribute
  @XStreamAlias("ANO")
  private String year;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-INGLES")
  private String enTitle;

  @XStreamAsAttribute
  @XStreamAlias("TITULO")
  private String title;
}
