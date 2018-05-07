package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PanelBasicData {


  @XStreamAsAttribute
  @XStreamAlias("CODIGO-CURSO")
  private String homePage;
}
