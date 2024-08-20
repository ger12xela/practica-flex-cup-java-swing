package com.ger12xela.cemo_cli_jflex;

public class ErrorToken {
	String lexema, tipo, descripcion;
	int linea, columna;
	/**
	 * @param lexema el lexema de error;
	 * @param tipo tipo de error 
	 * @param descripcion descripcion del error
	 * @param linea linea donde sucede el error 
	 * @param columna donde sucede el error 
	 */
	public ErrorToken(String lexema, String tipo, String descripcion, int linea, int columna) {
		this.lexema = lexema;
		this.tipo = tipo;
		this.descripcion = descripcion;
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
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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