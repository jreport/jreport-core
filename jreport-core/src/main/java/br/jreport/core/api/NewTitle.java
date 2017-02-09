package br.jreport.core.api;

import java.util.function.BiConsumer;

import br.jreport.core.api.datasource.NewDatasource;
import br.jreport.core.api.property.NewTableProperty;

/**
 * Classe da região titulo
 * 
 * @author jcruz
 *
 */
public interface NewTitle extends NewRegion {

	/**
	 * 
	 * Definição de imagem;
	 * 
	 * @param src
	 * @return
	 */
	NewTitle addImage(String src);

	NewTitle addImage(String src, String classe);

	/**
	 * Definição de texto.
	 * 
	 * @param text
	 * @return
	 */
	NewTitle addText(String text);

	NewTitle addText(String text, String classe);

	/**
	 * 
	 * @return
	 */
	NewTitle addNewLine();

	/**
	 * 
	 * @return
	 */
	NewTitle addSeparator();

	/**
	 * 
	 * @return
	 */
	NewTitle addNewPage();

	/**
	 * Definição de tabela.
	 * 
	 * @return
	 */
	<T, A extends NewTableProperty<T>> NewTitle addTable(A tableProperty);

	<T, A extends NewTableProperty<T>> NewTitle addTable(A tableProperty, String classe);

	/**
	 * 
	 * @param dataSource
	 * @param eachRow
	 * @return
	 */
	<T, A extends NewTableProperty<T>> NewTitle addTable(A tableProperty, BiConsumer<T, NewTableRow> eachRow);

	<T, A extends NewTableProperty<T>> NewTitle addTable(A tableProperty, BiConsumer<T, NewTableRow> eachRow, String classe);

	/**
	 * 
	 * @return
	 */
	<T, D extends NewDatasource<T>> NewTitle addList(D datasource);

	<T, D extends NewDatasource<T>> NewTitle addList(D datasource, String classe);

	/**
	 * 
	 * @return
	 */
	<A extends NewColspanBody> NewTitle addColspanline(A tableProperty);

	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	NewReport buildTitle();
}
