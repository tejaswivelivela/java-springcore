package com.teju.spring.sprincore.properties;

public class ShoppingCart {
private Item item;

@Override
public String toString() {
	return "ShoppingCart [item=" + item + "]";
}

public Item getItem() {
	return item;
}

public void setItem(Item item) {
	this.item = item;
}
}
