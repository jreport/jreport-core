package br.jreport.core.api.regions;

import java.util.Optional;
import java.util.function.BiConsumer;

import br.jreport.core.api.NewReport;
import br.jreport.core.api.aux.NewTableRow;
import br.jreport.core.api.datasource.NewDatasource;
import br.jreport.core.api.interfaces.NewColspanBody;
import br.jreport.core.api.property.NewTableProperty;
import br.jreport.core.impl.Style;

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

	NewDetail addImage(String src, Optional<Style> classe);

	/**
	 * Definição de texto.
	 * 
	 * @param text
	 * @return
	 */
	NewDetail addText(String text);

	NewDetail addText(String text, Optional<Style> classe);

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

	<T, A extends NewTableProperty<T>> NewDetail addTable(A tableProperty, Optional<Style> classe);

	/**
	 * 
	 * @param dataSource
	 * @param eachRow
	 * @return
	 */
	<T, A extends NewTableProperty<T>> NewDetail addTable(A tableProperty, BiConsumer<T, NewTableRow> eachRow);

	<T, A extends NewTableProperty<T>> NewDetail addTable(A tableProperty, BiConsumer<T, NewTableRow> eachRow, Optional<Style> classe);

	/**
	 * 
	 * @return
	 */
	<T, D extends NewDatasource<T>> NewDetail addList(D datasource);

	<T, D extends NewDatasource<T>> NewDetail addList(D datasource, Optional<Style> classe);

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
