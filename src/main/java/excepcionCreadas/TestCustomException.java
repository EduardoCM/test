package excepcionCreadas;

public class TestCustomException {
	
	public static void main(String[] args) throws MiAplicacionException {
		
		venderAlcohol(20);
		
	}

	
	public static void venderAlcohol(int edad) throws MiAplicacionException {
		
		if(edad < 18) {
			throw new MiAplicacionException("No se puede vender alcohol a menores");
		}else {
			System.out.println(":::: Venta de forma exitosa");
		}
	}
	
}
