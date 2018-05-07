package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("DETALHAMENTO-DO-SOFTWARE")
public class SoftwareInfo {

  @XStreamAsAttribute
  @XStreamAlias("FINALIDADE-INGLES")
  private String objective;

  @XStreamAsAttribute
  @XStreamAlias("INSTITUICAO-FINANCIADORA")
  private String financialSupporter;

  @XStreamAsAttribute
  @XStreamAlias("DISPONIBILIDADE")
  private String availability;

  @XStreamAsAttribute
  @XStreamAlias("AMBIENTE")
  private String environment;

  @XStreamAsAttribute
  @XStreamAlias("FINALIDADE")
  private String applicability;

  @XStreamAsAttribute
  @XStreamAlias("PLATAFORMA")
  private String systemOperational;
}
