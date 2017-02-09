package br.jreport.core.api;

import java.io.Serializable;

import br.jreport.core.api.property.NewTableProperty;

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

	NewColspanBody addText(String text, String align);

	NewColspanBody addText(String text, String align, String style);

	NewColspanBody addImage(String src, String align);

	NewColspanBody addImage(String src, String align, String style);

	<D> NewColspanBody addTable(NewTableProperty<D> tableAdapter, String align);

	<D> NewColspanBody addTable(NewTableProperty<D> tableAdapter, String align, String style, String headerClasse);

	NewColspanBody addEmptyCol();
}
