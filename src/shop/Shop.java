package shop;

import manager.Manager;
import order.Filterable;
import product.Product;

public interface Shop extends Filterable {
    void displayProducts();
    Manager getManager();
    Product getProduct(String title);
}
