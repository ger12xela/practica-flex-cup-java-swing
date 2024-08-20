package paneles;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.ger12xela.cemo_cli_jflex.Principal;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class Editor extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private final static String COMPILAR = "COMPILAR";
	private final static String REPORTE = "REPORTE";
	private final static String NUEVO = "NUEVO";
	private final static String ABRIR = "ABRIR";
	private final static String GUARDAR = "GUARDAR";

	private JPanel contentPane;
	private JTextArea textEditor;
	private JButton buttonCompilar;
	private JMenuItem mINuevo;
	private JMenuItem mntmAbrir;
	private JMenuItem mntmGuardar;
	private JLabel lblLinea;
	private JLabel lblColumna;
	private ReporteTokens RT;

	Principal miApp;
	private JButton btnReporte;

	public Editor(Principal principal) {
		this();
		this.miApp = principal;
		NumeroLinea n = new NumeroLinea(textEditor);
		scrollPane1.setRowHeaderView(n);
	}

	boolean sinError = false;
	/**
	 * Create the frame.
	 */
	public Editor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1074, 807);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);

		mINuevo = new JMenuItem("Nuevo");
		mINuevo.setActionCommand(NUEVO);
		mINuevo.addActionListener(this);
		mnNewMenu.add(mINuevo);

		mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.setActionCommand(ABRIR);
		mntmAbrir.addActionListener(this);
		mnNewMenu.add(mntmAbrir);

		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setActionCommand(GUARDAR);
		mntmGuardar.addActionListener(this);
		mnNewMenu.add(mntmGuardar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 75));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);

		buttonCompilar = new JButton("Compilar");
		buttonCompilar.setBounds(10, 11, 89, 23);
		buttonCompilar.setActionCommand(COMPILAR);
		buttonCompilar.addActionListener(this);
		panel.add(buttonCompilar);

		lblLinea = new JLabel("Linea:");
		lblLinea.setBounds(786, 50, 100, 14);
		panel.add(lblLinea);

		lblColumna = new JLabel("Columna: ");
		lblColumna.setBounds(786, 15, 100, 14);
		panel.add(lblColumna);

		btnReporte = new JButton("Reporte");
		btnReporte.setBounds(10, 41, 89, 23);
		btnReporte.setActionCommand(REPORTE);
		btnReporte.addActionListener(this);
		panel.add(btnReporte);
		
		scrollPane1 = new JScrollPane();
		contentPane.add(scrollPane1, BorderLayout.CENTER);
		
				textEditor = new JTextArea();
				scrollPane1.setViewportView(textEditor);
	}

	public JTextArea getTextEditor() {
		return textEditor;
	}

	private Archivo archivo = null;
	private JFileChooser openFile;
	private JScrollPane scrollPane1;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(COMPILAR)) {
			// aqui bien lo chido
			miApp.parsear();

		} else if (e.getActionCommand().equals(REPORTE)) {
			if (RT != null && sinError) {
				System.out.println("preciono reporte");
				RT.llenar();
				RT.setVisible(true);
			}

		} else if (e.getActionCommand().equals(ABRIR)) {
			// para abrir
			openFile = new JFileChooser();
			if (openFile.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

				archivo = new Archivo(openFile.getSelectedFile().getAbsolutePath());
				try {
					textEditor.setText(archivo.getContenido());
				} catch (IOException e1) {

					e1.printStackTrace();
				}
			}

		} else if (e.getActionCommand().equals(GUARDAR)) {
			// aqui bien lo chido
			if (archivo == null) {
				openFile = new JFileChooser();
				if (openFile.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

					archivo = new Archivo(openFile.getSelectedFile().getAbsolutePath());/// falta
					try {
						archivo.Guardar(textEditor.getText());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}else {
				try {
					archivo.Guardar(textEditor.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		} else if (e.getActionCommand().equals(NUEVO)) {
			archivo = null;
			textEditor.setText("");
		}

	}

	/**
	 * @return the rT
	 */
	public ReporteTokens getRT() {
		return RT;
	}

	/**
	 * @param rT the rT to set
	 */
	public void setRT(ReporteTokens rT) {
		RT = rT;
	}

	/**
	 * @return the sinError
	 */
	public boolean isSinError() {
		return sinError;
	}

	/**
	 * @param sinError the sinError to set
	 */
	public void setSinError(boolean sinError) {
		this.sinError = sinError;
	}
}
