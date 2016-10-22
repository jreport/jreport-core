package br.jreport.core.api;

import java.io.Serializable;

/**
 * Classe de definição das regiões e componentes do relatório.
 * 
 * @author jcruz
 *
 */
public interface Report extends Serializable {

	/**
	 * Regiao do título.
	 * 
	 * @return
	 */
	Title title();

	/**
	 * Região dos detalhes;
	 * 
	 * @return
	 */
	Detail detail();

	/**
	 * Região do rodapé.
	 * 
	 * @return
	 */
	Footer footer();

	/**
	 * 
	 */
	ReportOutputData buildReport();
}
