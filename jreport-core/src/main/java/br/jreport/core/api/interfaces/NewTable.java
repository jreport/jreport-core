package br.jreport.core.api.interfaces;

import java.io.Serializable;
import java.util.function.BiConsumer;

import br.jreport.core.api.aux.NewTableRow;

/**
 * 
 * @author jcruz
 *
 */
public interface NewTable<T> extends Serializable {

	/**
	 * 
	 */
	void build();

	/**
	 * 
	 * @param row
	 */
	void build(BiConsumer<T, NewTableRow> row);

}
