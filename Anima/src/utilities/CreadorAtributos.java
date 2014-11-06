package utilities;

import java.util.ArrayList;

public class CreadorAtributos {

	public static ArrayList<Integer> Tipo1(){
		ArrayList<Integer> valores=new ArrayList<Integer>();
		Integer menor=9;
		Integer indice=0;
		for(int i=0;i<8;i++){
			Integer resultado=Tirador.d10();
			if(resultado==0)
				resultado=10;
			while(resultado==1|resultado==2|resultado==3)
				resultado=Tirador.d10();
			valores.add(resultado);
		}
		for(int i=0;i<valores.size();i++){
			if(valores.get(i)<menor){
				menor=valores.get(i);
				indice=i;
			}
		}
		System.out.println(valores);
		System.out.println("Valor mas bajo: "+menor);
		valores.set(indice,9);
		return valores;
	}
	
	public static ArrayList<Integer> Tipo2(){
		ArrayList<Integer> valores=new ArrayList<Integer>();
		Integer valor;
		Integer cmp;
		for(int i=0;i<8;i++){
			valor=Tirador.d10();
			if(valor==0)
				valor=10;
			System.out.println("Primer valor: "+valor);
			cmp=Tirador.d10();
			if(valor==0)
				valor=10;
			System.out.println("Segundo valor: "+cmp);
			if(valor<cmp)
				valor=cmp;
			System.out.println("Valor mas alto: "+valor);
			valores.add(valor);
		}
		System.out.println(valores);
		return valores;
	}
	
	public static ArrayList<Integer> Tipo3(){
		ArrayList<Integer> valores=new ArrayList<Integer>();
		for(int i=0;i<8;i++){
			Integer resultado=Tirador.d10();
			if(resultado==0)
				resultado=10;
			valores.add(resultado);
		}
		System.out.println(valores);
		return valores;
	}
	
	//FALTA IMPLEMENTAR TIPO4
}
