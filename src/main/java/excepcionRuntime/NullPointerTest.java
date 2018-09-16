package excepcionRuntime;

public class NullPointerTest {

	static String nombre;

	public static void main(String[] args) {
		try {
			System.out.println(nombre.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println("::::: Entro a excepcion");
		}
	}
}
