package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import pt.dbpedia.org.lattes.autorship.Authorship;
import pt.dbpedia.org.lattes.autorship.OtherProduction;
import pt.dbpedia.org.lattes.autorship.TechnicalProduction;
import pt.dbpedia.org.lattes.other.AdditionalInfo;
import rdf.RDF;

@Getter
@Setter
@XStreamAlias("CURRICULO-VITAE")
public class LattesCV {

  @XStreamAlias("DADOS-GERAIS")
  private GeneralData generalData;

  @XStreamAlias("PRODUCAO-BIBLIOGRAFICA")
  private Authorship authorship;

  @XStreamAlias("PRODUCAO-TECNICA")
  private TechnicalProduction technicalProduction;

  @XStreamAlias("OUTRA-PRODUCAO")
  private OtherProduction otherProduction;

  @XStreamAlias("DADOS-COMPLEMENTARES")
  private AdditionalInfo additionalInfo;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-IDENTIFICADOR")
  @RDF(id = true, base = "http://lattes.cnpq.br/")
  private String id;


}
