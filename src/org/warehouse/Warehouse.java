package org.warehouse;

import java.util.ArrayList;
import java.util.HashMap;

import org.product.Product;
import org.stock.StockObserver;

public class Warehouse {
	private String name;
	private HashMap<Integer,Product> inventory = new HashMap<Integer,Product>();
    private ArrayList<StockObserver>  observers = new ArrayList<StockObserver>();
    
    public Warehouse() {
    	
    }
    
    public Warehouse(String name) {
    	   this.name = name;
    }
    
    public void addObserver(StockObserver observer) {
    	   observers.add(observer);
    }
    
    public synchronized void addProduct(Product prod) {
    	   inventory.put(prod.getId(),prod);
    	   System.out.println("Product: "+prod.getName()+" added in the inventory successfully.");
    }
    
    public void notifyObservers(Product prod) {
    	   for(StockObserver observer: observers) {
    		   observer.onLowStock(prod);
    	   }
    }
    
    public synchronized void receiveShipment(int prodId,int quantity) {
    	   Product prod = inventory.get(prodId);
    	   if(prod != null) {
    		   prod.setQuantity(prod.getQuantity()+quantity);
    		   System.out.println("Received shipment: "+quantity+" for "+prod.getName());
    		   System.out.println("Current quantity of "+prod.getName()+" is "+prod.getQuantity());   
    	   }
    	   else {
    		   System.out.println("Product not found for ProductId: "+prodId);
    	   }
    }
    
    public synchronized void fullfillOrder(int prodId,int quantity) {
    	   Product prod = inventory.get(prodId);
    	   if(prod == null) {
    		   System.out.println("Product "+prodId+" is not available!");
    		   return;
    	   }
    	   if(prod.getQuantity() < quantity) {
    		   System.out.println("Insufficiet stock for "+prod.getName());
    		   return;
    	   }
    	   
    	   prod.setQuantity(prod.getQuantity() - quantity);
    	   System.out.println("Order fullfilled: "+quantity+ " for "+prod.getName());
    	   
    	   if(prod.getQuantity() < prod.getthreshold()) {
    		   notifyObservers(prod);
    	   }
    }
}