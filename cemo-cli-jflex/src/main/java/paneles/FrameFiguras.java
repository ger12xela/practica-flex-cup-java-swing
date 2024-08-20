package paneles;

import javax.swing.JFrame;
import java.io.*;
import figuras.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;


public class FrameFiguras extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	public static final String ANIMAR =  "ANIMAR";
	public static final String EXPORTAR =  "EXPORTAR";
	private JPanel contentPane;

	Circulo c = new Circulo("caome", 100,100, Color.red, 100);
	private Pizarra pizarra;
	private JButton btnAnimacion;
	private JButton btnExportar;

	/**
	 * Create the frame.
	 */
	public FrameFiguras() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);
		
		pizarra = new Pizarra();
		scrollPane.setViewportView(pizarra);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 40));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnAnimacion = new JButton("Animacion");
		btnAnimacion.addActionListener(this);
		btnAnimacion.setActionCommand(ANIMAR);
		panel.add(btnAnimacion);
		
		btnExportar = new JButton("Exportar");
		btnExportar.setActionCommand(EXPORTAR);
		btnExportar.addActionListener(this);
		panel.add(btnExportar);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(ANIMAR)) {
			pizarra.contar();
			//pizarra.animar();
		}else if(e.getActionCommand().equals(EXPORTAR)) {
			JFileChooser sl = new JFileChooser();
			if(sl.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) {
				
			BufferedImage img = new BufferedImage(pizarra.getWidth(), pizarra.getHeight(), BufferedImage.TYPE_INT_RGB);
			pizarra.paint(img.getGraphics());
			try {
				ImageIO.write(	img, "png", new File(sl.getSelectedFile().getAbsolutePath()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			
		}
	}
	public Pizarra getPizarra() {
		return pizarra;
	}

}
