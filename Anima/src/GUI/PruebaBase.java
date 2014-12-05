package GUI;

import java.awt.*;
import javax.swing.*;

public class PruebaBase extends JFrame{
	
	
	public PruebaBase(){
		
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
		
		JPanel bloque3=new JPanel();
		bloque3.setLayout(layout1);
		JLabel categoria=new JLabel("Categoria",JLabel.RIGHT);
		JComboBox campoCategoria=new JComboBox();
		campoCategoria.addItem("Guerrero");
		campoCategoria.addItem("Guerrero Acrobata");
		bloque3.add(categoria);
		bloque3.add(campoCategoria);
		add(bloque3);
		
		JPanel bloque4=new JPanel();
		bloque4.setLayout(layout1);
		JLabel pd=new JLabel("P.Desarrollo",JLabel.RIGHT);
		JTextField campoPD= new JTextField(7);
		campoPD.setEditable(false);
		bloque4.add(pd);
		bloque4.add(campoPD);
		add(bloque4);
		
		JPanel bloque5=new JPanel();
		bloque5.setLayout(layout1);
		JLabel raza=new JLabel("Raza",JLabel.RIGHT);
		JComboBox campoRaza=new JComboBox();
		campoRaza.addItem("Humano");
		campoRaza.addItem("J'Ayan");
		bloque5.add(raza);
		bloque5.add(campoRaza);
		add(bloque5);
		
		JPanel bloque6=new JPanel();
		bloque6.setLayout(layout1);
		JLabel tamaño=new JLabel("Tamaño",JLabel.RIGHT);
		JTextField campoTamaño= new JTextField(5);
		campoPD.setEditable(false);
		bloque6.add(tamaño);
		bloque6.add(campoTamaño);
		add(bloque6);
		
		JPanel bloque7=new JPanel();
		bloque7.setLayout(layout1);
		JLabel apariencia=new JLabel("Apariencia",JLabel.RIGHT);
		JTextField campoApariencia= new JTextField(5);
		campoPD.setEditable(false);
		JButton botonApariencia=new JButton("Tirar");
		bloque7.add(apariencia);
		bloque7.add(campoApariencia);
		bloque7.add(botonApariencia);
		add(bloque7);
		
		this.pack();
		setVisible(true);
	}
	//-----------------------------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PruebaBase frame=new PruebaBase();
	}

}
