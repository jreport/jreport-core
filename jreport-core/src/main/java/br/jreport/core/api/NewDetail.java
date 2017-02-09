package br.jreport.core.api;

import java.util.function.BiConsumer;

import br.jreport.core.api.datasource.NewDatasource;
import br.jreport.core.api.property.NewTableProperty;

/**
 * 
 * Classe que contem a estrutura de detalhes do relatório.
 * 
 * @author jcruz
 *
 */
public interface NewDetail extends NewRegion {

	/**
	 * 
	 * Definição de imagem;
	 * 
	 * @param src
	 * @return
	 */
	NewDetail addImage(String src);

	NewDetail addImage(String src, String classe);

	/**
	 * Definição de texto.
	 * 
	 * @param text
	 * @return
	 */
	NewDetail addText(String text);

	NewDetail addText(String text, String classe);

	/**
	 * 
	 * @return
	 */
	NewDetail addNewLine();

	/**
	 * 
	 * @return
	 */
	NewDetail addSeparator();

	/**
	 * 
	 * @return
	 */
	NewDetail addNewPage();

	/**
	 * Definição de tabela.
	 * 
	 * @return
	 */
	<T, A extends NewTableProperty<T>> NewDetail addTable(A tableProperty);

	<T, A extends NewTableProperty<T>> NewDetail addTable(A tableProperty, String classe);

	/**
	 * 
	 * @param dataSource
	 * @param eachRow
	 * @return
	 */
	<T, A extends NewTableProperty<T>> NewDetail addTable(A tableProperty, BiConsumer<T, NewTableRow> eachRow);

	<T, A extends NewTableProperty<T>> NewDetail addTable(A tableProperty, BiConsumer<T, NewTableRow> eachRow, String classe);

	/**
	 * 
	 * @return
	 */
	<T, D extends NewDatasource<T>> NewDetail addList(D datasource);

	<T, D extends NewDatasource<T>> NewDetail addList(D datasource, String classe);

	
	/**
	 * 
	 * @return
	 */
	<A extends NewColspanBody> NewDetail addColspanline(A tableProperty);
	
	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	NewReport buildDetail();
}
