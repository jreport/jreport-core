package br.jreport.core.api;

import java.io.Serializable;

/**
 * 
 * @author jcruz
 *
 */
public interface TextStyle<T> extends Serializable {

	void setColor(String color);

	void setTextAlign(String textAlign);

	void setTextDecoration(String textDecoration);

	void setTextIndent(String textIndent);

	void setTextMarginLeft(String textMarginLeft);

	/** Font **/

	void setFontSize(String fontSize);

	void setFontStyle(String fontStyle);

	T build();
}
