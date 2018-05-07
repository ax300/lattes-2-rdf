package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("PALAVRAS-CHAVE")
public class Keyword {

  @XStreamAsAttribute
  @XStreamAlias("PALAVRA-CHAVE-1")
  private String keyWord1;

  @XStreamAsAttribute
  @XStreamAlias("PALAVRA-CHAVE-2")
  private String keyWord2;

  @XStreamAsAttribute
  @XStreamAlias("PALAVRA-CHAVE-3")
  private String keyWord3;

  @XStreamAsAttribute
  @XStreamAlias("PALAVRA-CHAVE-4")
  private String keyWord4;

  @XStreamAsAttribute
  @XStreamAlias("PALAVRA-CHAVE-5")
  private String keyWord5;

  @XStreamAsAttribute
  @XStreamAlias("PALAVRA-CHAVE-6")
  private String keyWord6;
}
