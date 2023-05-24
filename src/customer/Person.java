package customer;

import products.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Person implements Customer {
    private final List<Product> cart;

    public Person() {
        this.cart = new ArrayList<>();
    }

    @Override
    public void addToCart(Product product) {
        cart.add(product);
    }

    @Override
    public void removeFromCart(String title) {
        cart.removeIf(product -> product.getTitle().equals(title));
    }

    @Override
    public void pay() {
        System.out.println("Transaction successfully conducted!");
        cart.clear();
    }

    @Override
    public void checkCart() {
        BigDecimal sum = new BigDecimal(0);
        System.out.println("Your cart:");
        for (Product product : cart) {
            sum = sum.add(product.getPrice());
            System.out.println(product);
        }
        System.out.println("Total sum: " + sum + "\n");
    }
}
