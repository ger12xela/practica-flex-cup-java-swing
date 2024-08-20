package com.ger12xela.cemo_cli_jflex;

public class Token {
	
	String lexema,Tipo;
	int linea,columna;
	/**
	 * @param lexema el contenido del token la palabra
	 * @param tipo el token al cual se hace referencia
	 * @param linea de la posicion
	 * @param columna de la posicion
	 */
	public Token(String lexema, String tipo, int linea, int columna) {
		this.lexema = lexema;
		Tipo = tipo;
		this.linea = linea;
		this.columna = columna;
	}
	/**
	 * @return the lexema
	 */
	public String getLexema() {
		return lexema;
	}
	/**
	 * @param lexema the lexema to set
	 */
	public void setLexema(String lexema) {
		this.lexema = lexema;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	/**
	 * @return the linea
	 */
	public int getLinea() {
		return linea;
	}
	/**
	 * @param linea the linea to set
	 */
	public void setLinea(int linea) {
		this.linea = linea;
	}
	/**
	 * @return the columna
	 */
	public int getColumna() {
		return columna;
	}
	/**
	 * @param columna the columna to set
	 */
	public void setColumna(int columna) {
		this.columna = columna;
	}

}
