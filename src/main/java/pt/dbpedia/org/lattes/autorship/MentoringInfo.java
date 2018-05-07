package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MentoringInfo {

  @XStreamAsAttribute
  @XStreamAlias("NOME-ORGAO")
  private String departamentName;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-ORGAO")
  private String departamentId;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-AGENCIA-FINANCIADORA")
  private String financialAgencySupportCode;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-BOLSA")
  private String isScholarShip;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-CURSO")
  private String courseCode;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO")
  private String universityCode;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-DE-PAGINAS")
  private String pageNumber;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DO-CURSO-INGLES")
  private String enCourseName;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-ID-ORIENTADO")
  private String id;

  @XStreamAsAttribute
  @XStreamAlias("TIPO-DE-ORIENTACAO")
  private String type;

}
