package rdf;

import lombok.Getter;

@Getter
public enum RDFKeyStrategy {

  DEFAULT("DEFAULT"), COMPOSITE("COMPOSITE"), CODE_ONLY("CODE_ONLY"), URL("URL");

  private String value;

  RDFKeyStrategy(String value) {
    this.value = value;
  }

}
