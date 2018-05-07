package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("PARTICIPACAO-EM-BANCA-JULGADORA")
public class RecruitmentProcess {

  @XStreamImplicit(itemFieldName = "BANCA-JULGADORA-PARA-PROFESSOR-TITULAR")
  private List<RecruitProfessorPanel> recruitProfessorPanel;

  @XStreamImplicit(itemFieldName = "BANCA-JULGADORA-PARA-CONCURSO-PUBLICO")
  private List<RecruitEmployerPanel> recruitEmployerPanel;

  @XStreamImplicit(itemFieldName = "BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
  private List<RecruitTeacherPanel> recruitTeacherPanels;

  @XStreamImplicit(itemFieldName = "OUTRAS-BANCAS-JULGADORAS")
  private List<RecruitOtherPanel> recruitOtherPanels;
}
