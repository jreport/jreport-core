package br.jreport.core;

import java.io.Serializable;

import br.jreport.core.api.NewClassReport;
import br.jreport.core.api.NewReport;
import br.jreport.core.api.aux.NewReportOutputData;

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
	public static <C extends NewClassReport, R extends NewReport> NewReportOutputData generate(C classReport, R report) {
		return classReport.create(report);
	}

	/**
	 * Gera o relatório
	 * 
	 * @param classReport
	 *            Estrutura de relatório para geração.
	 * @param report
	 *            Implementação de Report correspondente.
	 * @return OutputStream do relatório.
	 */
	public static <C extends NewClassReport> String serialize(C classReport) {
		throw new UnsupportedOperationException("Não implementado");
		// return classReport.serialization(classReport);
	}

	/**
	 * Gera o relatório
	 * 
	 * @param classReport
	 *            Estrutura de relatório para geração.
	 * @param report
	 *            Implementação de Report correspondente.
	 * @return OutputStream do relatório.
	 */
	public static <C extends NewClassReport, R extends NewReport> NewReportOutputData deserialize(String serialized, R report) {
		// desserialize(serialized);
		// create report on report like: report.title().text(text)
		throw new UnsupportedOperationException("Não implementado");
		// return report.buildReport();
	}
}
