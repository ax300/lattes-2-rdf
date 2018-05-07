package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OtherPublicationInfo {

  @XStreamAsAttribute
  @XStreamAlias("CIDADE-DA-EDITORA")
  private String editorCity;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-DE-PAGINAS")
  private String numberOfPages;

  @XStreamAsAttribute
  @XStreamAlias("ISSN-ISBN")
  private String isbn;

  @XStreamAsAttribute
  @XStreamAlias("EDITORA")
  private String editorName;
}
