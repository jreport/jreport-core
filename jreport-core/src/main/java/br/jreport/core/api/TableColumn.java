package br.jreport.core.api;

import java.io.Serializable;
import java.util.Optional;

/**
 * 
 * 
 * @author jcruz
 *
 */
public class TableColumn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String text;

	private TableColumn() {
		super();
	}

	private TableColumn(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public static Optional<TableColumn> of(String text) {
		if (text != null) {
			return Optional.of(new TableColumn(text));
		}
		return Optional.empty();
	}
}
