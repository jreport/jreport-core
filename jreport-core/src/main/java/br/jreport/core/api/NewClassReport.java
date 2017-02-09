package br.jreport.core.api;

import java.io.Serializable;

/**
 * Classe que contem a estrutura de um relatorio Jreport.
 * 
 * @author jcruz
 *
 */
public interface NewClassReport extends Serializable {

	/**
	 * 
	 * @param report
	 */
	default NewReportOutputData create(NewReport report) {
		return templateReport(report).buildReport();
	}

	NewReport templateReport(NewReport report);

	default <C extends NewClassReport> String serialization(C classReport) {

		return null;
	}

}
