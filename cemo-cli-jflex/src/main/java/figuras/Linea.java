package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Linea extends FiguraGeometrica {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int posx2,posy2;

	/**
	 * @param name nombre de la figura 
	 * @param posx inicio de linea 
	 * @param posy inicio de linea vertica
	 * @param color color de la linea 
	 * @param posx2 fin de linea 
	 * @param posy2 fin de linea vertica
	 */
	public Linea(String name, int posx, int posy, Color color, int posx2, int posy2) {
		super(name, posx, posy, color);
		this.posx2 = posx2;
		this.posy2 = posy2;
	}
	@Override
	public void dibujar(Graphics g) {
		// TODO Auto-generated method stub
		super.dibujar(g);
		figura = (Graphics2D)g;
		figura.setColor(color);
		figura.drawLine(posx, posy, posx2, posy2);
	}

	/**
	 * @return the posx2
	 */
	public int getPosx2() {
		return posx2;
	}

	/**
	 * @param posx2 the posx2 to set
	 */
	public void setPosx2(int posx2) {
		this.posx2 = posx2;
	}

	/**
	 * @return the posy2
	 */
	public int getPosy2() {
		return posy2;
	}

	/**
	 * @param posy2 the posy2 to set
	 */
	public void setPosy2(int posy2) {
		this.posy2 = posy2;
	}
	
}
