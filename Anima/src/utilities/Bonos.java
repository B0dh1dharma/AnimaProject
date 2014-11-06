package utilities;

import java.util.ArrayList;

public class Bonos {

	public static Integer getBono(Integer atributo){
		ArrayList<Integer> tablaBonos=new ArrayList<Integer>();
		tablaBonos.add(-30);
		tablaBonos.add(-20);
		tablaBonos.add(-10);
		tablaBonos.add(-5);
		tablaBonos.add(0);
		tablaBonos.add(5);
		tablaBonos.add(5);
		tablaBonos.add(10);
		tablaBonos.add(10);
		tablaBonos.add(15);
		tablaBonos.add(20);
		tablaBonos.add(20);
		tablaBonos.add(25);
		tablaBonos.add(25);
		tablaBonos.add(30);
		tablaBonos.add(35);
		tablaBonos.add(35);
		tablaBonos.add(40);
		tablaBonos.add(40);
		tablaBonos.add(45);
		return tablaBonos.get(atributo-1);
	}
}
