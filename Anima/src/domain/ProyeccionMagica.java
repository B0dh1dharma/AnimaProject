package domain;

public class ProyeccionMagica {

	public Integer base;
	public Integer destreza;
	public Integer especial;
	public Integer valorOfensivo;
	public Integer valorDefensivo;
	public Integer valorFinal;
	public Integer coste;
	
	public ProyeccionMagica(Integer base, Integer bono, Integer esp){
		this.base=base;
		destreza=bono;
		especial=esp;
	}
}
