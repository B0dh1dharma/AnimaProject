package GUI;

import java.awt.BorderLayout;

import javax.swing.*;

public class prueba {

	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Anima Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        JPanel izquierdo=new JPanel(new BorderLayout());
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label,izquierdo);
        //
        JPanel derecho=new JPanel(new BorderLayout());
        JTextField campo=new JTextField();
        frame.getContentPane().add(campo,derecho);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
