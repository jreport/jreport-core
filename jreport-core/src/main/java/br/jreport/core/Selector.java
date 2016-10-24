package br.jreport.core;

public class Selector {

	private String selectorKey;

	private Selector() {
		super();
	}

	private Selector(String selectorKey) {
		super();
		this.selectorKey = selectorKey;
	}

	public String getSelectorKey() {
		return selectorKey;
	}

	public static Selector of(String selectorKey) {
		if (selectorKey != null && !selectorKey.isEmpty()) {
			return new Selector(selectorKey);
		}
		return null;
	}

}
