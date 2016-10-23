package br.jreport.core.api;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/**
 * Classe de saida de um relatório.
 * 
 * @author jcruz
 *
 */
public interface ReportOutputData extends Serializable {

	/**
	 * 
	 * @return
	 */
	ByteArrayOutputStream getOutputStream();

	/**
	 * 
	 * @return
	 */
	String getMimeType();
}
