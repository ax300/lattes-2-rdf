package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import pt.dbpedia.org.lattes.award.Award;
import pt.dbpedia.org.lattes.education.Education;
import pt.dbpedia.org.lattes.professional.ExpertiseArea;
import rdf.RDF;

import java.util.List;

@Getter
@Setter
@XStreamAlias("DADOS-GERAIS")
public class GeneralData {

  @RDF(property = "http://xmlns.com/foaf/0.1/name")
  @XStreamAsAttribute
  @XStreamAlias("NOME-COMPLETO")
  private String fullName;


  @RDF(property = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
  private static final String type = "http://lattes.cnpq.br/ontology/Lattes";

  @XStreamAsAttribute
  @XStreamAlias("NOME-EM-CITACOES-BIBLIOGRAFICAS")
  private String abbreviatedName;

  @RDF(property = "http://rdfs.org/resume-rdf/cv.rdfs#hasNationality")
  @XStreamAsAttribute
  @XStreamAlias("NACIONALIDADE")
  private String nationality;

  @XStreamAsAttribute
  @XStreamAlias("PAIS-DE-NASCIMENTO")
  private String birthdayCountry;

  @XStreamAsAttribute
  @XStreamAlias("UF-NASCIMENTO")
  private String province;

  @RDF(property = "http://rdfs.org/resume-rdf/cv.rdfs#birthPlace")
  @XStreamAsAttribute
  @XStreamAlias("CIDADE-NASCIMENTO")
  private String city;

  @XStreamAsAttribute
  @XStreamAlias("SIGLA-PAIS-NACIONALIDADE")
  private String abbreviatedCountry;

  @XStreamAsAttribute
  @XStreamAlias("PAIS-DE-NACIONALIDADE")
  private String countryOfnationality;

  @XStreamAlias("RESUMO-CV")
  private Abstract abstractCV;

  @XStreamAlias("OUTRAS-INFORMACOES-RELEVANTES")
  private RelevantInfo relevantInfo;

  @XStreamAlias("ENDERECO")
  private Address address;

  @XStreamAlias("FORMACAO-ACADEMICA-TITULACAO")
  private Education education;

  @XStreamAlias("ATUACOES-PROFISSIONAIS")
  private List<ProfessionalExperience> professionalExperience;

  @XStreamAlias("AREAS-DE-ATUACAO")
  private List<ExpertiseArea> expertiseAreas;

  @XStreamAlias("IDIOMAS")
  private List<Language> language;

  @XStreamAlias("PREMIOS-TITULOS")
  private List<Award> awards;

}


