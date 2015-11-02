package GUI;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;

import GUI.PruebaTabla.TableDataChange;
import utilities.*;

public class animaGUI {

	JFrame frame;
	private JTextField getterName;
	private JComboBox getterLevel;
	private JTextField textFieldApa;
	private JTable tablaAtributos;
	private JTextField textFieldPD;
	private JTextField textFieldTam;
	private JTextArea textAreaTirador;
	private JButton btnTiradorAtributos;
	private JButton btnTiradorApa;
	private JComboBox getterTipoTiradaAtributos;
	private Integer tipoTirada=1; 
	private JComboBox getterClase;
	private JPanel imagePanel;
	private BufferedImage imagen;
	private JLabel imagenLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					animaGUI window = new animaGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public animaGUI() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tablaAtributos = new JTable();
		tablaAtributos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tablaAtributos.setCellSelectionEnabled(true);
		tablaAtributos.setBounds(37, 233, 262, 128);
		frame.getContentPane().add(tablaAtributos);
		tablaAtributos.setBackground(Color.WHITE);
		tablaAtributos.setToolTipText("");
		tablaAtributos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaAtributos.setModel(new DefaultTableModel(
			new Object[][] {
				{"AGI", null, null, null},
				{"CON", null, null, null},
				{"DES", null, null, null},
				{"FUE", null, null, null},
				{"INT", null, null, null},
				{"PER", null, null, null},
				{"POD", null, null, null},
				{"VOL", null, null, null},
			},
			new String[] {
				"", "Base", "Actual", "Bono"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		tablaAtributos.getColumnModel().getColumn(0).setResizable(false);
		tablaAtributos.getColumnModel().getColumn(1).setResizable(false);
		tablaAtributos.getColumnModel().getColumn(2).setResizable(false);
		tablaAtributos.getColumnModel().getColumn(3).setResizable(false);
		
		
//Nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(37, 49, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		getterName = new JTextField();
		getterName.setBounds(93, 46, 86, 20);
		frame.getContentPane().add(getterName);
		getterName.setColumns(10);
		
//Nivel
		JLabel lblNewLabel = new JLabel("Nivel");
		lblNewLabel.setBounds(235, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		getterLevel = new JComboBox();
		getterLevel.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6"}));
		getterLevel.setBounds(272, 46, 46, 20);
		frame.getContentPane().add(getterLevel);
		ActionLevel actionLevel=new ActionLevel();
		getterLevel.addActionListener(actionLevel);
		
//Clase		
		JLabel lblCategora = new JLabel("Categor\u00EDa");
		lblCategora.setBounds(37, 85, 55, 14);
		frame.getContentPane().add(lblCategora);
		
		getterClase = new JComboBox();
		getterClase.setModel(new DefaultComboBoxModel(new String[] {"Guerrero", "Guerrero Acrobata"}));
		getterClase.setBounds(93, 82, 145, 20);
		frame.getContentPane().add(getterClase);
		
		ActionClase actionClase=new ActionClase();
		getterClase.addActionListener(actionClase);
		
//PD
		JLabel lblPdesarrollo = new JLabel("P.Desarrollo");
		lblPdesarrollo.setBounds(272, 88, 73, 14);
		frame.getContentPane().add(lblPdesarrollo);
		
		textFieldPD = new JTextField();
		textFieldPD.setEditable(false);
		textFieldPD.setBounds(345, 85, 86, 20);
		frame.getContentPane().add(textFieldPD);
		textFieldPD.setColumns(10);
		textFieldPD.setText("400");
		
//Raza
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setBounds(37, 121, 46, 14);
		frame.getContentPane().add(lblRaza);
		
		final JComboBox getterRaza = new JComboBox();
		getterRaza.setModel(new DefaultComboBoxModel(new String[] {"Humano"}));
		getterRaza.setBounds(93, 118, 86, 20);
		frame.getContentPane().add(getterRaza);
		
		JLabel lblTamao = new JLabel("Tamano:");
		lblTamao.setBounds(272, 124, 46, 14);
		frame.getContentPane().add(lblTamao);
		
//Apariencia
		JLabel lblApariencia = new JLabel("Apariencia");
		lblApariencia.setBounds(37, 160, 55, 14);
		frame.getContentPane().add(lblApariencia);
		
		textFieldApa = new JTextField();
		textFieldApa.setEditable(false);
		textFieldApa.setBounds(93, 157, 86, 20);
		frame.getContentPane().add(textFieldApa);
		textFieldApa.setColumns(10);
		
		btnTiradorApa = new JButton("Tirador");
		btnTiradorApa.setBounds(229, 156, 89, 23);
		frame.getContentPane().add(btnTiradorApa);
		ActionTirador actionTiradorApa = new ActionTirador();
		btnTiradorApa.addActionListener(actionTiradorApa);
	
//Atributos
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(109, 215, 46, 14);
		frame.getContentPane().add(lblBase);
		
		JLabel lblActual = new JLabel("Actual");
		lblActual.setBounds(169, 215, 46, 14);
		frame.getContentPane().add(lblActual);
		
		JLabel lblBono = new JLabel("Bono");
		lblBono.setBounds(247, 215, 46, 14);
		frame.getContentPane().add(lblBono);
		
		imagePanel = new JPanel();
		imagePanel.setBounds(539, 49, 271, 400);
		frame.getContentPane().add(imagePanel);
		
		
		
//Inserta imagen
		JPanel bloqueImagen=new JPanel();
		imagen = ImageIO.read(new File("src/Images/Guerrero.png"));
		imagenLabel = new JLabel(new ImageIcon(imagen));
		imagePanel.add(imagenLabel);
		imagePanel.repaint();

		
//Tirador y area
		btnTiradorAtributos = new JButton("Tirador");
		btnTiradorAtributos.setBounds(320, 229, 89, 23);
		frame.getContentPane().add(btnTiradorAtributos);
		ActionTirador actionTirador2 = new ActionTirador();
		btnTiradorAtributos.addActionListener(actionTirador2);
		
		getterTipoTiradaAtributos = new JComboBox();
		getterTipoTiradaAtributos.setModel(new DefaultComboBoxModel(new String[] {"Tipo 1", "Tipo 2", "Tipo 3", "Tipo 4"}));
		getterTipoTiradaAtributos.setBounds(443, 230, 64, 20);
		frame.getContentPane().add(getterTipoTiradaAtributos);
		ActionTipoTirada actionTipoTirada = new ActionTipoTirada();
		getterTipoTiradaAtributos.addActionListener(actionTipoTirada);
		
		
		textAreaTirador = new JTextArea();
		textAreaTirador.setEditable(false);
		textAreaTirador.setBounds(320, 256, 187, 105);
		frame.getContentPane().add(textAreaTirador);
		
		
		textFieldTam = new JTextField();
		textFieldTam.setEditable(false);
		textFieldTam.setBounds(343, 118, 81, 20);
		frame.getContentPane().add(textFieldTam);
		textFieldTam.setColumns(10);
		
		tablaAtributos.getModel().addTableModelListener(new TableDataChange());
		
	}
	
	public class ActionLevel implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			if(getterLevel.getSelectedItem()=="0"){
				textFieldPD.setText("400");
			}
			
			if(getterLevel.getSelectedItem()=="1"){
				textFieldPD.setText("600");
			}
			
			if(getterLevel.getSelectedItem()=="2"){
				textFieldPD.setText("700");
			}
			
		}
	}
	
	public class ActionTirador implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			if(event.getSource()==btnTiradorAtributos && tipoTirada==1)
				textAreaTirador.setText(utilities.Tirador.atributosTipo1().toString());
			
			if(event.getSource()==btnTiradorAtributos && tipoTirada==2)
				textAreaTirador.setText(utilities.Tirador.atributosTipo2().toString());
			
			if(event.getSource()==btnTiradorAtributos && tipoTirada==3){
				ArrayList<Integer> tiradas=utilities.Tirador.atributosTipo3();
				textAreaTirador.setText(tiradas.toString());
				for(int i=0;i<tiradas.size();i++){
					tablaAtributos.setValueAt(tiradas.get(i), i, 1);
				
				}

			}	
			
			if(event.getSource()==btnTiradorAtributos && tipoTirada==4){
				ArrayList<Integer> tiradas=utilities.Tirador.atributosTipo4();
				Integer suma=0;
				for(int i=0;i<7;i++)
					suma+=tiradas.get(i);
				textAreaTirador.setText(tiradas.toString().concat("\nTotal: "+suma.toString()));
			}
			
			if(event.getSource()==btnTiradorApa)
				textFieldApa.setText(utilities.Tirador.d10().toString());
		}
					
	}
	
	public class ActionTipoTirada implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			if(getterTipoTiradaAtributos.getSelectedItem()=="Tipo 1"){
				tipoTirada=1;
			}
			
			if(getterTipoTiradaAtributos.getSelectedItem()=="Tipo 2"){
				tipoTirada=2;
			}
			
			if(getterTipoTiradaAtributos.getSelectedItem()=="Tipo 3"){
				tipoTirada=3;
			}
			
			if(getterTipoTiradaAtributos.getSelectedItem()=="Tipo 4"){
				tipoTirada=4;
			}
		}
	}
	
	public class ActionClase implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			if(getterClase.getSelectedItem()=="Guerrero"){
				try {
					imagen = ImageIO.read(new File("src/Images/Guerrero.png"));
					imagenLabel = new JLabel(new ImageIcon(imagen));
					imagePanel.add(imagenLabel);
					imagePanel.repaint();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(getterClase.getSelectedItem()=="Guerrero Acrobata"){
				
					try {
						imagen = ImageIO.read(new File("src/Images/Acrobata.png"));
						imagenLabel = new JLabel(new ImageIcon(imagen));
						imagePanel.add(imagenLabel);
						imagePanel.repaint();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			}
			
		}
	}
	
	public class TableDataChange implements TableModelListener{
		
		public void tableChanged(TableModelEvent e){
			Integer fila =e.getFirstRow();
			Integer columna= e.getColumn();
			TableModel modelo=(TableModel)e.getSource();
			Object valor=modelo.getValueAt(fila, columna);
			textAreaTirador.setText(valor.toString());
		}
		
		
	}
	
}
