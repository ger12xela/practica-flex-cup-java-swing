package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cuadrado extends FiguraGeometrica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lado;
	
	/**
	 * 
	 * @param name nombre de la figur
	 * @param posx respecto a el aldo izquierdo del panel
	 * @param posy respecto a el lado superior del frame
	 * @param color del relleno 
	 * @param lado del cuadrado 
	 */
	public Cuadrado(String name, int posx, int posy, Color color, int lado) {
		super(name, posx, posy, color);
		this.lado = lado;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void dibujar(Graphics g) {
		// TODO Auto-generated method stub
		super.dibujar(g);
		figura = (Graphics2D)g;
		figura.setColor(color);
		figura.fillRect(posx, posy, lado, lado);
	}


	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}

}
