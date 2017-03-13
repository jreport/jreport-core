package br.jreport.core.api.interfaces;

import java.io.Serializable;
import java.util.Optional;

import br.jreport.core.api.property.NewTableProperty;
import br.jreport.core.impl.Style;

/**
 * 
 * @author jcruz
 *
 */
public interface NewColspanBody extends Serializable {

	/**
	 * 
	 */
	NewColspanBody buildColspan();

	NewColspanBody addText(String text);

	NewColspanBody addText(String text, Optional<Style> style);

	NewColspanBody addImage(String src);

	NewColspanBody addImage(String src, Optional<Style> style);

	<D> NewColspanBody addTable(NewTableProperty<D> tableAdapter);

	<D> NewColspanBody addTable(NewTableProperty<D> tableAdapter, Optional<Style> style);

	NewColspanBody addEmptyCol();
}
