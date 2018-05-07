package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventOrganizationInfo {

  @XStreamAsAttribute
  @XStreamAlias("CIDADE")
  private String country;

  @XStreamAsAttribute
  @XStreamAlias("INSTITUICAO-PROMOTORA")
  private String supportedBy;

  @XStreamAsAttribute
  @XStreamAlias("LOCAL")
  private String place;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-CATALOGO")
  private String isCatalog;

  @XStreamAsAttribute
  @XStreamAlias("FLAG-EVENTO-ITINERANTE")
  private String isItinerant;

  @XStreamAsAttribute
  @XStreamAlias("DURACAO-EM-SEMANAS")
  private String eventDuration;
}
