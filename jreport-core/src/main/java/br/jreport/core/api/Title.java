package br.jreport.core.api;

/**
 * Classe da região titulo
 * 
 * @author jcruz
 *
 */
public interface Title extends Region {

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
	Title newLine();

	/**
	 * 
	 * @return
	 */
	Title newPage();

	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	Report buildTitle();

}
