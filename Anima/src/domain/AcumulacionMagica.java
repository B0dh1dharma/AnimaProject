package domain;

public class AcumulacionMagica {

	//ATRIBUTOS
	public Integer base;
	public Integer multiplos;
	public Integer especial;
	public Integer valorFinal;
	public Integer coste;
	
	//CONSTRUCTOR
	public AcumulacionMagica(Integer base,Integer multiplos, Integer especial){
		this.base=base;
		this.multiplos=multiplos;
		this.especial=especial;
	}
	
	//GETERS
	public Integer getBase(){
		return base;
	}
	public Integer getMultiplos(){
		return multiplos;
	}
	public Integer getEspecial(){
		return especial;
	}
	public Integer getValorFinal(){
		return valorFinal;
	}
	public Integer getCoste(){
		return coste;
	}
	
	//SETTERS
	public void setBase(Integer base){
		this.base=base;
	}
	public void setMultiplos(Integer multiplos){
		this.multiplos=multiplos;
	}
	public void setEspecial(Integer especial){
		this.especial=especial;
	}
	public void setValorFinal(Integer valorFinal){
		this.valorFinal=valorFinal;
	}
	public void setCoste(Integer coste){
		this.coste=coste;
	}
	
	//METODOS
	
	public Integer calculoValorFinal(){
		return getBase();
	}
	
	
}
