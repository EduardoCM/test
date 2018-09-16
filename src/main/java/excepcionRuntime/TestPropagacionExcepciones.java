package excepcionRuntime;

public class TestPropagacionExcepciones {
	
	public static void main(String []args) {
		hacerAlgo();
	}
	
	static void hacerAlgo() {
		hacerAlgoMas();
	}
	
	static void hacerAlgoMas() {
		int x = 5/0;
	}

}
