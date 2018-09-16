package excepcionRuntime;

public class RuntimeTest {
	
	public static void main(String[] args) {
		
		String[] arrayTest = {"uno", "dos"};
		
		System.out.println(":: Inicia programa ::");
		try {
			System.out.println(arrayTest[2]);	
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(":: mensaje y tratar excepcion ::");
		}
		
		
		System.out.println("Finaliza programa");
	}

}
