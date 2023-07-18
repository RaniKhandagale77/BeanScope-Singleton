package com.jsp.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
	Car car=(Car)applicationContext.getBean("mycar");
	
	Car car2=(Car)applicationContext.getBean("mycar");
	
	car.setDriving("Welcome.....");
	System.out.println(car.getDriving());
	
	System.out.println(car.getDriving());
}
}
