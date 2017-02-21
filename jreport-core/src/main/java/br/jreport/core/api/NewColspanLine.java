package br.jreport.core.api;

import java.io.Serializable;

/**
 * 
 * @author jcruz
 *
 */
public interface NewColspanLine extends Serializable {

	
	NewColspanBody addHeadersColspan(Integer cols);
	
	/**
	 * 
	 */
	void build();

}
