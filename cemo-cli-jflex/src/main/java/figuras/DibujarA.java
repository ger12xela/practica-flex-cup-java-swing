package figuras;

import java.awt.Color;


import paneles.FrameFiguras;
import paneles.Pizarra;

public class DibujarA {
	
	FrameFiguras f = new FrameFiguras();
	int posx, posy, lado, ancho;
	Circulo c = new Circulo("circulo 1 ", 100, 100, Color.red, 100);
	Circulo cir = new Circulo("oreja", 250, 100, Color.red, 100);
	Circulo ca = new Circulo("cir ", 150, 150, Color.red, 150);
	Cuadrado cua = new Cuadrado("nombre", posx, posy, null, lado);
	Rectangulo rc = new Rectangulo("pedro", posx, posy, Color.pink, ancho, lado);
	Poligono pol = new Poligono("poligono 1", 100, 200, Color.blue, 3, 40, 80);
	Pizarra a;
	public DibujarA() {
		f.setVisible(true); 
		a = f.getPizarra();
		a.agregarFigura(c);
		a.agregarFigura(cir);
		a.agregarFigura(ca);
		a.agregarFigura(pol);
		a.getFigura().activarMov(500, 500, 1, "linea");
		
//		f.repaint();
//		while(true) {
//			
//			f.getPizarra().repaint();
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}


}
