package pt.dbpedia.org.lattes.professional;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("ATIVIDADES-DE-ENSINO")
public class MentoringExperience {

  @XStreamImplicit(itemFieldName = "ENSINO")
  private List<Teach> teach;
}
