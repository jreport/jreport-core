package br.jreport.core.impl;

import java.util.Map;

import br.jreport.core.api.style.NewImageStyle;

public class NewImageStyleIml implements NewImageStyle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewImageStyleIml(Style classe) {
		try {
			classe = classe.getClasse().isEmpty() ? Style.of("default.image").get() : classe;
			Map<String, String> map = StyleMap.getClassStyle(classe.getClasse());
			if (map.isEmpty()) {// se a lista vier vazia, vem o default
				map = StyleMap.getClassStyle("default.image");
			}
			setParams(map);
		} catch (NullPointerException e) {
			classe = Style.of("default.image").get();
			Map<String, String> map = StyleMap.getClassStyle(classe.getClasse());
			setParams(map);
		}
	}

	private void setParams(Map<String, String> map) {
		setHorizontalAlignment(map.get("horizontal-alignment"));
		setWidth(map.get("width"));
		setHeight(map.get("height"));
		setMarginTop(map.get("margin-top"));
		setMarginLeft(map.get("margin-left"));
		setMarginRight(map.get("margin-right"));
		setMarginBottom(map.get("margin-bottom"));
	}

	@Override
	public void setHorizontalAlignment(String color) {

	}

	@Override
	public void setHeight(String textDecoration) {

	}

	@Override
	public void setWidth(String textIndent) {

	}

	@Override
	public void setMarginTop(String textIndent) {

	}

	@Override
	public void setMarginLeft(String textIndent) {

	}

	@Override
	public void setMarginRight(String textIndent) {

	}

	@Override
	public void setMarginBottom(String textIndent) {

	}

}
