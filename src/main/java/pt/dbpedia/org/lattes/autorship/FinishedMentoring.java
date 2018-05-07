package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XStreamAlias("ORIENTACOES-CONCLUIDAS")
public class FinishedMentoring {

  @XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS-PARA-MESTRADO")
  private List<MasterMentoring> masterMentorings;


  @XStreamImplicit(itemFieldName = "ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO")
  private List<DoctorMentoring> doctorMentoring;
}
