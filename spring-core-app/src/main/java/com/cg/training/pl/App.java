package com.cg.training.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.training.bean.Person;

public class App {
	public static void main(String []args) {
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("spring1.xml");
//		Address address1=
//				(Address) context.getBean("houseAddressBean");
//		System.out.println(address1);
		
		Person person1= (Person) context.getBean("personBean");
		System.out.println(person1);
//		Person person2= (Person) context.getBean("personBean");
//		System.out.println(person2);
		
		
		
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
	}
}
