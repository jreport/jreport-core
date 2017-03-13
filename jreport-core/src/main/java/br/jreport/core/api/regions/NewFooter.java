package br.jreport.core.api.regions;

import br.jreport.core.api.NewReport;

public interface NewFooter extends NewRegion {

	/**
	 * 
	 * Definição de imagem;
	 * 
	 * @param src
	 * @return
	 */
	NewTitle image(String src);

	/**
	 * Definição de texto.
	 * 
	 * @param text
	 * @return
	 */
	NewTitle text(String text);

	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	NewReport build();
}
