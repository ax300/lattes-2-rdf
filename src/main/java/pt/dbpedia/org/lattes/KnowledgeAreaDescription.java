package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KnowledgeAreaDescription {

  @XStreamAsAttribute
  @XStreamAlias("NOME-GRANDE-AREA-DO-CONHECIMENTO")
  private String knowledgeArea;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DA-AREA-DO-CONHECIMENTO")
  private String knowledgeAreaName;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DA-SUB-AREA-DO-CONHECIMENTO")
  private String knowledgeSubArea;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DA-ESPECIALIDADE")
  private String knowledgeSubAreaName;
}
