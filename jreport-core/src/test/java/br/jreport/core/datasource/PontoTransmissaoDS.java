package br.jreport.core.datasource;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import br.jreport.core.api.datasource.Datasource;
import br.jreport.core.model.PontoTransmissao;

public class PontoTransmissaoDS implements Datasource<PontoTransmissao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public List<PontoTransmissao> get() {
		return Arrays.asList(new PontoTransmissao("1", "A"), new PontoTransmissao("2", "B"));
	}

	@Override
	public Optional<String> emptyMessage() {
		return Optional.of("Não há pontos de transmissão");
	}

}
