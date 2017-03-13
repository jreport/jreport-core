package br.jreport.core.api.interfaces;

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
