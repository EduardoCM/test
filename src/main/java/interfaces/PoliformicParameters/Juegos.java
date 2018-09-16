package interfaces.PoliformicParameters;

public class Juegos {
	
	public static void iniciarJuegos(Juego juego) {
		System.out.println("Jugando: " + juego.getName());
		
		if(juego instanceof Fulbol) {
			System.out.println(":::: Inicia juego de fulbol ::::");
			juego.armarEquipo(2, "Barcelona", "Mesi", "Neimar", "Los que sean");
		} else if (juego instanceof Basquet) {
			System.out.println(":::: Inicia juego de Basquet ::::");
			juego.armarEquipo(3, "Chicago Bulls ", "Michael Jordan", "Jabari Parquer");
		} else if (juego instanceof Beilsbol) {
			System.out.println(":::: Inicia juego de beisbol ::::");
			juego.armarEquipo(2, "New York Yankees", "Aaron Judge", "Gary Sanchez");
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 1.- The type of the object determines witch properties existing with the object in memory
		 2.- The type ob the reference to the object determine wich methods and varibales are accesible to the java program
		 */
		Juegos.iniciarJuegos(new Fulbol());
		Juegos.iniciarJuegos(new Beilsbol());
		Juegos.iniciarJuegos(new  Basquet());
	}

}
