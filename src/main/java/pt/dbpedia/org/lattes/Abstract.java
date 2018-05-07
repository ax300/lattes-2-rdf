package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("RESUMO-CV")
public class Abstract {

  @XStreamAsAttribute
  @XStreamAlias("TEXTO-RESUMO-CV-RH")
  private String abstractCV;

  @XStreamAsAttribute
  @XStreamAlias("TEXTO-RESUMO-CV-RH-EN")
  private String enAbstractCV;
}
