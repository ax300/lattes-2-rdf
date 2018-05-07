package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import pt.dbpedia.org.lattes.Keyword;
import pt.dbpedia.org.lattes.KnowledgeArea;

import java.util.List;

@XStreamAlias("PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
public class QualificationPanel {

  @XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
  private PanelBasicData panelBasicData;

  @XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
  private PanelDetail panelDetail;

  @XStreamImplicit(itemFieldName = "PARTICIPANTE-BANCA")
  private List<PanelMember> panelMembers;

  @XStreamAlias("PALAVRAS-CHAVE")
  private Keyword keyword;

  @XStreamAlias("AREAS-DO-CONHECIMENTO")
  private KnowledgeArea knowledgeArea;
}
