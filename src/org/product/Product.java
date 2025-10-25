package org.product;

public class Product {
	private int id;
	private String name;
	private int quantity;
	private int threshold;
	
	public Product(int id,String name,int quantity,int threshold) {
		 this.id = id;
		 this.name = name;
		 this.quantity = quantity;
		 this.threshold = threshold;
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
	public int getthreshold() {
		return threshold;
	}
	public void setOrderThreshold(int threshold) {
		this.threshold = threshold;
	}
	
	public String toString() {
	   return id+","+name+","+quantity+","+threshold;	
	}
}
