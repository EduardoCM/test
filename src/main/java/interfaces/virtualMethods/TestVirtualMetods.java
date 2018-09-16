package interfaces.virtualMethods;

public class TestVirtualMetods {
	
	public static void main(String[] args) {
		Bird guacamaya = new Guacamaya();
		guacamaya.displayInformation();
		
		Bird quetzal = new Quetzal();
		quetzal.displayInformation();
		
		Bird tucan = new Tucan();
		tucan.displayInformation();
	}

}
