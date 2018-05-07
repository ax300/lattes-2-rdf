package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("INFORMACOES-ADICIONAIS")
public class AditionalInfo {


  @XStreamAsAttribute
  @XStreamAlias("DESCRICAO-INFORMACOES-ADICIONAIS-INGLES")
  private String englishDescription;


  @XStreamAsAttribute
  @XStreamAlias("DESCRICAO-INFORMACOES-ADICIONAIS")
  private String description;
}

