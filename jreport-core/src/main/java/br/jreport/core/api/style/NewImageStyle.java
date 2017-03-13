package br.jreport.core.api.style;

import java.io.Serializable;

public interface NewImageStyle extends Serializable {

	void setHorizontalAlignment(String horizontalAlignment);

	void setHeight(String height);

	void setWidth(String width);

	void setMarginTop(String textIndent);

	void setMarginLeft(String textIndent);

	void setMarginRight(String textIndent);

	void setMarginBottom(String textIndent);

}
