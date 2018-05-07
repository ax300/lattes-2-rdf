package pt.dbpedia.org.lattes.award;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("PREMIO-TITULO")
public class Award {

  @XStreamAsAttribute
  @XStreamAlias("NOME-DO-PRIMIO-OU-TITULO-INGLES")
  private String enAwardTitle;

  @XStreamAsAttribute
  @XStreamAlias("ANO-DA-PREMIACAO")
  private String year;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DA-ENTIDADE-PROMOTORA")
  private String entityName;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DO-PRIMIO-OU-TITULO")
  private String awardTitle;
}
