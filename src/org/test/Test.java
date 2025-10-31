package org.test;

import org.product.Product;
import org.stock.AlertService;
import org.warehouse.Warehouse;

public class Test {
   public static void main(String[] args) {
      Warehouse warehouse = new Warehouse("Main");
	  AlertService alert = new AlertService();
	
	  warehouse.addObserver(alert);
	  Product laptop = new Product(101, "Laptop", 0);
	  warehouse.addProduct(laptop);
	  
	  Thread shipmentThread = new Thread(()->{
		  for(int i=0; i<4; i++) {
			  warehouse.receiveShipment(101, 2);
		  }
		  try {
			  Thread.sleep(200);
		  }catch (InterruptedException ie) {
			  ie.printStackTrace();
		}
	  },"shipmentThread");
	  
	  Thread orderThread = new Thread(()->{
		  for(int i=0; i<4; i++) {
			  warehouse.fullfillOrder(101, 2);
		  }
		  try {
			  Thread.sleep(200);
		  }catch (InterruptedException ie) {
			  ie.printStackTrace();
		}
	  },"orderThread");
  
	  shipmentThread.start();
	  orderThread.start();
	  
	  try {
		  shipmentThread.join();
		  orderThread.join();
	  }catch(InterruptedException ie) {
		  ie.printStackTrace();
	  }
   }
}
