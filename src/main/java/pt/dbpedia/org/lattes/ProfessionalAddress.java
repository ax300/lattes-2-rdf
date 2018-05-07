package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("ENDERECO-PROFISSIONAL")
public class ProfessionalAddress {

  @RDF(property = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
  private static final String type = "http://rdfs.org/resume-rdf/Organization";

  @RDF(property = "http://www.w3.org/2006/vcard/ns#Work", id = true, strategy = RDFKeyStrategy.URL)
  private String idAddress;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-EMPRESA")
  private String id;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-ORGAO")
  private String subsidiaryId;

  @RDF(property = "http://www.w3.org/2006/vcard/ns#organization-name")
  @XStreamAsAttribute
  @XStreamAlias("NOME-INSTITUICAO-EMPRESA")
  private String company;

  @RDF(property = "http://www.w3.org/2006/vcard/ns#organization-unit")
  @XStreamAsAttribute
  @XStreamAlias("NOME-ORGAO")
  private String subsidiaryName;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-UNIDADE")
  private String departamentId;

  @RDF(property = "http://vivoweb.org/ontology/core#Department")
  @XStreamAsAttribute
  @XStreamAlias("NOME-UNIDADE")
  private String departamentName;

  @RDF(property = "http://vivoweb.org/ontology/core#address1")
  @XStreamAsAttribute
  @XStreamAlias("LOGRADOURO-COMPLEMENTO")
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
