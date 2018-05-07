package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;
import pt.dbpedia.org.lattes.Keyword;
import pt.dbpedia.org.lattes.KnowledgeArea;
import pt.dbpedia.org.lattes.Sector;

import java.util.List;

@Getter
@Setter
@XStreamAlias("ARTIGO-PUBLICADO")
public class Article {

  @XStreamAlias("DADOS-BASICOS-DO-ARTIGO")
  private BasicArticleData basicArticleData;

  @XStreamAlias("PALAVRAS-CHAVE")
  private Keyword keyword;

  @XStreamAlias("AREAS-DO-CONHECIMENTO")
  private KnowledgeArea knowledgeArea;

  @XStreamAlias("SETORES-DE-ATIVIDADE")
  private List<Sector> sectors;

  @XStreamAlias("INFORMACOES-ADICIONAIS")
  private AditionalInfo aditionalInfo;

  @XStreamAsAttribute
  @XStreamAlias("SEQUENCIA-PRODUCAO")
  private String sequenceID;

  @XStreamAsAttribute
  @XStreamAlias("ORDEM-IMPORTANCIA")
  private String order;

  @XStreamImplicit(itemFieldName = "AUTORES")
  private List<AuthorArticle> authors;


  @XStreamAlias("DETALHAMENTO-DO-ARTIGO")
  private ArticleInfo articleInfo;



}
