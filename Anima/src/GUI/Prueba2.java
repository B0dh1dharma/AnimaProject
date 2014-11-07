package GUI;

import java.awt.*;

import javax.swing.*;

public class Prueba2 extends JFrame{
	
	
	public Prueba2(){
		
		setSize(500,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid=new GridLayout(4,2);
		setLayout(grid);
		
		JPanel bloque1=new JPanel();
		//GridLayout layout1=new GridLayout(1,2,10,10);
		FlowLayout layout1=new FlowLayout(FlowLayout.CENTER);
		bloque1.setLayout(layout1);
		JLabel nombre=new JLabel("Nombre",JLabel.RIGHT);
		JTextField campoNombre= new JTextField(10);
		bloque1.add(nombre);
		bloque1.add(campoNombre);
		add(bloque1);
		
		JPanel bloque2=new JPanel();
		//GridLayout layout2=new GridLayout(1,2,10,10);
		FlowLayout layout2=new FlowLayout(FlowLayout.CENTER);
		//bloque2.setLayout(layout2);
		bloque2.setLayout(layout1);
		JLabel nivel=new JLabel("Nivel",JLabel.RIGHT);
		JComboBox campoNivel= new JComboBox();
		campoNivel.addItem(1);
		campoNivel.addItem(2);
		campoNivel.addItem(3);
		campoNivel.addItem(4);
		campoNivel.addItem(5);
		bloque2.add(nivel);
		bloque2.add(campoNivel);
		add(bloque2);
		
		setVisible(true);
	}
	//-----------------------------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PruebaBase frame=new PruebaBase();
	}

}