package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
@XStreamAlias("DETALHAMENTO-DO-ARTIGO")
public class ArticleInfo {


  @RDF(property = "http://www.w3.org/2002/07/owl#sameAs", value = false, secondary= true, print=false, id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @RDF(property =  "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
  private static final String type = "http://lattes.org/ontology/JournalArticle";

  @RDF(property = "http://purl.org/ontology/bibo/issn", value = false, base = "http://road.issn.org/issn_search?afs:query=", id = false, strategy = RDFKeyStrategy.URL)
  @XStreamAsAttribute
  @XStreamAlias("ISSN")
  private String issn;

  @RDF(property = "http://purl.org/ontology/bibo/pageEnd")
  @XStreamAsAttribute
  @XStreamAlias("ANO-DO-ARTIGO")
  private String endPage;

  @RDF(property = "http://purl.org/ontology/bibo/pageStart")
  @XStreamAsAttribute
  @XStreamAlias("PAGINA-INICIAL")
  private String startPage;

  @RDF(property = "http://lattes.org/ontology/Serie")
  @XStreamAsAttribute
  @XStreamAlias("SERIE")
  private String serie;

  @RDF(property = "http://lattes.org/ontology/Fascicle")
  @XStreamAsAttribute
  @XStreamAlias("FASCICULO")
  private String sheave;

  @RDF(property = "http://purl.org/ontology/bibo/volume")
  @XStreamAsAttribute
  @XStreamAlias("VOLUME")
  private String volume;

  @XStreamAsAttribute
  @XStreamAlias("LOCAL-DE-PUBLICACAO")
  private String publicationCountry;

  @RDF(property = "http://purl.org/ontology/bibo/Periodical")
  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-PERIODICO-OU-REVISTA")
  private String publicationTitle;

}
