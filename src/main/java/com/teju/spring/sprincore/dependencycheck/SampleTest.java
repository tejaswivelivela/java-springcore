package com.teju.spring.sprincore.dependencycheck;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class SampleTest {
public static void main(String[] args){
	ApplicationContext context = new ClassPathXmlApplicationContext("com/teju/spring/sprincore/dependencycheck/config.xml");
	Prescription prescription = (Prescription) context.getBean("prescription");
	System.out.println(prescription);
	
}
}
