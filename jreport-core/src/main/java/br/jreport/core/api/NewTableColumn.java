package br.jreport.core.api;

import java.io.Serializable;
import java.util.Optional;

/**
 * 
 * 
 * @author jcruz
 *
 */
public class NewTableColumn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String text;

	private NewTableColumn() {
		super();
	}

	private NewTableColumn(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public static Optional<NewTableColumn> of(String text) {
		if (text != null) {
			return Optional.of(new NewTableColumn(text));
		}
		return Optional.empty();
	}
}
