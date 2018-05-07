package pt.dbpedia.org.lattes.professional;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("ATIVIDADES-DE-CONSELHO-COMISSAO-E-CONSULTORIA")
public class ConsultantExperience {

  @XStreamImplicit(itemFieldName = "CONSELHO-COMISSAO-E-CONSULTORIA")
  private List<Consultant> consultants;
}
