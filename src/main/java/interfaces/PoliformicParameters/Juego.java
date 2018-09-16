package interfaces.PoliformicParameters;

public interface Juego {
	
	public String getName();
	
	//public void armarEquipo(String nombreEquipo, String... jugadores);
	
	public default void armarEquipo(int numJugadores, String nombreEquipo, String... jugadores) {
		System.out.println("Nombre equipo: " + nombreEquipo);
		int numPlayer=0;
		for (String jugador : jugadores) {
			if(numPlayer < numJugadores) {
			System.out.println("Jugador: " + (++numPlayer) + " : " + jugador);
			}else {
				System.out.println("ya no se permiten mas jugadores por equipo para: " + getName());
			}
		}
		System.out.println("=====================");
	}

}
