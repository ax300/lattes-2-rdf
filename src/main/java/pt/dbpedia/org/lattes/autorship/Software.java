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
@XStreamAlias("SOFTWARE")
public class Software {

  @XStreamAlias("DADOS-BASICOS-DO-SOFTWARE")
  private SoftwareBasicData softwareBasicData;

  @XStreamAlias("DETALHAMENTO-DO-SOFTWARE")
  private SoftwareInfo softwareInfo;

  @XStreamImplicit(itemFieldName = "AUTORES")
  private List<AuthorSoftware> authors;

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
  private String sequence;

}
