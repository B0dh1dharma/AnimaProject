package domain;

public class Turno {
	
	public String id;
	public Integer base;
	public Integer armadura;
	public Integer agilidad;
	public Integer destreza;
	public Integer arma;
	public Integer categoria;
	public Integer especial;
	public Integer valorFinal;
	
	public Turno (String id,Integer base, Integer armadura, Integer agilidad, Integer destreza, Integer arma, Integer categoria, Integer especial){
		this.id=id;
		this.base=base;
		this.armadura=armadura;
		this.agilidad=agilidad;
		this.destreza=destreza;
		this.arma=arma;
		this.categoria=categoria;
		this.especial=especial;
	}
	
}
