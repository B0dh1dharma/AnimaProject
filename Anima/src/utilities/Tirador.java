package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tirador {
	
	static Random valor=new Random();
	
	public static ArrayList<Integer> atributosTipo1(){
		ArrayList<Integer> dados=new ArrayList<Integer>();
		for(int i=0;i<8;i++){
			Integer value=valor.nextInt(11);
			if(value==0){
				dados.add(10);
			}
			else{
				while(value==1||value==2||value==3)
					value=valor.nextInt(11);
			dados.add(value);
			}
		}
		Integer cmp=10;
		for(Integer d: dados){
			if(d<cmp)
				cmp=d;
		}
		dados.set(dados.indexOf(cmp), 9);
		return dados;
	}
	
	public static ArrayList<Integer> atributosTipo2(){
		ArrayList<Integer> dados=new ArrayList<Integer>();
		for(int i=0;i<8;i++){
			Integer d1=valor.nextInt(11);
			Integer d2=valor.nextInt(11);
			if(d1==0)
				d1=10;
			if(d2==0)
				d2=10;
			if(d1<d2)
				dados.add(d2);
			else
				dados.add(d1);
		}
		return dados;
	}
	
	public static ArrayList<Integer> atributosTipo3(){
		ArrayList<Integer> dados=new ArrayList<Integer>();
		for(int i=0;i<8;i++){
			Integer value=valor.nextInt(11);
			if(value==0)
				value=10;
			dados.add(value);
		}
		return dados;
	}
	
	public static ArrayList<Integer> atributosTipo4(){
		ArrayList<Integer> dados=new ArrayList<Integer>();
		for(int i=0;i<7;i++){
			Integer value=valor.nextInt(11);
			if(value==0)
				value=10;
			dados.add(value);
		}
		return dados;
	}
	
	public static Integer d10(){
		Integer res;
		res=valor.nextInt(10);
		if(res==0)
			res=10;
		return res;
	}
	public static Integer d100(){
		Integer res;
		res=valor.nextInt(100);
		if(res==00)
			res=100;
		return res;
	}
	
}