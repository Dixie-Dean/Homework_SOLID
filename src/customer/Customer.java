package customer;

import product.Product;

public interface Customer {
    void addToCart(Product product);
    void removeFromCart(String title);
    void pay();
    void checkCart();
}
