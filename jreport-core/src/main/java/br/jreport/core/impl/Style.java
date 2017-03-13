package br.jreport.core.impl;

import java.util.Optional;

import com.google.common.base.Strings;

public class Style {

	private String classe;
	private String inline;

	public String getClasse() {
		if (classe == null) {
			this.classe = "";
		}
		return classe;
	}

	public String getInline() {
		if (inline == null) {
			this.inline = "";
		}
		return inline;
	}

	public Style(String classe, String inline) {
		this.classe = classe;
		this.inline = inline;
	}

	public Style(String classe) {
		this.classe = classe;
	}

	public static Optional<Style> of(String classe, String inline) {
		if (!Strings.isNullOrEmpty(classe) && !Strings.isNullOrEmpty(inline)) {
			return Optional.of(new Style(classe, inline));
		}
		return Optional.of(new Style(""));
	}

	public static Optional<Style> of(String classe) {
		if (!Strings.isNullOrEmpty(classe)) {
			return Optional.of(new Style(classe));
		}
		return Optional.of(new Style(""));
	}

}
