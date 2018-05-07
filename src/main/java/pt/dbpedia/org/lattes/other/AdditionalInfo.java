package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("DADOS-COMPLEMENTARES")
public class AdditionalInfo {

  @XStreamAlias("PARTICIPACAO-EM-BANCA-TRABALHOS-CONCLUSAO")
  private Panel panel;

  @XStreamAlias("PARTICIPACAO-EM-BANCA-JULGADORA")
  private RecruitmentProcess recruitmentProcess;

  @XStreamAlias("INFORMACOES-ADICIONAIS-INSTITUICOES")
  private Institutions institutions;

  @XStreamAlias("INFORMACOES-ADICIONAIS-CURSOS")
  private Courses courses;
}
