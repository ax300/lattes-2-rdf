package pt.dbpedia.org.lattes.autorship;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TechnicalWorkInfo {

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-DE-PAGINAS")
  private String numberOfPages;

  @XStreamAsAttribute
  @XStreamAlias("FINALIDADE-INGLES")
  private String enObjective;

  @XStreamAsAttribute
  @XStreamAlias("INSTITUICAO-FINANCIADORA")
  private String financialSupporter;

  @XStreamAsAttribute
  @XStreamAlias("DISPONIBILIDADE")
  private String availability;

  @XStreamAsAttribute
  @XStreamAlias("FINALIDADE")
  private String objective;

  @XStreamAsAttribute
  @XStreamAlias("CIDADE-DO-TRABALHO")
  private String city;

  @XStreamAsAttribute
  @XStreamAlias("DURACAO-EM-MESES")
  private String duration;

}
