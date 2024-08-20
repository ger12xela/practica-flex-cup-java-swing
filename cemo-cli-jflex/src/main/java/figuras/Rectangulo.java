package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangulo extends FiguraGeometrica {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int ancho;
	int alto;
	
	/**
	 * 
	 * @param name nombre de la figura
	 * @param posx respecto a el lado izquierdo del panel
	 * @param posy respecto a el lado superior del panel 
	 * @param color del relleno de la figura 
	 * @param ancho ancho del rectangulo
	 * @param alto alto del rectangulo
	 */
	public Rectangulo(String name, int posx, int posy, Color color, int ancho, int alto) {
		super(name, posx, posy, color);
		this.ancho = ancho;
		this.alto = alto;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar(Graphics g) {
		// TODO Auto-generated method stub
		super.dibujar(g);
		figura = (Graphics2D)g;
		figura.setColor(color);
		figura.fillRect(posx, posy, ancho, alto);
		
	}
	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}
	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}
	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	

}
