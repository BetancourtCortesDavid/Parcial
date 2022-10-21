
public class Serie implements Entregable {
	
	//Definir valores deffault
	private final static int NUMTEMPSDEF = 3;
	private final static boolean ENTREGADODEF = false;
	
	//Atributos/variables
	private String titulo;
	private int numTemps;
	public boolean entregado;
	private String genero;
	private String creador;
	
	
	/*public Serie() {
		this("", NUMTEMPSDEF, ENTREGADODEF, "", "");
	}*/

	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numTemps = NUMTEMPSDEF;
		this.entregado = ENTREGADODEF;
		this.genero = "";
		this.creador = "";
	}

	//Constructor con dos datos
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemps = NUMTEMPSDEF;
		this.entregado = ENTREGADODEF;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numTemps, String genero, String creador) {
		this.titulo = titulo;
		this.numTemps = numTemps;
		this.entregado = ENTREGADODEF;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemps() {
		return numTemps;
	}

	public void setNumTemps(int numTemps) {
		this.numTemps = numTemps;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Informacion de la serie: \n"+"Titulo: " + titulo + "\n" + "Numero de temporadas: " + numTemps+ "\n"+ "¿Se entregó el titulo?"+ENTREGADODEF+"\n"+"Genero: " + genero + "\n" + "Nombre del creador: " + creador + "\n";
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void compareTo(Object a) {
		// TODO Auto-generated method stub
		
	}
	
}
