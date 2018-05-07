package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("AREAS-DO-CONHECIMENTO")
public class KnowledgeArea {

  @XStreamAlias("AREA-DO-CONHECIMENTO-1")
  private KnowledgeAreaDescription knowledgeAreaDescription1;

  @XStreamAlias("AREA-DO-CONHECIMENTO-2")
  private KnowledgeAreaDescription knowledgeAreaDescription2;

  @XStreamAlias("AREA-DO-CONHECIMENTO-3")
  private KnowledgeAreaDescription knowledgeAreaDescription3;
}
