package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XStreamAlias("PRODUCAO-TECNICA")
public class TechnicalProduction {

  @XStreamImplicit(itemFieldName = "SOFTWARE")
  private List<Software> software;

  @XStreamImplicit(itemFieldName = "TRABALHO-TECNICO")
  private List<TechnicalWork> technicalWorks;

  @XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-TECNICA")
  private OtherTechnicalProduction otherTechnicalProduction;
}
