package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;

import Images.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Prueba5 extends JFrame{
	
	public Prueba5() throws IOException{
		
		setSize(500,800);
		setLookAndFeel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Bloque general
		GridLayout grid=new GridLayout(1,2,10,10);
		setLayout(grid);
		
		//Bloque personaje
		JPanel personaje=new JPanel();
		GridLayout grid2=new GridLayout(4,1);
		personaje.setLayout(grid2);
		//Fila 1
		JPanel bloque1=new JPanel();
		GridLayout layout1=new GridLayout(1,4,0,0);
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
		personaje.add(bloque1);
		
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
		personaje.add(bloque2);
		
		//Fila 3
		JPanel bloque3=new JPanel();
		bloque3.setLayout(layout1);
		JLabel raza=new JLabel("Raza",JLabel.RIGHT);
		JComboBox campoRaza=new JComboBox();
		campoRaza.addItem("Humano");
		campoRaza.addItem("J'Ayan");
		bloque3.add(raza);
		bloque3.add(campoRaza);
		JLabel tamaño=new JLabel("Tama�o",JLabel.RIGHT);
		JTextField campoTamaño= new JTextField(5);
		campoPD.setEditable(false);
		bloque3.add(tamaño);
		bloque3.add(campoTamaño);
		personaje.add(bloque3);
		
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
		personaje.add(bloque4);
		add(personaje);
		
		//Bloque imagen
		JPanel bloqueImagen=new JPanel();
		//GridLayout layout2=new GridLayout(1,2,10,10);
		FlowLayout layout2=new FlowLayout(FlowLayout.CENTER);
		bloqueImagen.setLayout(layout2);
		//Inserta imagen
		BufferedImage imagen = ImageIO.read(new File("src/Images/Guerrero.png"));
		JLabel imagenLabel = new JLabel(new ImageIcon(imagen));
		bloqueImagen.add(imagenLabel);
		bloqueImagen.repaint();
		//
		
		add(bloqueImagen);
		
		this.pack();
		setVisible(true);
	}
	
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception e){
			
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Prueba5 frame=new Prueba5();
	}
}
