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
@XStreamAlias("EDITORACAO")
public class Publication {

  @XStreamAlias("DADOS-BASICOS-DE-EDITORACAO")
  private PublicationBasicData publicationBasicData;

  @XStreamAlias("DETALHAMENTO-DE-EDITORACAO")
  private PublicationInfo publicationInfo;

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

