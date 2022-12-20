package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Customer;


public class Client {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car.xml");
	
	Customer c=ap.getBean(Customer.class);
	System.out.println(c);
	
	
	//Customer [name=Ranjith, age=25, isActive=true, product=beans.Product@50d0686, items=[pen, book, table, pen], cards=[PAN, ADHAR, DEBT, CRDCARD], details={address=Hyd, mobile=6546122332}, mostLikedItems=[pen, book]]

}
}
