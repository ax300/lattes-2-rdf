package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("ENDERECO-RESIDENCIAL")
public class HomeAddress {

  @RDF(property = "http://www.w3.org/2006/vcard/ns#Home", id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @RDF(property = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
  private static final String type = "http://lattes.cnpq.br/ontology/Address";

  @RDF(property = "http://vivoweb.org/ontology/core#address1")
  @XStreamAsAttribute
  @XStreamAlias("LOGRADOURO")
  private String address;

  @RDF(property = "http://vivoweb.org/ontology/core#addressCountry")
  @XStreamAsAttribute
  @XStreamAlias("PAIS")
  private String country;

  @RDF(property = "http://vivoweb.org/ontology/core#addressState")
  @XStreamAsAttribute
  @XStreamAlias("UF")
  private String province;

  @RDF(property = "http://vivoweb.org/ontology/core#addressPostalCode")
  @XStreamAsAttribute
  @XStreamAlias("CEP")
  private String postalCode;

  @RDF(property = "http://vivoweb.org/ontology/core#addressCity")
  @XStreamAsAttribute
  @XStreamAlias("CIDADE")
  private String city;

  @RDF(property = "http://vivoweb.org/ontology/core#address2")
  @XStreamAsAttribute
  @XStreamAlias("BAIRRO")
  private String district;

  @XStreamAsAttribute
  @XStreamAlias("DDD")
  private String longDistanceCode;

  @XStreamAsAttribute
  @XStreamAlias("TELEFONE")
  private String phoneNumber;

  @XStreamAsAttribute
  @XStreamAlias("RAMAL")
  private String branchLine;

  @XStreamAsAttribute
  @XStreamAlias("FAX")
  private String fax;

  @XStreamAsAttribute
  @XStreamAlias("CAIXA-POSTAL")
  private String mailBox;

  @XStreamAsAttribute
  @XStreamAlias("HOME-PAGE")
  private String homePage;
}
