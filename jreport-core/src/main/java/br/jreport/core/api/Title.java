package br.jreport.core.api;

import java.io.Serializable;

/**
 * Classe da região titulo
 * 
 * @author jcruz
 *
 */
public interface Title extends Serializable {

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
	 * 
	 * @return
	 */
	Title line();

	/**
	 * 
	 * @param value
	 * @return
	 */
	Title line(int value);

	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	Report buildTitle();

}
