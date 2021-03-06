package br.jreport.core.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 
 * @author jcruz
 *
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface JsonStyleClass {
	String value();
}
