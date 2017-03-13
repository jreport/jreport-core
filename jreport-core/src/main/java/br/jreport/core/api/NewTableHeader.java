package br.jreport.core.api;

import java.io.Serializable;
import java.util.Optional;

import br.jreport.core.enumerations.HeaderType;

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

	private HeaderType type;
	
	private String styleInline;
	
	public NewTableHeader setColspan(String styleInline) {
		this.styleInline = styleInline;
		return this;
	}

	public NewTableHeader() {
		super();
	}

	private NewTableHeader(String text, HeaderType type) {
		super();
		this.text = text;
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public HeaderType getType() {
		return type;
	}

	public static Optional<NewTableHeader> of(String text, HeaderType type) {
		if (text != null) {
			return Optional.of(new NewTableHeader(text, type));
		}
		return Optional.empty();
	}
	public static Optional<NewTableHeader> of(String text, HeaderType type, String style) {
		if (text != null) {
			return Optional.of(new NewTableHeader(text, type));
		}
		return Optional.empty();
	}
	public static Optional<NewTableHeader> of(String text, HeaderType type, Integer colspan) {
		if (text != null) {
			return Optional.of(new NewTableHeader(text, type));
		}
		return Optional.empty();
	}

}
