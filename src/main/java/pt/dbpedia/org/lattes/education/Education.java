package pt.dbpedia.org.lattes.education;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("FORMACAO-ACADEMICA-TITULACAO")
public class Education {

  @XStreamAlias("GRADUACAO")
  private BsDegree bsDegree;

  @XStreamAlias("MESTRADO")
  private MsDegree msDegree;

  @XStreamAlias("DOUTORADO")
  private PHDDegree phdDegree;
}
