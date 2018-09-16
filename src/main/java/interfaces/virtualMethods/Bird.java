package interfaces.virtualMethods;

public abstract class Bird {

	public abstract String getName();
	
   public void displayInformation() {
		System.out.println("El nombre del ave es: " + getName() + " Se alimenta de " + alimentarse());
   }
   
   public String  alimentarse() {
	   return " ::::: Alimentandose de semillas ";
   }
}
