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
	Title addImage(String src);

	Title addImage(String src, String classe);

	/**
	 * Definição de texto.
	 * 
	 * @param text
	 * @return
	 */
	Title addText(String text);

	Title addText(String text, String classe);

	/**
	 * 
	 * @return
	 */
	Title addNewLine();

	/**
	 * 
	 * @return
	 */
	Title addSeparator();

	/**
	 * 
	 * @return
	 */
	Title addNewPage();

	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	Report buildTitle();

}
