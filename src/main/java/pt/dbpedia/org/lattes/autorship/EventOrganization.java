package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;
import pt.dbpedia.org.lattes.KnowledgeArea;

import java.util.List;

@Getter
@Setter
@XStreamAlias("ORGANIZACAO-DE-EVENTO")
public class EventOrganization {

  @XStreamAlias("DADOS-BASICOS-DA-ORGANIZACAO-DE-EVENTO")
  private EventOrganizationBasicData eventOrganizationBasicData;

  @XStreamAlias("DETALHAMENTO-DA-ORGANIZACAO-DE-EVENTO")
  private EventOrganizationInfo eventOrganizationInfo;

  @XStreamImplicit(itemFieldName = "AUTORES")
  private List<AuthorEvent> authors;

  @XStreamAlias("AREAS-DO-CONHECIMENTO")
  private KnowledgeArea knowledgeArea;
}
