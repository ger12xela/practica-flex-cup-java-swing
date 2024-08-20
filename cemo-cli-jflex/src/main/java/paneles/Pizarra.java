package paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

import figuras.FiguraGeometrica;

public class Pizarra extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	ArrayList<FiguraGeometrica> A = new ArrayList<FiguraGeometrica>();

	public Pizarra() {
		setPreferredSize(new Dimension(1000, 2000));
	}

	public void agregarFigura(FiguraGeometrica a) {
		A.add(a);

	}

	/**
	 * llama la ultimiva figura en la lista de figuras en la pizzarra
	 * 
	 * @return figura geometrica
	 */
	public FiguraGeometrica getFigura() {
		return A.getLast();

	}

	int cantAnima = 0;

	public void contar() {

		for (FiguraGeometrica figuraGeometrica : A) {
			if (figuraGeometrica.getOrden() > 0) {
				cantAnima++;
			}
		}
	}

	int turno = 1;

	public void animar() {
		if (cantAnima != 0 && turno <= cantAnima) {
			FiguraGeometrica tmp = null;
			for (FiguraGeometrica figuraGeometrica : A) {

				if (figuraGeometrica.getOrden() == turno) {
					figuraGeometrica.setBoolmov(true);
					while (figuraGeometrica.isBoolmov()) {
						figuraGeometrica.mover();
						try {
							this.repaint();
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					turno++;
				}
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		System.out.println("en el paint");
		if (!A.isEmpty()) {
			for (FiguraGeometrica figura : A) {
				figura.dibujar(g);
			}
		}
	}

	public Dimension getPreDimension() {
		return new Dimension(1500, 1500);
	}

}
