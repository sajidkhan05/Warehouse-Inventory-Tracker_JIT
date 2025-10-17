package org.warehouse;

public class Product{
	private int id;
	private String name;
	private int quantity;
	private int orderThreshold;
	
	public Product() {
		
	}
	public Product(int id,String name,int quantity,int orderThreshold) {
		 this.id = id;
		 this.name = name;
		 this.quantity = quantity;
		 this.orderThreshold = orderThreshold;
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
	public int getOrderThreshold() {
		return orderThreshold;
	}
	public void setOrderThreshold(int orderThreshold) {
		this.orderThreshold = orderThreshold;
	}
	
	public String toString() {
	   return id+","+name+","+quantity+","+orderThreshold;	
	}
}