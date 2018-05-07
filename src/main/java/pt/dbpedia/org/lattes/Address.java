package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("ENDERECO")
public class Address {

  @XStreamAlias("ENDERECO-PROFISSIONAL")
  private ProfessionalAddress professionalAddress;

  @XStreamAlias("ENDERECO-RESIDENCIAL")
  private HomeAddress homeAddress;
}
