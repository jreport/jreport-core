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
	 * Definição de tabela.
	 * 
	 * @return
	 */
	<T, A extends TableProperty<T>> Detail table(A tableProperty);

	/**
	 * 
	 * @param dataSource
	 * @param eachRow
	 * @return
	 */
	<T, A extends TableProperty<T>> Detail table(A tableProperty, BiConsumer<T, TableRow> eachRow);

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
