package utilities;
import java.util.Scanner;

import domain.*;

public class Creador {

	private static String nombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el nombre");
		nombre=sc.nextLine();
		System.out.println(nombre);
	}

}
