package com.teju.spring.sprincore.properties;

public class Item {
private int id;
@Override
public String toString() {
	return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}
private String name;
private Double price;
private int quantity;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
