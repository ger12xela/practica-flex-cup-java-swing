package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circulo extends FiguraGeometrica {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int radio;
	
	public Circulo(String name, int posx, int posy, Color color, int radio) {
		super(name, posx, posy, color);
		this.radio = radio;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar (Graphics g)   {
		// TODO Auto-generated method stub	
		super.dibujar(g);
		figura = (Graphics2D)g;
		figura.setColor(color);
		figura.fillOval(posx, posy, radio, radio);

	}

	/**
	 * @return the radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}
}
