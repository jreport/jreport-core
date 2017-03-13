package br.jreport.core.api;

import java.io.Serializable;

import br.jreport.core.api.aux.NewReportOutputData;
import br.jreport.core.api.regions.NewDetail;
import br.jreport.core.api.regions.NewFooter;
import br.jreport.core.api.regions.NewTitle;

/**
 * Classe de definição das regiões e componentes do relatório.
 * 
 * @author jcruz
 *
 */
public interface NewReport extends Serializable {

	/**
	 * Regiao do título.
	 * 
	 * @return
	 */
	NewTitle title();

	/**
	 * Região dos detalhes;
	 * 
	 * @return
	 */
	NewDetail detail();

	/**
	 * Região do rodapé.
	 * 
	 * @return
	 */
	NewFooter footer();

	/**
	 * 
	 */
	NewReportOutputData buildReport();

}
