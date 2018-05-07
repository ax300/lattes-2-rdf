package rdf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RDF {

  boolean id() default false;

  String property() default "";

  boolean value() default true;

  String base() default "";

  String type() default "";

  String language() default "";

  boolean print() default true;

  boolean secondary()  default false;

  RDFKeyStrategy strategy() default RDFKeyStrategy.DEFAULT;

}
