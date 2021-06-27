package com.educacionIT.javase.enumerados;

public enum Colores {
	NEGRO("000000", "0,0,0"), AZUL("0000FF", "0,0,255"), 
	MARRON("4E3B31", "78,59,49"), GRIS("808080", "128,128,128"),
	VERDE("008000", "0,128,0"), NARANJA("FF6600", "255,102,0"), 
	ROSA("FFC0CB", "255,192,203"), PURPURA("800080", "128,0,128"), 
	ROJO("FF0000", "255,0,0"), BLANCO("FFFFFF", "255,255,255"),
	AMARILLO("FFFF00", "255,255,0");

	private String HEX_CODIGO;
	private String RGB_CODIGO;

	private Colores(String HEX_CODIGO, String RGB_CODIGO) {
		this.HEX_CODIGO = HEX_CODIGO;
		this.RGB_CODIGO = RGB_CODIGO;
	}

	public String getHEX_CODIGO() {
		return HEX_CODIGO;
	}

	public String getRGB_CODIGO() {
		return RGB_CODIGO;
	}

}
