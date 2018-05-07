package pt.dbpedia.org.lattes;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import pt.dbpedia.org.lattes.professional.AdminExperience;
import pt.dbpedia.org.lattes.professional.ConsultantExperience;
import pt.dbpedia.org.lattes.professional.Link;
import pt.dbpedia.org.lattes.professional.MentoringExperience;
import pt.dbpedia.org.lattes.research.ResearchExperience;

import java.util.List;


@XStreamAlias("ATUACAO-PROFISSIONAL")
public class ProfessionalExperience {

  @XStreamImplicit(itemFieldName = "VINCULOS")
  public List<Link> links;

  @XStreamAlias("ATIVIDADES-DE-DIRECAO-E-ADMINISTRACAO")
  private AdminExperience adminExperience;

  @XStreamAlias("ATIVIDADES-DE-PESQUISA-E-DESENVOLVIMENTO")
  private ResearchExperience researchExperience;

  @XStreamAlias("ATIVIDADES-DE-ENSINO")
  private MentoringExperience mentoringExperience;

  @XStreamAlias("ATIVIDADES-DE-CONSELHO-COMISSAO-E-CONSULTORIA")
  private ConsultantExperience consultantExperience;
}
