package br.jreport.core.impl;

import java.util.Map;

import br.jreport.core.api.style.NewTableStyle;
import br.jreport.core.api.style.NewTextStyle;

public class NewTableStyleIml implements NewTableStyle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NewTextStyleIml theader;
	private NewTextStyleIml tbody;

	public NewTableStyleIml(Style classe, NewTextStyleIml theader, NewTextStyleIml tbody) {
		this.theader = theader;
		this.tbody = tbody;
		try {
			classe = classe.getClasse().isEmpty() ? Style.of("default.table").get() : classe;
			Map<String, String> map = StyleMap.getClassStyle(classe.getClasse());
			if (map.isEmpty()) {// se a lista vier vazia, vem o default
				classe = Style.of("default.table").get();
				map = StyleMap.getClassStyle(classe.getClasse());
			}
			setParams(theader, tbody, map);
		} catch (NullPointerException e) {
			classe = Style.of("default.table").get();
			Map<String, String> map = StyleMap.getClassStyle(classe.getClasse());
			setParams(theader, tbody, map);
		}

	}

	private void setParams(NewTextStyleIml theader, NewTextStyleIml tbody, Map<String, String> map) {
		/**
		 * Thead
		 **/
		setTheadHorizontalAlignment(map.get("thead.horizontal-alignment"));
		setTheadVerticalAlignment(map.get("thead.vertical-alignment"));
		setTheadHeight(map.get("thead.height"));
		setTheadWidth(map.get("thead.width"));
		setTheadBorderColor(map.get("thead.border-color"));
		setTheadBorderTopWidth(map.get("thead.border-top-width"));
		setTheadBorderLeftWidth(map.get("thead.border-left-width"));
		setTheadBorderRightWidth(map.get("thead.border-right-width"));
		setTheadBorderBottomWidth(map.get("thead.border-bottom-width"));
		setTheadColspan(map.get("thead.colspan"));
		setTheadRolspan(map.get("thead.rolspan"));
		setTheadBackgroundCellColor(map.get("thead.background-color"));

		theader.setColor(map.get("thead.color"));
		theader.setTextAlign(map.get("thead.text-align"));
		theader.setTextAlignNumber(map.get("thead.text-align-number"));
		theader.setTextDecoration(map.get("thead.text-decoration"));
		theader.setTextIndent(map.get("thead.text-indent"));
		theader.setTextMarginLeft(map.get("thead.margin-left"));
		theader.setFontSize(map.get("thead.font-size"));
		theader.setFontStyle(map.get("thead.font-style"));
		theader.setFontWeight(map.get("thead.font-weight"));
		/**
		 * TBody
		 **/
		setHorizontalAlignment(map.get("horizontal-alignment"));
		setVerticalAlignment(map.get("vertical-alignment"));
		setHeight(map.get("height"));
		setWidth(map.get("width"));
		setBorderColor(map.get("border-color"));
		setBorderLeftWidth(map.get("border-left-width"));
		setBorderRightWidth(map.get("border-right-width"));
		setBorderBottomWidth(map.get("border-bottom-width"));
		setBorderTopWidth(map.get("border-top-width"));
		setColspan(map.get("colspan"));
		setRolspan(map.get("rolspan"));
		setBackgroundCellColor(map.get("background-color"));
		setBackgroundCellColorPar(map.get("background-color-par"));

		tbody.setColor(map.get("color"));
		tbody.setTextAlign(map.get("text-align"));
		tbody.setTextAlignNumber(map.get("text-align-number"));
		tbody.setTextDecoration(map.get("text-decoration"));
		tbody.setTextIndent(map.get("text-indent"));
		tbody.setTextMarginLeft(map.get("margin-left"));
		tbody.setFontSize(map.get("font-size"));
		tbody.setFontStyle(map.get("font-style"));
		tbody.setFontWeight(map.get("font-weight"));
	}

	@Override
	public void setVerticalAlignment(String color) {

	}

	@Override
	public void setHorizontalAlignment(String textAlign) {

	}

	@Override
	public void setHeight(String textDecoration) {

	}

	@Override
	public void setWidth(String textIndent) {

	}

	@Override
	public void setBorderColor(String textMarginLeft) {

	}

	@Override
	public void setBorderWidth(String textMarginLeft) {

	}

	@Override
	public void setBorderTopWidth(String textMarginLeft) {

	}

	@Override
	public void setBorderLeftWidth(String textMarginLeft) {

	}

	@Override
	public void setBorderRightWidth(String textMarginLeft) {

	}

	@Override
	public void setBorderBottomWidth(String textMarginLeft) {

	}

	@Override
	public void setColspan(String fontSize) {

	}

	@Override
	public void setRolspan(String fontWeight) {

	}

	@Override
	public void setBackgroundCellColor(String fontStyle) {

	}

	@Override
	public void setTheadVerticalAlignment(String color) {

	}

	@Override
	public void setTheadHorizontalAlignment(String textAlign) {

	}

	@Override
	public void setTheadHeight(String textDecoration) {

	}

	@Override
	public void setTheadWidth(String textIndent) {

	}

	@Override
	public void setTheadBorderColor(String textMarginLeft) {

	}

	@Override
	public void setTheadBorderWidth(String textMarginLeft) {

	}

	@Override
	public void setTheadBorderTopWidth(String textMarginLeft) {

	}

	@Override
	public void setTheadBorderLeftWidth(String textMarginLeft) {

	}

	@Override
	public void setTheadBorderRightWidth(String textMarginLeft) {

	}

	@Override
	public void setTheadBorderBottomWidth(String textMarginLeft) {

	}

	@Override
	public void setTheadColspan(String fontSize) {

	}

	@Override
	public void setTheadRolspan(String fontWeight) {

	}

	@Override
	public void setTheadBackgroundCellColor(String fontStyle) {

	}

	@Override
	public void setTheadNewTextStyle(NewTextStyle style) {

	}

	@Override
	public NewTextStyle getTheadNewTextStyle() {
		return theader;
	}

	@Override
	public void setNewTextStyle(NewTextStyle style) {

	}

	@Override
	public NewTextStyle getNewTextStyle() {
		return tbody;
	}

	@Override
	public void setBackgroundCellColorPar(String fontStyle) {
		

	}

}
