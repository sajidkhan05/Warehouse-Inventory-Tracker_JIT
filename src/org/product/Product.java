package org.product;

public class Product {
	private int id;
	private String name;
	private int quantity;
	
	public Product(int id,String name,int quantity) {
		 this.id = id;
		 this.name = name;
		 this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString() {
	   return id+","+name+","+quantity+","+threshold;	
	}
}
