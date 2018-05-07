package pt.dbpedia.org.lattes.research;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("PESQUISA-E-DESENVOLVIMENTO")
public class Research {

  @XStreamImplicit(itemFieldName = "LINHA-DE-PESQUISA")
  private List<ResearchArea> researchAreas;
}
