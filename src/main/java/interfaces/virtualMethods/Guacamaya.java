package interfaces.virtualMethods;

public class Guacamaya extends Bird {

	@Override
	public String getName() {
		return "Guacamaya";
	}
	
	@Override
	public String alimentarse() {
		return "::::: Comiendo fruta";
	}
	

}
