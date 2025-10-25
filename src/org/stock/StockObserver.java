package org.stock;

import org.product.Product;

public interface StockObserver {
   void onLowStock(Product prod);
}
