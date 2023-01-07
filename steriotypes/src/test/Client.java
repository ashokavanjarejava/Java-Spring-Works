package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rbu.web.RegController;

public class Client {
public static void main(String[] args) {
	
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/test.xml");
	
	RegController r=ap.getBean(RegController.class);
	System.out.println(r);
	r.register();
}
}
