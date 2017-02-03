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
	default ReportOutputData create(Report report) {
		return templateReport(report).buildReport();
	}

	Report templateReport(Report report);

	default <C extends ClassReport> String serialization(C classReport) {

		return null;
	}

}
