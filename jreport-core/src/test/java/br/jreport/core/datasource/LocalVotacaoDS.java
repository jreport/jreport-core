package br.jreport.core.datasource;

import java.util.List;
import java.util.Optional;

import br.jreport.core.api.datasource.Datasource;
import br.jreport.core.model.LocalVotacao;
import br.jreport.core.model.PontoTransmissao;

public class LocalVotacaoDS implements Datasource<LocalVotacao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PontoTransmissao pontoTransmissao;

	public LocalVotacaoDS(PontoTransmissao pontoTransmissao) {
		super();
		this.pontoTransmissao = pontoTransmissao;
	}

	@Override
	public List<LocalVotacao> get() {
		return pontoTransmissao.getLocaisVotacao();
	}

	@Override
	public Optional<String> emptyMessage() {
		return Optional.of("Não há locais de Votação");
	}

}
