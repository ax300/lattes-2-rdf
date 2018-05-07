package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
public class AuthorBook {

  @RDF(property = "http://lattes.cnpq.br/ontology/author", value = false, base = "http://lattes.cnpq.br/", strategy = RDFKeyStrategy.URL)
  @XStreamAsAttribute
  @XStreamAlias("NRO-ID-CNPQ")
  private String cnpqId;

  @XStreamAsAttribute
  @XStreamAlias("ORDEM-DE-AUTORIA")
  private String order;

  @RDF(property = "http://xmlns.com/foaf/0.1/citationName")
  @XStreamAsAttribute
  @XStreamAlias("NOME-PARA-CITACAO")
  private String citationName;

  @XStreamAsAttribute
  @XStreamAlias("NOME-COMPLETO-DO-AUTOR")
  private String fullName;

}
