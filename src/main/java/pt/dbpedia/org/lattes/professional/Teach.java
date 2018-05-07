package pt.dbpedia.org.lattes.professional;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import pt.dbpedia.org.lattes.education.Discipline;

import java.util.List;

@XStreamAlias("ENSINO")
public class Teach {

  @XStreamImplicit(itemFieldName = "DISCIPLINA")
  private List<Discipline> disciplines;
}
