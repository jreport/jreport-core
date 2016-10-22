package br.jreport.core;

import br.jreport.core.api.ClassReport;
import br.jreport.core.api.Report;
import br.jreport.core.api.ReportOutputData;
import br.jreport.core.datasource.LocalVotacaoDS;
import br.jreport.core.datasource.PontoTransmissaoDS;

public class DemoReport implements ClassReport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PontoTransmissaoDS pontoTransmissaoDS = new PontoTransmissaoDS();

	@Override
	public ReportOutputData create(Report report) {
		//@formatter:off
		return report
			.title()
				.text("Relatório de Teste")
			.buildTitle()
			.detail()
				.text("Listagem de Pontos de Transmissão")
				.table(pontoTransmissaoDS, (pontoTransmissao, row) -> row.list(new LocalVotacaoDS(pontoTransmissao)))
			.buildDetail()
		.buildReport();
		//@formatter:on
	}

}
