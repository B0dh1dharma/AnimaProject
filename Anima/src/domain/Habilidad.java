package domain;

public class Habilidad {

		public Habilidades nombre;
		public Integer base;
		public Integer bono;
		public Integer esp;
		public Integer cat;
		public Integer valorFinal;
		public Integer coste;
		
		public Habilidad(Habilidades nombre, Integer base, Integer bono, Integer esp, Integer cat){
			this.nombre=nombre;
			this.base=base;
			this.bono=bono;
			this.esp=esp;
			this.cat=cat;
			
		}
}
