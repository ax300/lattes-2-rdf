package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-TECNICA")
public class OtherTechnicalProduction {

  @XStreamImplicit(itemFieldName = "EDITORACAO")
  private List<Publication> publications;

  @XStreamImplicit(itemFieldName = "ORGANIZACAO-DE-EVENTO")
  private List<EventOrganization> eventOrganizations;
}
