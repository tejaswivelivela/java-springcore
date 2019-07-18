package com.teju.spring.springcore.lc.annotations;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SampleTest {
public static void main(String[] args){
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/teju/spring/springcore/lc/annotations/config.xml");
	patient patient = (patient) context.getBean("patient");
	System.out.println(patient);
	context.registerShutdownHook();

}
}
