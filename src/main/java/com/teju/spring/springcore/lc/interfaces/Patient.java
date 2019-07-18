package com.teju.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	System.out.println("Created setter method");
	this.id = id;
}
public void hello(){
	System.out.println("Welcome to spring framework");
}
public void bye(){
	System.out.println("It's done.GoodBye");
}

@Override
public String toString() {
	return "Patient [id=" + id + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Inside afterpropertieset");
	
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	
}
}
