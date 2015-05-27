package GUI;

import javax.swing.*;

import java.awt.*;

public class Prueba3 extends JFrame{
	
	public Prueba3(){
		
		setSize(500,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Bloque general
		GridLayout grid=new GridLayout(4,1);
		setLayout(grid);
		
		//Fila 1
		JPanel bloque1=new JPanel();
		GridLayout layout1=new GridLayout(1,4,10,10);
		bloque1.setLayout(layout1);
		/*Tama�o panel
		Insets inset=bloque1.getInsets();
		bloque1.setSize(new Dimension(inset.left+inset.right+100,inset.top+inset.bottom+100));
		*/
		
		JLabel nombre=new JLabel("Nombre",JLabel.RIGHT);
		JTextField campoNombre= new JTextField(10);
		JLabel nivel=new JLabel("Nivel",JLabel.RIGHT);
		JComboBox campoNivel= new JComboBox();
		campoNivel.addItem(1);
		campoNivel.addItem(2);
		campoNivel.addItem(3);
		campoNivel.addItem(4);
		campoNivel.addItem(5);
		bloque1.add(nombre);
		bloque1.add(campoNombre);
		bloque1.add(nivel);
		bloque1.add(campoNivel);
		add(bloque1);
		
		//Fila 2
		JPanel bloque2=new JPanel();
		bloque2.setLayout(layout1);
		JLabel categoria=new JLabel("Categoria",JLabel.RIGHT);
		JComboBox campoCategoria=new JComboBox();
		campoCategoria.addItem("Guerrero");
		campoCategoria.addItem("Guerrero Acrobata");
		bloque2.add(categoria);
		bloque2.add(campoCategoria);
		JLabel pd=new JLabel("P.Desarrollo",JLabel.RIGHT);
		JTextField campoPD= new JTextField(7);
		campoPD.setEditable(false);
		bloque2.add(pd);
		bloque2.add(campoPD);
		add(bloque2);
		
		//Fila 3
		JPanel bloque3=new JPanel();
		bloque3.setLayout(layout1);
		JLabel raza=new JLabel("Raza",JLabel.RIGHT);
		JComboBox campoRaza=new JComboBox();
		campoRaza.addItem("Humano");
		campoRaza.addItem("J'Ayan");
		bloque3.add(raza);
		bloque3.add(campoRaza);
		JLabel tamano=new JLabel("Tama�o",JLabel.RIGHT);
		JTextField campoTamano= new JTextField(5);
		campoPD.setEditable(false);
		bloque3.add(tamano);
		bloque3.add(campoTamano);
		add(bloque3);
		
		//Fila 4
		JPanel bloque4=new JPanel();
		bloque4.setLayout(layout1);
		JLabel apariencia=new JLabel("Apariencia",JLabel.RIGHT);
		JTextField campoApariencia= new JTextField(5);
		campoPD.setEditable(false);
		JButton botonApariencia=new JButton("Tirar");
		bloque4.add(apariencia);
		bloque4.add(campoApariencia);
		bloque4.add(botonApariencia);
		add(bloque4);
		
		this.pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueba3 frame=new Prueba3();
	}

}
