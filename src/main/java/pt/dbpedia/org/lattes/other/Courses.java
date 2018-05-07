package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("INFORMACOES-ADICIONAIS-CURSOS")
public class Courses {

  @XStreamImplicit(itemFieldName = "INFORMACAO-ADICIONAL-CURSO")
  private List<CourseInfo> courseInfos;

}
