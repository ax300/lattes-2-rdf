package pt.dbpedia.org.lattes.education;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import pt.dbpedia.org.lattes.Keyword;
import pt.dbpedia.org.lattes.KnowledgeArea;
import pt.dbpedia.org.lattes.Sector;
import rdf.RDF;
import rdf.RDFKeyStrategy;

import java.util.List;

@Getter
@Setter
@XStreamAlias("DOUTORADO")
public class PHDDegree {

  @RDF(property = "http://rdfs.org/resume-rdf/#term_hasEducation", id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @RDF(property = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
  private static final String type = "http://lattes.cnpq.br/ontology/AcademicDegree";

  @XStreamAsAttribute
  @XStreamAlias("SEQUENCIA-FORMACAO")
  private String sequence;

  //@RDF(property = "http://vivoweb.org/ontology/core#AcademicDegree")
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
  private static final String degree = "http://purl.org/ontology/bibo/degrees/phd";

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-CURSO")
  private String courseCode;

  @RDF(property = "http://vivoweb.org/ontology/core#Course")
  @XStreamAsAttribute
  @XStreamAlias("NOME-CURSO")
  private String courseName;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-AREA-CURSO")
  private String courseCodeArea;

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
  @XStreamAlias("ANO-DE-OBTENCAO-DO-TITULO")
  private String doctorDegreeYear;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-DA-DISSERTACAO-TESE")
  private String tesisTitle;

  @XStreamAsAttribute
  @XStreamAlias("NOME-COMPLETO-DO-ORIENTADOR")
  private String mentorName;

  @XStreamAsAttribute
  @XStreamAlias("TIPO-DOUTORADO")
  private String courseType;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-DOUT")
  private String universityDsCode;

  @XStreamAsAttribute
  @XStreamAlias("NOME-INSTITUICAO-DOUT")
  private String universityDsName;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-OUTRA-DOUT")
  private String universityDsAliasCode;

  @XStreamAsAttribute
  @XStreamAlias("NOME-INSTITUICAO-OUTRA-DOUT")
  private String universityDsAliasName;

  @XStreamAsAttribute
  @XStreamAlias("NOME-ORIENTADOR-DOUT")
  private String mentorDsName;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-ID-ORIENTADOR")
  private String mentorDsCode;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-CURSO-CAPES")
  private String capesCourseId;

  @XStreamAsAttribute
  @XStreamAlias("TITULO-DA-DISSERTACAO-TESE-INGLES")
  private String enTesisTitle;

  @XStreamAsAttribute
  @XStreamAlias("NOME-CURSO-INGLES")
  private String enCourseTitle;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DO-ORIENTADOR-CO-TUTELA")
  private String coMentorName;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-OUTRA-CO-TUTELA")
  private String coMentorUniversityCode;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-CO-TUTELA")
  private String coMentorUniversityCodeTutor;


  @XStreamAsAttribute
  @XStreamAlias("NOME-DO-ORIENTADOR-SANDUICHE")
  private String mentorNameSplitSite;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-OUTRA-SANDUICHE")
  private String universityCodeSplitSite;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-SANDUICHE")
  private String otherUniversityCodeSplitSite;

  @XStreamAsAttribute
  @XStreamAlias("CODIGO-INSTITUICAO-SANDUICHE")
  private String codeSplitSite;

  @XStreamAsAttribute
  @XStreamAlias("NOME-DO-CO-ORIENTADOR")
  private String coMentorNameSplitSite;

  @XStreamAlias("PALAVRAS-CHAVE")
  private List<Keyword> keywords;

  @XStreamAlias("SETORES-DE-ATIVIDADE")
  private List<Sector> sectors;

  @XStreamAlias("AREAS-DO-CONHECIMENTO")
  private KnowledgeArea knowledgeArea;
}
