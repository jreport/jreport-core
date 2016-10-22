package br.jreport.core;

import java.io.Serializable;

import br.jreport.core.api.ClassReport;
import br.jreport.core.api.Report;
import br.jreport.core.api.ReportOutputStream;

/**
 * Classe motora de geração de relatórios.
 * 
 * @author jcruz
 *
 */
public class JReportEngine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Gera o relatório
	 * 
	 * @param classReport
	 *            Estrutura de relatório para geração.
	 * @param report
	 *            Implementação de Report correspondente.
	 * @return OutputStream do relatório.
	 */
	public static <R extends Report> ReportOutputStream generate(ClassReport classReport, R report) {
		return classReport.create(report);
	}
}
