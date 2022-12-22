package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	Food b;//interface

	public void setB(Food b) {
		this.b = b;
	}

	public void timeToEat() {
		// = new Bred(); <bean Bread>
		b.consumefood();
	}

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/car.xml");

		Customer c = ap.getBean(Customer.class);

		c.timeToEat();

	}
}
