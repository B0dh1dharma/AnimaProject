package domain;

import java.util.Collection;
import java.util.Map;

public class PersonajeBasico {

		public Ataque ataque;
		public Defensa defensa;
		public Esquiva esquiva;
		public PuntosDeVida PV;
		public Collection <Turno> turnos;
		public Integer nivel;
		public Clases clase; 
		public ResistenciaMagica RM;
		public ResistenciaFisica RF;
		public ResistenciaVenenos RV;
		public ResistenciaPsiquica RP;
		public Collection<Habilidad> habilidades;
		public Collection<Atributo> atributos;
		
		public PersonajeBasico(){
			
		}
		
		/*
		public PersonajeBasico(Ataque ataque,Defensa defensa,Esquiva esquiva, PuntosDeVida PV, Collection<Turno> turnos, Clases clase,
				Integer nivel,ResistenciaMagica RM,ResistenciaFisica RF,ResistenciaVenenos RV,ResistenciaPsiquica RP, 
				Collection<Habilidad> habilidades,Collection<Atributo> atributos){
			this.ataque=ataque;
			this.defensa=defensa;
			this.esquiva=esquiva;
			this.PV=PV;
			this.turnos=turnos;
			this.clase=clase;
			this.nivel=nivel;
			this.RM=RM;
			this.RF=RF;
			this.RV=RV;
			this.RP=RP;
			this.habilidades=habilidades;
			this.atributos=atributos;
			
		}
		*/
		
}
