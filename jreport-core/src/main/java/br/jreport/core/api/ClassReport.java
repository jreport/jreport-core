package br.jreport.core.api;

import java.io.Serializable;

/**
 * Classe que contem a estrutura de um relatorio Jreport.
 * 
 * @author jcruz
 *
 */
public interface ClassReport extends Serializable {

	/**
	 * 
	 * @param report
	 */
	ReportOutputStream create(Report report);
}
