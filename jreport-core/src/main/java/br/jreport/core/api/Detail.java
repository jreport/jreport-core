package br.jreport.core.api;

import java.util.function.BiConsumer;

import br.jreport.core.api.datasource.Datasource;
import br.jreport.core.api.property.TableProperty;

/**
 * 
 * Classe que contem a estrutura de detalhes do relatório.
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
	Detail addImage(String src);

	Detail addImage(String src, String classe);

	/**
	 * Definição de texto.
	 * 
	 * @param text
	 * @return
	 */
	Detail addText(String text);

	Detail addText(String text, String classe);

	/**
	 * 
	 * @return
	 */
	Detail addNewLine();

	/**
	 * 
	 * @return
	 */
	Detail addSeparator();

	/**
	 * 
	 * @return
	 */
	Detail addNewPage();

	/**
	 * Definição de tabela.
	 * 
	 * @return
	 */
	<T, A extends TableProperty<T>> Detail addTable(A tableProperty);

	<T, A extends TableProperty<T>> Detail addTable(A tableProperty, String classe);

	/**
	 * 
	 * @param dataSource
	 * @param eachRow
	 * @return
	 */
	<T, A extends TableProperty<T>> Detail addTable(A tableProperty, BiConsumer<T, TableRow> eachRow);

	<T, A extends TableProperty<T>> Detail addTable(A tableProperty, BiConsumer<T, TableRow> eachRow, String classe);

	/**
	 * 
	 * @return
	 */
	<T, D extends Datasource<T>> Detail addList(D datasource);

	<T, D extends Datasource<T>> Detail addList(D datasource, String classe);

	/**
	 * Monta a região de título.
	 * 
	 * @return
	 */
	Report buildDetail();
}
