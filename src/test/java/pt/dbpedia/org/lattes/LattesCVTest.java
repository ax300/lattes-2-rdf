package pt.dbpedia.org.lattes;

import com.thoughtworks.xstream.XStream;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class LattesCVTest {

  @Test
  public void convertXMLToObjectMustReturnNoErrors() throws FileNotFoundException {

    XStream xStream = new XStream();
    InputStream inputStream = this.getClass().getResourceAsStream("0029233355476625.xml");

    xStream.processAnnotations(LattesCV.class);
    xStream.processAnnotations(GeneralData.class);
    //xStream.addImplicitCollection(Link.class, "links", "links", ProfessionalExperience.class);

    LattesCV lattesCV = (LattesCV) xStream.fromXML(inputStream);


  }
}
