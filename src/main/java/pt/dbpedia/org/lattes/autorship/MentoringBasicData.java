package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MentoringBasicData {

  @XStreamAsAttribute
  @XStreamAlias("HOME-PAGE")
  private String homePage;

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
  @XStreamAlias("FLAG_RELEVANCIA")
  private String isRelevant;

  @XStreamAsAttribute
  @XStreamAlias("NATUREZA")
  private String nature;

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
