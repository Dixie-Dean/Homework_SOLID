package shop;

import managers.Manager;
import order.Filterable;
import products.Product;

public interface Shop extends Filterable {
    void displayProducts();
    Manager getManager();
    Product getProduct(String title);
}
