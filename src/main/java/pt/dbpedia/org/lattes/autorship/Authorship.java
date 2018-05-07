package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XStreamAlias("PRODUCAO-BIBLIOGRAFICA")
public class Authorship {

  @XStreamAlias("TRABALHOS-EM-EVENTOS")
  private List<WorkEvent> workEvents;

  @XStreamAlias("ARTIGOS-PUBLICADOS")
  private List<Article> article;

  @XStreamAlias("LIVROS-E-CAPITULOS")
  private BookOrChapter bookOrChapter;

  @XStreamAlias("DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
  private List<OtherPublication> otherPublication;
}
