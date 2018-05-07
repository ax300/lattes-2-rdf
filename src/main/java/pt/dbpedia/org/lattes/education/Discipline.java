package pt.dbpedia.org.lattes.education;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("ENSINO")
public class Discipline {

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-ORGAO")
  private String universityDepartamentCode;

  @XStreamAsAttribute
  @XStreamAlias("NOME-ORGAO")
  private String universityDepartament;

  @XStreamAsAttribute
  @XStreamAlias("NOME-CURSO-INGLES")
  private String englishCourseName;

  @XStreamAsAttribute
  @XStreamAlias("NOME-CURSO")
  private String courseName;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-CURSO")
  private String courseCode;

  @XStreamAsAttribute
  @XStreamAlias("ANO-FIM")
  private String endYear;

  @XStreamAsAttribute
  @XStreamAlias("MES-FIM")
  private String endMonth;

  @XStreamAsAttribute
  @XStreamAlias("MES-INICIO")
  private String startMonth;

  @XStreamAsAttribute
  @XStreamAlias("ANO-INICIO")
  private String startYear;

  @XStreamAsAttribute
  @XStreamAlias("TIPO-ENSINO")
  private String type;

  @XStreamAsAttribute
  @XStreamAlias("SEQUENCIA-FUNCAO-ATIVIDADE")
  private String sequence;
}
