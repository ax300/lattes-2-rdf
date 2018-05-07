package pt.dbpedia.org.lattes.education;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import pt.dbpedia.org.lattes.KnowledgeArea;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("MESTRADO")
public class MsDegree {

  @RDF(property = "http://rdfs.org/resume-rdf/#term_hasEducation", id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @XStreamAsAttribute
  @XStreamAlias("SEQUENCIA-FORMACAO")
  private String sequence;

  @XStreamAsAttribute
  @XStreamAlias("NIVEL")
  private String nivel;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO")
  private String universityCode;

  @RDF(property = "http://vivoweb.org/ontology/core#University")
  @XStreamAsAttribute
  @XStreamAlias("NOME-INSTITUICAO")
  private String universityName;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-ORGAO")
  private String siteUnit;

  @XStreamAsAttribute
  @XStreamAlias("NOME-ORGAO")
  private String siteName;

  @RDF(property = "http://purl.org/ontology/bibo/degree", id = false, strategy = RDFKeyStrategy.URL)
  private static final String degree = "http://purl.org/ontology/bibo/degrees/ms";

  @RDF(property = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
  private static final String type = "http://lattes.cnpq.br/ontology/AcademicDegree";


  @XStreamAsAttribute
  @XStreamAlias("CODIGO-CURSO")
  private String courseCode;

  @RDF(property = "http://vivoweb.org/ontology/core#Course")
  @XStreamAsAttribute
  @XStreamAlias("NOME-CURSO")
  private String courseName;

  @XStreamAsAttribute
  @XStreamAlias("STATUS-DO-CURSO")
  private String courseStatus;

  @RDF(property = "http://rdfs.org/resume-rdf/cv.rdfs#eduStartDate")
  @XStreamAsAttribute
  @XStreamAlias("ANO-DE-INICIO")
  private String startYear;

  @RDF(property = "http://purl.org/dc/terms/issued")
  @XStreamAsAttribute
  @XStreamAlias("ANO-DE-CONCLUSAO")
  private String endYear;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-BOLSA")
  private String scholarship;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-AGENCIA-FINANCIADORA")
  private String fundingAgencyCode;

  @XStreamAsAttribute
  @XStreamAlias("NOME-AGENCIA")
  private String fundingAgencyName;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-ID-ORIENTADOR")
  private String supervisorId;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-CURSO-CAPES")
  private String capesId;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO-INGLES")
  private String enTesisName;

  @XStreamAsAttribute
  @XStreamAlias("NOME-CURSO-INGLES")
  private String enCourseName;

  @XStreamAsAttribute
  @XStreamAlias("FORMACAO-ACADEMICA-TITULACAO")
  private String academicTitle;

  @XStreamAsAttribute
  @XStreamAlias("TIPO-GRADUACAO")
  private String bsType;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-GRAD")
  private String universitySupervisorCode;

  @XStreamAsAttribute
  @XStreamAlias("NOME-INSTITUICAO-GRAD")
  private String universitySupervisorName;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-OUTRA-GRAD")
  private String universitySupervisorCode1;

  @XStreamAsAttribute
  @XStreamAlias("NOME-INSTITUICAO-OUTRA-GRAD")
  private String universitySupervisorName1;

  @XStreamAsAttribute
  @XStreamAlias("NOME-ORIENTADOR-GRAD")
  private String supervisorName;

  @XStreamAlias("AREAS-DO-CONHECIMENTO")
  private KnowledgeArea knowledgeArea;
}
