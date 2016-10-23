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
	 */
	void build();

	/**
	 * 
	 * @param row
	 */
	void build(BiConsumer<T, TableRow> row);

}
