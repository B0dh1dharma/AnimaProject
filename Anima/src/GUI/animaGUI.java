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
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;

public class animaGUI {

	private JFrame frame;
	private JTextField getterName;
	private JTextField textField_1;
	private JTable tablaAtributos;
	private JTextField textField;
	private JTextField textField_2;

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
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(37, 49, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		getterName = new JTextField();
		getterName.setBounds(93, 46, 86, 20);
		frame.getContentPane().add(getterName);
		getterName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nivel");
		lblNewLabel.setBounds(235, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox getterLevel = new JComboBox();
		getterLevel.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		getterLevel.setBounds(272, 46, 46, 20);
		frame.getContentPane().add(getterLevel);
		
		JLabel lblCategora = new JLabel("Categor\u00EDa");
		lblCategora.setBounds(37, 85, 55, 14);
		frame.getContentPane().add(lblCategora);
		
		JComboBox getterClass = new JComboBox();
		getterClass.setModel(new DefaultComboBoxModel(new String[] {"Guerrero", "Guerrero Acr\u00F3bata"}));
		getterClass.setBounds(93, 82, 145, 20);
		frame.getContentPane().add(getterClass);
		
		JLabel lblPdesarrollo = new JLabel("P.Desarrollo");
		lblPdesarrollo.setBounds(272, 88, 73, 14);
		frame.getContentPane().add(lblPdesarrollo);
		
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setBounds(37, 121, 46, 14);
		frame.getContentPane().add(lblRaza);
		
		JComboBox getterRaza = new JComboBox();
		getterRaza.setModel(new DefaultComboBoxModel(new String[] {"Humano"}));
		getterRaza.setBounds(93, 118, 86, 20);
		frame.getContentPane().add(getterRaza);
		
		JLabel lblTamao = new JLabel("Tama\u00F1o:");
		lblTamao.setBounds(272, 124, 46, 14);
		frame.getContentPane().add(lblTamao);
		
		JLabel lblApariencia = new JLabel("Apariencia");
		lblApariencia.setBounds(37, 160, 55, 14);
		frame.getContentPane().add(lblApariencia);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(93, 157, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTirador = new JButton("Tirador");
		btnTirador.setBounds(229, 156, 89, 23);
		frame.getContentPane().add(btnTirador);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(109, 215, 46, 14);
		frame.getContentPane().add(lblBase);
		
		JLabel lblActual = new JLabel("Actual");
		lblActual.setBounds(169, 215, 46, 14);
		frame.getContentPane().add(lblActual);
		
		JLabel lblBono = new JLabel("Bono");
		lblBono.setBounds(247, 215, 46, 14);
		frame.getContentPane().add(lblBono);
		
		JPanel imagePanel = new JPanel();
		imagePanel.setBounds(539, 49, 271, 400);
		frame.getContentPane().add(imagePanel);
		//
		JPanel bloqueImagen=new JPanel();
		
		//Inserta imagen
		BufferedImage imagen = ImageIO.read(new File("src/Images/Guerrero.png"));
		JLabel imagenLabel = new JLabel(new ImageIcon(imagen));
		imagePanel.add(imagenLabel);
		imagePanel.repaint();
		
		JButton btnTirador_1 = new JButton("Tirador");
		btnTirador_1.setBounds(320, 229, 89, 23);
		frame.getContentPane().add(btnTirador_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tipo 1", "Tipo 2", "Tipo 3", "Tipo 4"}));
		comboBox.setBounds(443, 230, 64, 20);
		frame.getContentPane().add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(320, 256, 187, 105);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(338, 85, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(343, 118, 81, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		/*
		//combosBox-Ventajas
		JComboBox ventaja1 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventaja1 1","Ventaja 2","Ventaja 3", "Ventaja 4", "Ventaja 5", "Ventaja 6"}));
		JComboBox ventaja2 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventaja1 1","Ventaja 2", "Ventaja 3", "Ventaja 4", "Ventaja 5", "Ventaja 6"}));
		JComboBox ventaja3 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventaja1 1","Ventaja 2", "Ventaja 3", "Ventaja 4", "Ventaja 5", "Ventaja 6"}));
		JComboBox ventaja4 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventaja1 1","Ventaja 2", "Ventaja 3", "Ventaja 4", "Ventaja 5", "Ventaja 6"}));
		JComboBox ventaja5 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventaja1 1","Ventaja 2", "Ventaja 3", "Ventaja 4", "Ventaja 5", "Ventaja 6"}));
		JComboBox ventaja6 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventaja1 1","Ventaja 2", "Ventaja 3", "Ventaja 4", "Ventaja 5", "Ventaja 6"}));
		//
		JComboBox desventaja1 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desventaja1 1,Desventaja 2, Desventaja 3, Desventaja 4, Desventaja 5, Desventaja 6"}));
		JComboBox desventaja2 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desventaja1 1,Desventaja 2, Desventaja 3, Desventaja 4, Desventaja 5, Desventaja 6"}));
		JComboBox desventaja3 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desventaja1 1,Desventaja 2, Desventaja 3, Desventaja 4, Desventaja 5, Desventaja 6"}));
		JComboBox desventaja4 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desventaja1 1,Desventaja 2, Desventaja 3, Desventaja 4, Desventaja 5, Desventaja 6"}));
		JComboBox desventaja5 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desventaja1 1,Desventaja 2, Desventaja 3, Desventaja 4, Desventaja 5, Desventaja 6"}));
		JComboBox desventaja6 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desventaja1 1,Desventaja 2, Desventaja 3, Desventaja 4, Desventaja 5, Desventaja 6"}));
		//
		tablaVentajas.setModel(new DefaultTableModel(
			new Object[][] {
				{ventaja1, desventaja1},
				{ventaja2, desventaja2},
				{ventaja3, desventaja3},
				{ventaja4, desventaja4},
				{ventaja5, desventaja5},
			},
			new String[] {
				"New column", "New column"
			}
		));
		tablaVentajas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		*/
		
	}
}
