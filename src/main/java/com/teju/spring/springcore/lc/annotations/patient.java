package com.teju.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class patient {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	System.out.println("Created setter method");
	this.id = id;
}
@PostConstruct
public void hello(){
	System.out.println("Welcome to spring framework");
}
@PreDestroy
public void bye(){
	System.out.println("It's done.GoodBye");
}

@Override
public String toString() {
	return "Patient [id=" + id + "]";
}

}

