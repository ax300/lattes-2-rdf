package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("DADOS-BASICOS-DO-SOFTWARE")
public class SoftwareBasicData {

  @XStreamAsAttribute
  @XStreamAlias("PAIS")
  private String country;

  @XStreamAsAttribute
  @XStreamAlias("IDIOMA")
  private String language;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-DIVULGACAO-CIENTIFICA")
  private String isSciencePublication;

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
  @XStreamAlias("FLAG-POTENCIAL-INOVACAO")
  private String isInovativeSoftware;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-SOFTWARE-INGLES")
  private String enSoftwareTitle;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-SOFTWARE")
  private String softwareTitle;

}
