package br.jreport.core.api.style;

import java.io.Serializable;

public interface NewTableStyle extends Serializable {

	void setTheadVerticalAlignment(String color);

	void setTheadHorizontalAlignment(String textAlign);

	void setTheadHeight(String textDecoration);

	void setTheadWidth(String textIndent);

	void setTheadBorderColor(String textMarginLeft);

	void setTheadBorderWidth(String textMarginLeft);

	void setTheadBorderTopWidth(String textMarginLeft);

	void setTheadBorderLeftWidth(String textMarginLeft);

	void setTheadBorderRightWidth(String textMarginLeft);

	void setTheadBorderBottomWidth(String textMarginLeft);

	void setTheadColspan(String fontSize);

	void setTheadRolspan(String fontWeight);

	void setTheadBackgroundCellColor(String fontStyle);

	void setTheadNewTextStyle(NewTextStyle style);
	
	NewTextStyle getTheadNewTextStyle();

	/**
	 * Tbody
	 */

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
	
	void setBackgroundCellColorPar(String fontStyle);

	void setNewTextStyle(NewTextStyle style);

	NewTextStyle getNewTextStyle();
}
