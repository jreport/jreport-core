package br.jreport.core.api;

import java.util.function.BiConsumer;

import br.jreport.core.api.adapter.TableAdapter;
import br.jreport.core.api.datasource.Datasource;

/**
 * 
 * @author jcruz
 *
 */
public interface Detail extends Region {
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
	 * Nova linha.
	 * 
	 * @return
	 */
	Detail newLine();

	/**
	 * 
	 * @return
	 */
	<T, A extends TableAdapter<T>> Detail table(A tableAdapter);

	/**
	 * 
	 * @param dataSource
	 * @param eachRow
	 * @return
	 */
	<T, A extends TableAdapter<T>> Detail table(Class<A> tableAdapter, BiConsumer<T, TableRow> eachRow);

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
