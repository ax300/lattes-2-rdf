package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("SETORES-DE-ATIVIDADE")
public class Sector {

  @XStreamAsAttribute
  @XStreamAlias("SETOR-DE-ATIVIDADE-1")
  private String sector1;

  @XStreamAsAttribute
  @XStreamAlias("SETOR-DE-ATIVIDADE-2")
  private String sector2;


  @XStreamAsAttribute
  @XStreamAlias("SETOR-DE-ATIVIDADE-3")
  private String sector3;
}
