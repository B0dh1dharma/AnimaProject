package utilities;

import java.util.ArrayList;
import java.util.Random;

public class Tirador {
	
	static Random valor=new Random();
	/*
	public static ArrayList<Integer> d10(Integer cuantos){
		ArrayList<Integer> dados=new ArrayList<Integer>();
		for(int i=0;i<cuantos;i++){
			dados.add(valor.nextInt(11));
		}
		return dados;
	}
	*/
	public static Integer d10(){
		return valor.nextInt(10);
	}
	public static Integer d100(){
		return valor.nextInt(100);
	}
	
}