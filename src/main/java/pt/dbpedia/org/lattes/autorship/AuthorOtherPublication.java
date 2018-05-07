package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;

@Getter
@Setter
public class AuthorOtherPublication {

  @XStreamAsAttribute
  @XStreamAlias("NRO-ID-CNPQ")
  private String cnpqId;

  @XStreamAsAttribute
  @XStreamAlias("ORDEM-DE-AUTORIA")
  private String order;

  @XStreamAsAttribute
  @XStreamAlias("NOME-PARA-CITACAO")
  private String citationName;

  @XStreamAsAttribute
  @XStreamAlias("NOME-COMPLETO-DO-AUTOR")
  private String fullName;

}
