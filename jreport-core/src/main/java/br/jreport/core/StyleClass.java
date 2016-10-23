package br.jreport.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class StyleClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String selector;

	private Map<String, Object> style;

	public String getSelector() {
		return selector;
	}

	public void setSelector(String selector) {
		this.selector = selector;
	}

	public Map<String, Object> getStyle() {
		if (this.style == null) {
			this.style = new HashMap<>();
		}
		return style;
	}

	public void setStyle(Map<String, Object> style) {
		this.style = style;
	}
	

}
