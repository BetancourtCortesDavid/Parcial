import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Serie[] sr = new Serie[5];
		VideoJuego[] vj = new VideoJuego[5];
		Scanner sc = new Scanner(System.in);
		
		sr[0]=new Serie ("Don Comedias", 1, "Comedia", "Jaime");
		sr[1]=new Serie ("Don sustos", 5, "Thriller", "El Pepe");
		sr[2]=new Serie ("Don Balas", "Camila");
		sr[3]=new Serie ("Don Dramas", 2, "Drama", "Elizabeth");
		sr[4]=new Serie ();
		
		vj[0]=new VideoJuego ();
		vj[1]=new VideoJuego ("God of plants", 24, "Aventura", "David");
		vj[2]=new VideoJuego ("Run and Jump", 40, "plataformas", "Jose Daniel");
		vj[3]=new VideoJuego ("El puños", 49);
		vj[4]=new VideoJuego ("El Bailecitos", 60, "musica", "Catalina");
		
		
	}
	
}
