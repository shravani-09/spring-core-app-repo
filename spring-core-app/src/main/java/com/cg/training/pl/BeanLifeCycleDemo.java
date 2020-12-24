package com.cg.training.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.training.bean.Student;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("spring2.xml");
		Student student1= 
				(Student) context.getBean("studentBean");
		System.out.println(student1);
		
		((AbstractApplicationContext)context).registerShutdownHook();

	}

}
