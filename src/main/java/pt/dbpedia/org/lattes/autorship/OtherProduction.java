package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("OUTRA-PRODUCAO")
public class OtherProduction {

  @XStreamAlias("ORIENTACOES-CONCLUIDAS")
  private FinishedMentoring finishedMentoring;
}
