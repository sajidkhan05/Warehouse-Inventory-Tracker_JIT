package org.stock;

import org.product.Product;

public class AlertService implements StockObserver {
	public void onLowStock(Product prod) {
		System.out.println("Alert: Low stock for "+prod.getName()+" - only "+prod.getQuantity()+" left!");

	}

}
