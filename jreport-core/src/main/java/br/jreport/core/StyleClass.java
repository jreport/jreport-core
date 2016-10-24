package br.jreport.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class StyleClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, StyleElement> element;

	public Map<String, StyleElement> getElement() {
		if (this.element == null) {
			this.element = new HashMap<>();
		}
		return element;
	}

	public void setElement(Map<String, StyleElement> styleElement) {
		this.element = styleElement;
	}

}
