
public class VideoJuego {
	//Definir valores deffault
		private final static int HORASESTIMADASDEF = 10;
		private final static boolean ENTREGADODEF = false;
		
		//Atributos/variables
		private String titulo;
		private int horasEstimadas;
		public boolean entregado;
		private String genero;
		private String compañia;
		
		//constructor por deffault
		public VideoJuego() {
			this.titulo = "";
			this.horasEstimadas = HORASESTIMADASDEF;
			this.entregado = ENTREGADODEF;
			this.genero = "";
			this.compañia = "";
		}

		public VideoJuego(String titulo, int horasEstimadas) {
			this.titulo = titulo;
			this.horasEstimadas = horasEstimadas;
			this.entregado = ENTREGADODEF;
			this.genero = "";
			this.compañia = "";
		}

		public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia) {
			super();
			this.titulo = titulo;
			this.horasEstimadas = horasEstimadas;
			this.entregado = ENTREGADODEF;
			this.genero = genero;
			this.compañia = compañia;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getHorasEstimadas() {
			return horasEstimadas;
		}

		public void setHorasEstimadas(int horasEstimadas) {
			this.horasEstimadas = horasEstimadas;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getCompañia() {
			return compañia;
		}

		public void setCompañia(String compañia) {
			this.compañia = compañia;
		}

		@Override
		public String toString() {
			return "Informacion de la serie: \n"+"Titulo: " + titulo + "\n" + "Numero de horas estimadas: " + horasEstimadas+ "\n"+ "¿Se entregó el titulo?"+ENTREGADODEF+"\n"+"Genero: " + genero + "\n" + "Nombre del creador: " + compañia + "\n";
		}
		
		
}
