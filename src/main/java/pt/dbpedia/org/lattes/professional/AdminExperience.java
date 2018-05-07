package pt.dbpedia.org.lattes.professional;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;


public class AdminExperience {

  @XStreamImplicit(itemFieldName = "DIRECAO-E-ADMINISTRACAO")
  public List<Admin> admins;
}
