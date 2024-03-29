public class Persona {

	private String nombre;
	private int edad;
	private String municipio;
	private String colegio;
	private String lugarTrabajo;
	
	private Persona() {}
	
	
	public static class Builder {
		private Persona persona;
		
		public Builder(String nombre) {
			persona = new Persona();
			persona.nombre = nombre;
		}
		
		public Builder setMunicipio (String municipio) {
			persona.municipio = municipio;
			return this;
		}
		
		public BuilderMayor setMayor(int edad, String lugarTrabajo) {
			if (edad < 18) throw new IllegalArgumentException("es menor de edad " + edad);
			persona.edad = edad;
			persona.lugarTrabajo = lugarTrabajo;
			persona.colegio = null;
			return new Persona.BuilderMayor(persona);
		}
		
		public BuilderMenor setMenor(int edad, String colegio) {
			if (edad >= 18) throw new IllegalArgumentException("es mayor de edad " + edad);
			persona.edad = edad;
			persona.colegio = colegio;
			persona.lugarTrabajo = null;
			return new Persona.BuilderMenor(persona);
		}
	
		/*public Persona build() {
			return persona;
		}*/

	}

	public static class BuilderMayor {
		private Persona persona;
		public BuilderMayor(Persona persona) {
			this.persona = persona;
		}
		public BuilderMayor setLugarTrabajo(String trabajo) {
			persona.lugarTrabajo = trabajo;
			return this;
		}
		public Persona build() {
			return persona;
		}
	}

	public static class BuilderMenor {
		private Persona persona;
		public BuilderMenor(Persona persona) {
			this.persona = persona;
		}
		public BuilderMenor setColegio(String colegio) {
			persona.colegio = colegio;
			return this;
		}
		public Persona build() {
			return persona;
		}
	}
	
}



