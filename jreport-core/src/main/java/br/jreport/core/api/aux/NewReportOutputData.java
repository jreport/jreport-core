package br.jreport.core.api.aux;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/**
 * Classe de saida de um relatório.
 * 
 * @author jcruz
 *
 */
public interface NewReportOutputData extends Serializable {

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
