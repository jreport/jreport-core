package br.jreport.core.api;

import java.io.Serializable;

public interface NewTableStyle extends Serializable {

	void setVerticalAlignment(String color);

	void setHorizontalAlignment(String textAlign);

	void setHeight(String textDecoration);

	void setWidth(String textIndent);

	void setBorderColor(String textMarginLeft);

	void setBorderWidth(String textMarginLeft);

	void setBorderTopWidth(String textMarginLeft);

	void setBorderLeftWidth(String textMarginLeft);

	void setBorderRightWidth(String textMarginLeft);

	void setBorderBottomWidth(String textMarginLeft);

	void setColspan(String fontSize);

	void setRolspan(String fontWeight);

	void setBackgroundCellColor(String fontStyle);

}
