package pt.dbpedia.org.lattes.research;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("ATIVIDADES-DE-PESQUISA-E-DESENVOLVIMENTO")
public class ResearchExperience {


  @XStreamImplicit(itemFieldName = "PESQUISA-E-DESENVOLVIMENTO")
  private List<Research> research;
}
