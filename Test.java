package org.test;

import org.product.Product;
import org.stock.AlertService;
import org.warehouse.Warehouse;

public class Test {
   public static void main(String[] args) {
      Warehouse warehouse = new Warehouse("Main");
	  AlertService alert = new AlertService();
	
	  warehouse.addObserver(alert);
	  Product laptop = new Product(101, "Laptop", 0, 5);
	  warehouse.addProduct(laptop);
	  
	  warehouse.receiveShipment(101, 10);
	  warehouse.fullfillOrder(101, 6);
	  warehouse.fullfillOrder(101, 1);
   }
}
