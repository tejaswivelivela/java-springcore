package com.teju.spring.springcore.lc.interfaces;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;

public class SampleTest {
public static void main(String[] args){
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/teju/spring/springcore/lc/interfaces/config.xml");
	Patient patient = (Patient) context.getBean("patient");
	System.out.println(patient);
	context.registerShutdownHook();
}
}
