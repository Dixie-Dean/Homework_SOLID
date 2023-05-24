package manager;

import product.Product;

import java.util.List;

public interface Manager {
    void addProduct(Product product);
    List<Product> provideProductList();
}
