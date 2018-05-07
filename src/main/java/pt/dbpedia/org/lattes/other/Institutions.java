package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;


@XStreamAlias("INFORMACOES-ADICIONAIS-INSTITUICOES")
public class Institutions {

  @XStreamImplicit(itemFieldName = "INFORMACAO-ADICIONAL-INSTITUICAO")
  private List<InstitutionInfo> institutionInfoList;
}
