package pt.dbpedia.org.lattes.autorship;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookOrChapter {

  @XStreamAlias("LIVROS-PUBLICADOS-OU-ORGANIZADOS")
  private List<Book> books;

  @XStreamAlias("CAPITULOS-DE-LIVROS-PUBLICADOS")
  private List<Chapter> chapters;
}
