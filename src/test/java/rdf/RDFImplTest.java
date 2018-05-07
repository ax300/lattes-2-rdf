package rdf;

import com.thoughtworks.xstream.XStream;
import org.junit.Test;
import pt.dbpedia.org.lattes.GeneralData;
import pt.dbpedia.org.lattes.LattesCV;

import java.io.InputStream;

public class RDFImplTest {

  private LattesCV get() {

    XStream xStream = new XStream();

    InputStream inputStream = this.getClass().getResourceAsStream("0029233355476625.xml");

    xStream.processAnnotations(LattesCV.class);
    xStream.processAnnotations(GeneralData.class);

    return (LattesCV) xStream.fromXML(inputStream);

  }

  @Test
  public void lattesCV() throws Exception {
    //Init
    LattesCV lattesCV = get();

    RDFImpl rdfImpl = new RDFImpl();

    //Act
    String n3 = rdfImpl.rdf(lattesCV);


  }
}
