package br.jreport.core.api;

import java.io.Serializable;
import java.util.function.BiConsumer;

/**
 * 
 * @author jcruz
 *
 */
public interface Table<T> extends Serializable {

	/**
	 * 
	 * @param dataSource
	 * @param tableAdapter
	 * @return
	 */
	void build();

	/**
	 * 
	 * @param dataSource
	 * @param tableAdapter
	 * @param row
	 * @return
	 */
	void build(BiConsumer<T, TableRow> row);

}
