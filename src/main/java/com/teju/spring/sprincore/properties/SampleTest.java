package com.teju.spring.sprincore.properties;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleTest {
public static void main(String[] args){
	ApplicationContext context = new ClassPathXmlApplicationContext("com/teju/spring/sprincore/properties/config.xml");
	ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
	System.out.println(shoppingcart);
	
}
}
