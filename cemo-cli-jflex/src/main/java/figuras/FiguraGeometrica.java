package figuras;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class FiguraGeometrica extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Color color;
	int posx;
	int posy;
	String name;
	Graphics2D figura;

	/**
	 * 
	 * @param name  de la figura se quedara guardad.
	 * @param posx  posicion de inicial de la figura en relacion de la esquina
	 *              superiro izquierda
	 * @param posy  posicion de inicial de la figura en relacion de la esquina
	 *              superiro izquierda
	 * @param color de la figura
	 */
	public FiguraGeometrica(String name, int posx, int posy, Color color) {
		this.color = color;
		this.posx = posx;
		this.posy = posy;
		this.name = name;
	}

	public void dibujar(Graphics g) {
		
	}

	int findx, findy, orden ;
	boolean boolmov = false;
	String mov;
	/**
	 * @param findx punto al cual llegara la figura horizontal
	 * @param findy punto al cual llegara la figura en vertical
	 * @param orden orden en el cual se ejecutan las animaciones
	 * @param mov tipo de animacion
	 */
	public void activarMov(int findx, int findy, int orden, String mov) {
		this.findx = findx;
		this.findy = findy;
		this.orden = orden;
		this.mov = mov;
	}

	public void mover() {

		if (boolmov) {
			
			boolean correctox=false;
			boolean correctoy=false;

				
					if (findx < posx) {
						posx--;
					} else if (findx > posx) {
						posx++;
						// derecha
					} else if (findx == posx) {
						correctox=true;
						System.out.println("secompleto x");
					}
					//-----------------
					if (findy < posy) {
						posy--;
					} else if (findy > posy) {
						posy++;
					} else if (findy == posy) {
						correctoy=true;
						System.out.println("secompleto y");
					}
					
					if(correctox && correctoy) {
						boolmov=false;
					}
					
			}

		
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the posx
	 */
	public int getPosx() {
		return posx;
	}

	/**
	 * @param posx the posx to set
	 */
	public void setPosx(int posx) {
		this.posx = posx;
	}

	/**
	 * @return the posy
	 */
	public int getPosy() {
		return posy;
	}

	/**
	 * @param posy the posy to set
	 */
	public void setPosy(int posy) {
		this.posy = posy;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the boolmov
	 */
	public boolean isBoolmov() {
		return boolmov;
	}

	/**
	 * @param boolmov the boolmov to set
	 */
	public void setBoolmov(boolean boolmov) {
		this.boolmov = boolmov;
	}

	/**
	 * @return the orden
	 */
	public int getOrden() {
		return orden;
	}

	/**
	 * @param orden the orden to set
	 */
	public void setOrden(int orden) {
		this.orden = orden;
	}

}
