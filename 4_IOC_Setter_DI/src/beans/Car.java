package beans;


public class Car 
{
	public Car() {}
	
	public void setCarname(String carname) {
		System.out.println("setCarname:"+carname);
	}

	/*
	 * public Car() { System.out.println("Car()"); }
	 */
	public Car(String carname,int cc,Engine eng) {
		System.out.println("Car(...):"+carname);
		System.out.println("Car(...):"+cc);
		System.out.println("Car(...):"+eng);
	}
	
}
