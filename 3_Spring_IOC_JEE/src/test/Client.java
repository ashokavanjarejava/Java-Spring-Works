package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"resources/test.xml");
		System.out.println("------before chiru----");
		Test t1=(Test)ap.getBean("t");//chiru
		System.out.println("------after chiru----");
		Test t2=(Test)ap.getBean("t");//salekar
		Test t3=(Test)ap.getBean("t");//pooji
		Test t4=(Test)ap.getBean("t");//narendra
		System.out.println(t1==t2);
		System.out.println(t2==t3);
		System.out.println(t3==t4);
	}
}
