package paneles;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.ger12xela.cemo_cli_jflex.Token;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;

public class ReporteTokens extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableOperadores;
	private JTable tableObjetos;
	private JTable tableColores;
	private JTable tableAnimaciones;
	
	int azul,rojo,amarillo,verde,negro,blanco,gris,rosa,naranja;//colores
	int curva,linea; //animacion
	int circulo,cuadrado,rectangulo, linea1,poligono;//objetos
	ArrayList<Token> operadores = new ArrayList<>();

	/**
	 * Create the frame.
	 */
	public ReporteTokens() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 883, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operadores Matematicos");
		lblNewLabel.setLocation(78, 11);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setSize(new Dimension(265, 28));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 39, 375, 157);
		panel.add(scrollPane_1);
		
		tableOperadores = new JTable();
		scrollPane_1.setViewportView(tableOperadores);
		tableOperadores.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		
		JLabel lblColoresUsados = new JLabel("Colores usados");
		lblColoresUsados.setSize(new Dimension(265, 28));
		lblColoresUsados.setHorizontalAlignment(SwingConstants.CENTER);
		lblColoresUsados.setBounds(501, 11, 265, 28);
		panel.add(lblColoresUsados);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(447, 39, 375, 157);
		panel.add(scrollPane_1_1);
		
		tableColores = new JTable();
		tableColores.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane_1_1.setViewportView(tableColores);
		
		JLabel lblObjetosUsados = new JLabel("Objetos usados ");
		lblObjetosUsados.setSize(new Dimension(265, 28));
		lblObjetosUsados.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjetosUsados.setBounds(78, 235, 265, 28);
		panel.add(lblObjetosUsados);
		
		JScrollPane scrollPane_1_2 = new JScrollPane();
		scrollPane_1_2.setBounds(24, 263, 375, 157);
		panel.add(scrollPane_1_2);
		
		tableObjetos = new JTable();
		tableObjetos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane_1_2.setViewportView(tableObjetos);
		
		JLabel lblAnimacionesUsadas = new JLabel("Animaciones usadas");
		lblAnimacionesUsadas.setSize(new Dimension(265, 28));
		lblAnimacionesUsadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimacionesUsadas.setBounds(501, 235, 265, 28);
		panel.add(lblAnimacionesUsadas);
		
		JScrollPane scrollPane_1_3 = new JScrollPane();
		scrollPane_1_3.setBounds(447, 263, 375, 157);
		panel.add(scrollPane_1_3);
		
		tableAnimaciones = new JTable();
		tableAnimaciones.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane_1_3.setViewportView(tableAnimaciones);
	}
	
	public void llenar() {
		//lenara las tablas
		//Colores
		DefaultTableModel ColoresModel = new DefaultTableModel(new String[] {"Color","Cantidad de usos"}, 9);
		tableColores.setModel(ColoresModel);
		TableModel modelColores = tableColores.getModel();
		modelColores.setValueAt("Azul", 0, 0);
		modelColores.setValueAt(azul, 0, 1);
		modelColores.setValueAt("Rojo", 1, 0);
		modelColores.setValueAt(rojo, 1, 1);
		modelColores.setValueAt("Amarillo", 2, 0);
		modelColores.setValueAt(amarillo, 2, 1);
		modelColores.setValueAt("Verde", 3, 0);
		modelColores.setValueAt(verde, 3, 1);
		modelColores.setValueAt("Negro", 4, 0);
		modelColores.setValueAt(negro, 4, 1);
		modelColores.setValueAt("Blanco", 5, 0);
		modelColores.setValueAt(blanco, 5, 1);
		modelColores.setValueAt("Gris", 6, 0);
		modelColores.setValueAt(gris, 6, 1);
		modelColores.setValueAt("Rosa", 7, 0);
		modelColores.setValueAt(rosa, 7, 1);
		modelColores.setValueAt("Naranja", 8, 0);
		modelColores.setValueAt(naranja, 8, 1);
		
		//objetos
		DefaultTableModel objetosModel = new DefaultTableModel(new String[] {"Objeto","Cantidad de usos"}, 5);
		tableObjetos.setModel(objetosModel);
		TableModel modelObjeto = tableObjetos.getModel();
		modelObjeto.setValueAt("Circulo", 0, 0);
		modelObjeto.setValueAt(circulo, 0, 1);
		modelObjeto.setValueAt("Cuadrado", 1, 0);
		modelObjeto.setValueAt(cuadrado, 1, 1);
		modelObjeto.setValueAt("Rectangulo", 2, 0);
		modelObjeto.setValueAt(rectangulo, 2, 1);
		modelObjeto.setValueAt("Linea", 3, 0);
		modelObjeto.setValueAt(linea1, 3, 1);
		modelObjeto.setValueAt("Poligono", 4, 0);
		modelObjeto.setValueAt(poligono, 4, 1);
		
		//animaciones
		DefaultTableModel animacionModel = new DefaultTableModel(new String[] {"Animacion","cantidad de usos"},2);
		tableAnimaciones.setModel(animacionModel);
		TableModel modelanimacion = tableAnimaciones.getModel();
		modelanimacion.setValueAt("curva", 0, 0);
		modelanimacion.setValueAt(curva, 0, 1);
		modelanimacion.setValueAt("linea", 1, 0);
		modelanimacion.setValueAt(linea, 1, 1);
		
		if(!operadores.isEmpty()) {
			DefaultTableModel operadoresModelo = new DefaultTableModel(
					new String[] {"Operador","Linea","columna","Ocurrencia"},operadores.size());
			tableOperadores.setModel(operadoresModelo);
			TableModel modeloperadores = tableOperadores.getModel();
			for (int i = 0; i < operadores.size(); i++) {
				modeloperadores.setValueAt(operadores.get(i).getTipo(), i, 0);
				modeloperadores.setValueAt(operadores.get(i).getLinea(), i, 1);
				modeloperadores.setValueAt(operadores.get(i).getColumna(), i, 2);
				modeloperadores.setValueAt(operadores.get(i).getLexema(), i, 3);
			}
		}
			
	}
	public void addMatematicos(Token token) {
		if(token!=null) {
			operadores.add(token);
		}
	}
	
	public void sumTipo(Token e) {
		switch (e.getTipo()) {
		case "azul":
				azul++;
			break;
		case "rojo":
			rojo++;
			break;
		case "amarillo":
			amarillo++;
			break;
		case "verde":
			verde++;
			break;
		case "negro":
			negro++;
			break;
		case "blanco":
			blanco++;
			break;
		case "gris":
			gris++;
			break;
		case "rosa":
			rosa++;
			break;
		case "naranja":
			naranja++;
			break;
			//objeto
		case "circulo":
			circulo++;
			break;
		case "cuadrado":
			cuadrado++;
			break;
		case "rectangulo":
			rectangulo++;
			break;
		case "linea":
			linea1++;
			break;
		case "poligono":
			poligono++;
			break;
			//animacion
		case "curva":
			curva++;
			break;
		case "lineaG":
			linea++;
			break;
		default:
			break;
		}
	}
	


}
