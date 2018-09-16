package interfaces.virtualMethods;

public class Tucan extends Bird {

	@Override
	public String getName() {
		return "Tucan";
	}
	
	@Override
	public String alimentarse() {
		return ":::: Comiendo ranas y reptines";
	}

}
