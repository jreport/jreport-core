package br.jreport.core.api;

import java.io.Serializable;

public interface Footer extends Serializable {

	/**
	 * 
	 * Definição de imagem;
	 * 
	 * @param src
	 * @return
	 */
	Title image(String src);

	/**
	 * Definição de texto.
	 * 
	 * @param text
	 * @return
	 */
	Title text(String text);

	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	Report build();
}
