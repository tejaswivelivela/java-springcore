package com.teju.spring.sprincore.properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args){
	ApplicationContext context = new ClassPathXmlApplicationContext("com/teju/spring/sprincore/properties/Propsconfig.xml");
	DifferentLanguages differentlanguages = (DifferentLanguages) context.getBean("differentlanguages");
	System.out.println(differentlanguages);
}
}
