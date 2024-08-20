package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Poligono extends FiguraGeometrica {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int cantLados, ancho, alto, radio;
	Polygon p;

	/**
	 * @param name      nombre de la figura
	 * @param posx      respecto a la parte superior izquierda
	 * @param posy      respecto a la parte superior izquierda en vertica
	 * @param color     de la figura
	 * @param cantLados poligono regular
	 * @param ancho     para obtener un lado
	 * @param alto      de la figura poligono regular
	 */
	public Poligono(String name, int posx, int posy, Color color, int cantLados, int ancho, int alto) {
		super(name, posx, posy, color);
		this.cantLados = cantLados;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public void dibujar(Graphics g) {
		// TODO Auto-generated method stub
		super.dibujar(g);
		if (cantLados > 2) {
			radio = alto / 2;
			p = new Polygon();
			p.addPoint(posx + radio, posy);
			for (int i = 1; i < cantLados ; i++) {
				
				p.addPoint((int) (posx + radio * Math.cos(2 * i * Math.PI / cantLados)),
						(int) (posy - radio * Math.sin(2 * i * Math.PI / cantLados)));
				
				
			}
		}
		if (p != null) {
			figura = (Graphics2D)g;
			figura.setColor(color);
			figura.fillPolygon(p);
		}
	}

}
