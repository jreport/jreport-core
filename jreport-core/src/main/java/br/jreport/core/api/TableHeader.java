package br.jreport.core.api;

import java.io.Serializable;
import java.util.Optional;

/**
 * 
 * @author jcruz
 *
 */
public class TableHeader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String text;

	public TableHeader() {
		super();
	}

	private TableHeader(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public static Optional<TableHeader> of(String text) {
		if (text != null) {
			return Optional.of(new TableHeader(text));
		}
		return Optional.empty();
	}

}
