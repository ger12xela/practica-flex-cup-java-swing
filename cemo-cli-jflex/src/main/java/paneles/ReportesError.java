package paneles;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import java.util.ArrayList;
import com.ger12xela.cemo_cli_jflex.ErrorToken;

import java.awt.Dimension;

public class ReportesError extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int contador;
	private JTable tableLexico;
	private JTable tableSintactico;
	ArrayList<ErrorToken> RL= new ArrayList<>();
	ArrayList<ErrorToken> RS= new ArrayList<>();;

	/**
	 * Create the frame.
	 */
	public ReportesError() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 884, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setPreferredSize(new Dimension(217, 300));
		splitPane.setMinimumSize(new Dimension(217, 300));
		splitPane.setDoubleBuffered(true);
		splitPane.setDividerSize(25);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(23, 300));
		scrollPane.setPreferredSize(new Dimension(2, 300));
		splitPane.setLeftComponent(scrollPane);
		
		tableLexico = new JTable();
		tableLexico.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(tableLexico);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		splitPane.setRightComponent(scrollPane_1);
		
		tableSintactico = new JTable();
		tableSintactico.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane_1.setViewportView(tableSintactico);
	}
	
	public void colocar() {
		if (!RL.isEmpty()) {
			DefaultTableModel ML = new DefaultTableModel(new String[] {"lexema","Linea","Columna","Tipo","Descripcion"},RL.size());
			tableLexico.setModel(ML);
			TableModel modeloLexico = tableLexico.getModel();
			int tm=0;
			for (ErrorToken errorToken : RL) {
				
					modeloLexico.setValueAt(errorToken.getLexema(),tm,0);;
					modeloLexico.setValueAt(errorToken.getLinea(),tm,1);;
					modeloLexico.setValueAt(errorToken.getColumna(),tm,2);;
					modeloLexico.setValueAt(errorToken.getTipo(),tm,3);;
					modeloLexico.setValueAt(errorToken.getDescripcion(),tm,4);;
					tm++;
			}
		}
		if (!RS.isEmpty()) {
			DefaultTableModel MS = new DefaultTableModel(new String[] {"lexema","Linea","Columna","Tipo","Descripcion"},RS.size());
			tableSintactico.setModel(MS);
			TableModel modeloSintactico = tableSintactico.getModel();
			int tma=0;
			for (ErrorToken errorToken : RS) {
				
				modeloSintactico.setValueAt(errorToken.getLexema(),tma,0);;
				modeloSintactico.setValueAt(errorToken.getLinea(),tma,1);;
				modeloSintactico.setValueAt(errorToken.getColumna(),tma,2);;
				modeloSintactico.setValueAt(errorToken.getTipo(),tma,3);;
				modeloSintactico.setValueAt(errorToken.getDescripcion(),tma,4);;
					tma++;
			}
		}
		
	}
	
	public void agregarEL(ErrorToken a) {
		if(RL !=null) {
			
		RL.add(a);
		}
	}
	
	public void agregarES(ErrorToken a) {
		if(RS !=null) {
			
		RS.add(a);
		}
	}
	
	/**
	 * @return the rL
	 */
	public ArrayList<ErrorToken> getRL() {
		return RL;
	}

	/**
	 * @param rL the rL to set
	 */
	public void setRL(ArrayList<ErrorToken> rL) {
		RL = rL;
	}

	/**
	 * @return the rS
	 */
	public ArrayList<ErrorToken> getRS() {
		return RS;
	}

	/**
	 * @param rS the rS to set
	 */
	public void setRS(ArrayList<ErrorToken> rS) {
		RS = rS;
	}

	public JTable getTableLexico() {
		return tableLexico;
	}
	
	public JTable getTableSintactico() {
		return tableSintactico;
	}
		
	/**
	 * @return the contador
	 */
	public int getContador() {
		return contador;
	}
	/**
	 * @param contador the contador to set
	 */
	public void setContador(int contador) {
		this.contador = contador;
	}
}
