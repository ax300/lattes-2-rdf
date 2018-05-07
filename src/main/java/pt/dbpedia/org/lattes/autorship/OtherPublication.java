package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;
import pt.dbpedia.org.lattes.Keyword;
import pt.dbpedia.org.lattes.KnowledgeArea;
import pt.dbpedia.org.lattes.Sector;

import java.util.List;

@Getter
@Setter
@XStreamAlias("OUTRA-PRODUCAO-BIBLIOGRAFICA")
public class OtherPublication {

  @XStreamAlias("DADOS-BASICOS-DE-OUTRA-PRODUCAO")
  private BasicOtherPublicationData basicOtherPublicationData;

  @XStreamAlias("DETALHAMENTO-DE-OUTRA-PRODUCAO")
  private OtherPublicationInfo otherPublicationInfo;

  @XStreamImplicit(itemFieldName = "AUTORES")
  private List<AuthorOtherPublication> authors;

  @XStreamAlias("PALAVRAS-CHAVE")
  private Keyword keyword;

  @XStreamAlias("AREAS-DO-CONHECIMENTO")
  private KnowledgeArea knowledgeArea;

  @XStreamAlias("SETORES-DE-ATIVIDADE")
  private List<Sector> sectors;

  @XStreamAlias("INFORMACOES-ADICIONAIS")
  private AditionalInfo aditionalInfo;
}
