package com.teju.spring.springcore.lc.xmlconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleTest {
public static void main(String[] args){
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/teju/spring/springcore/lc/xmlconfig/config.xml");
	Patient patient = (Patient) context.getBean("patient");
	System.out.println(patient);
	context.registerShutdownHook();
}
}
