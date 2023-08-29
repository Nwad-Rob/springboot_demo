package com.springboot.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication { 

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		Product p=(Product)con.getBean("product2");
		System.out.println("Product name is "+p.getProductName());
		
	}

}
