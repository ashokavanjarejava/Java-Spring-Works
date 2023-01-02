package beans;

public class Car {
	private Engine engine2022;

	public Car() {
	}

	public void setEngine2022(Engine engine2022) {
		System.out.println("setEngine");
		this.engine2022 = engine2022;
	}

	public Car(Engine engine2022) {
		System.out.println(" Car(Engine)");
		this.engine2022 = engine2022;
	}

	public void printData() {
		System.out.println("ModelYear=" + engine2022.getModelyear());
	}

}
