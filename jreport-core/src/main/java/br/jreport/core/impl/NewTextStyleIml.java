package br.jreport.core.impl;

import java.util.Map;

import br.jreport.core.api.style.NewTextStyle;

public class NewTextStyleIml implements NewTextStyle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewTextStyleIml() {

	}

	public NewTextStyleIml(Style classe) {
		try {
			classe = classe.getClasse().isEmpty() ? Style.of("default.text").get() : classe;
			Map<String, String> map = StyleMap.getClassStyle(classe.getClasse());
			if (map.isEmpty()) {// se a lista vier vazia, vem o default
				map = StyleMap.getClassStyle("default.text");
			}
			setParams(map);
		} catch (NullPointerException e) {
			classe = Style.of("default.text").get();
			Map<String, String> map = StyleMap.getClassStyle(classe.getClasse());
			setParams(map);
		}
	}

	private void setParams(Map<String, String> map) {
		setColor(map.get("color"));
		setTextAlign(map.get("text-align"));
		setTextAlignNumber(map.get("text-align-number"));
		setTextDecoration(map.get("text-decoration"));
		setTextIndent(map.get("text-indent"));
		setTextMarginLeft(map.get("margin-left"));
		setFontSize(map.get("font-size"));
		setFontStyle(map.get("font-style"));
		setFontWeight(map.get("font-weight"));
	}

	@Override
	public void setColor(String color) {

	}

	@Override
	public void setTextAlign(String textAlign) {
		

	}

	@Override
	public void setTextDecoration(String textDecoration) {
		

	}

	@Override
	public void setTextIndent(String textIndent) {
		

	}

	@Override
	public void setTextMarginLeft(String textMarginLeft) {
		

	}

	@Override
	public void setFontSize(String fontSize) {
		

	}

	@Override
	public void setFontWeight(String fontWeight) {
		

	}

	@Override
	public void setFontStyle(String fontStyle) {
		

	}

	@Override
	public void setTextAlignNumber(String textAlign) {
		

	}

}
