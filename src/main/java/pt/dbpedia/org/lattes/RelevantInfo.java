package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("OUTRAS-INFORMACOES-RELEVANTES")
public class RelevantInfo {

  @XStreamAsAttribute
  @XStreamAlias("OUTRAS-INFORMACOES-RELEVANTES")
  private String relevantInfo;
}
