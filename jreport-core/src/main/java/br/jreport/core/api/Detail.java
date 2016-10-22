package br.jreport.core.api;

import java.io.Serializable;
import java.util.function.BiConsumer;

import br.jreport.core.api.adapter.TableAdapter;
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
	<T, A extends TableAdapter<T>, D extends Datasource<T>> Detail table(D dataSource,A tableAdapter);

	/**
	 * 
	 * @param dataSource
	 * @param eachRow
	 * @return
	 */
	<T, A extends TableAdapter<T>, D extends Datasource<T>> Detail table(D dataSource, A tableAdapter, BiConsumer<T, TableRow> eachRow);

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
