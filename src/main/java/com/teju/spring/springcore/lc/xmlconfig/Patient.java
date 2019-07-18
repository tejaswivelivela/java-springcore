package com.teju.spring.springcore.lc.xmlconfig;

public class Patient {
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
}
