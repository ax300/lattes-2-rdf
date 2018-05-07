package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import pt.dbpedia.org.lattes.Keyword;
import pt.dbpedia.org.lattes.KnowledgeArea;

import java.util.List;

public class RecruitEmployerPanel {

  @XStreamAlias("DADOS-BASICOS-DA-BANCA-JULGADORA-PARA-CONCURSO-PUBLICO")
  private PanelBasicData panelBasicData;

  @XStreamAlias("DETALHAMENTO-DA-BANCA-JULGADORA-PARA-CONCURSO-PUBLICO")
  private PanelDetail panelDetail;

  @XStreamImplicit(itemFieldName = "PARTICIPANTE-BANCA")
  private List<PanelMember> panelMembers;

  @XStreamAlias("AREAS-DO-CONHECIMENTO")
  private KnowledgeArea knowledgeArea;

  @XStreamAlias("PALAVRAS-CHAVE")
  private Keyword keyword;

  @XStreamImplicit(itemFieldName = "INFORMACOES-ADICIONAIS")
  private List<EmployerAdditionalInfo> employerAdditionalInfo;
}
