package br.jreport.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class StyleElement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Object> style;

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
