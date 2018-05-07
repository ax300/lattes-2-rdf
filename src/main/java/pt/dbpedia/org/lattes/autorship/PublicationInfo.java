package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicationInfo {

  @XStreamAsAttribute
  @XStreamAlias("CIDADE")
  private String city;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-DE-PAGINAS")
  private String numberOfPages;

  @XStreamAsAttribute
  @XStreamAlias("EDITORA")
  private String editor;

  @XStreamAsAttribute
  @XStreamAlias("INSTIUICAO-PROMOTORA")
  private String promotedBy;
}
