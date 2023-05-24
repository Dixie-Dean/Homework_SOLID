package managers;

import products.Product;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements Manager {
    private final List<Product> bookList;

    public BookManager() {
        this.bookList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        bookList.add(product);
    }

    @Override
    public List<Product> provideProductList() {
        return this.bookList;
    }
}
