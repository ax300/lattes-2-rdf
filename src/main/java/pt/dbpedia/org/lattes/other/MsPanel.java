package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;
import pt.dbpedia.org.lattes.Keyword;
import pt.dbpedia.org.lattes.KnowledgeArea;

import java.util.List;

@Getter
@Setter
@XStreamAlias("PARTICIPACAO-EM-BANCA-DE-MESTRADO")
public class MsPanel {

  @XStreamAlias("DADOS-BASICOS-DA-PARTICIPACAO-EM-BANCA-DE-MESTRADO")
  private PanelBasicData panelBasicData;

  @XStreamAlias("DETALHAMENTO-DA-PARTICIPACAO-EM-BANCA-DE-MESTRADO")
  private PanelDetail panelDetail;

  @XStreamImplicit(itemFieldName = "PARTICIPANTE-BANCA")
  private List<PanelMember> panelMembers;

  @XStreamAlias("PALAVRAS-CHAVE")
  private Keyword keyword;

  @XStreamAlias("AREAS-DO-CONHECIMENTO")
  private KnowledgeArea knowledgeArea;
}
