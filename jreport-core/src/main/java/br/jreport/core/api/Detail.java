package br.jreport.core.api;

import java.io.Serializable;
import java.util.function.BiConsumer;

import br.jreport.core.api.datasource.Datasource;

/**
 * 
 * @author jcruz
 *
 */
public interface Detail extends Serializable {
	/**
	 * 
	 * Definição de imagem;
	 * 
	 * @param src
	 * @return
	 */
	Detail image(String src);

	/**
	 * Definição de texto.
	 * 
	 * @param text
	 * @return
	 */
	Detail text(String text);

	/**
	 * 
	 * @return
	 */
	<T, D extends Datasource<T>> Detail table(D dataSource);

	/**
	 * 
	 * @param dataSource
	 * @param eachRow
	 * @return
	 */
	<T, D extends Datasource<T>> Detail table(D dataSource, BiConsumer<T, TableRow> eachRow);

	/**
	 * 
	 * @return
	 */
	<T, D extends Datasource<T>> Detail list(D datasource);

	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	Report buildDetail();
}
