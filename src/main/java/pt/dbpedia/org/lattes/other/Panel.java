package pt.dbpedia.org.lattes.other;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XStreamAlias("PARTICIPACAO-EM-BANCA-TRABALHOS-CONCLUSAO")
public class Panel {

  @XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-BANCA-DE-MESTRADO")
  private List<MsPanel> msPanels;

  @XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-BANCA-DE-DOUTORADO")
  private List<PHDPanel> phdPanels;

  @XStreamImplicit(itemFieldName = "PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO")
  private List<QualificationPanel> qualificationPanel;

}
