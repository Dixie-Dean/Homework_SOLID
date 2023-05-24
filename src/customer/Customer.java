package customer;

import products.Product;

public interface Customer {
    void addToCart(Product product);
    void removeFromCart(String title);
    void pay();
    void checkCart();
}
