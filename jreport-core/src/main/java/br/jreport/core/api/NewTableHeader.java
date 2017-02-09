package br.jreport.core.api;

import java.io.Serializable;
import java.util.Optional;

/**
 * 
 * @author jcruz
 *
 */
public class NewTableHeader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String text;

	public NewTableHeader() {
		super();
	}

	private NewTableHeader(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public static Optional<NewTableHeader> of(String text) {
		if (text != null) {
			return Optional.of(new NewTableHeader(text));
		}
		return Optional.empty();
	}

}
