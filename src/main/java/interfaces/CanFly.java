package interfaces;

public interface CanFly {

	/*
	public abstract void fly(int speed);
	public abstract void takeoff();
	public abstract double dive();
	 */
	
	
	void fly(int speed);
	abstract void takeoff();
	public abstract double dive();
	
	/* DOES NOT COMPILE
	private void flyy(int speed);
	protected abstract void takeofff();
	public final abstract double divee();
	*/
	
}
