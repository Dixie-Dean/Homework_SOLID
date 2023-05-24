package shop;

import managers.BookManager;
import managers.Manager;
import order.Price;
import products.Age;
import products.Language;
import products.Product;

import java.util.Comparator;
import java.util.List;

public class BookStore implements BookSellingShop {
    protected List<Product> books;
    protected Manager manager;

    public BookStore() {
        this.manager = new BookManager();
        this.books = manager.provideProductList();
    }

    @Override
    public Product getProduct(String title) {
        for (Product product : books) {
            if (title.equals(product.getTitle())) {
                return product;
            }
        }
        System.out.println("No results");
        return null;
    }

    @Override
    public void displayProducts() {
        books.forEach(System.out::println);
    }

    @Override
    public Manager getManager() {
        return this.manager;
    }

    @Override
    public void filterBy(Price price) {
        switch (price)  {
            case PRICE_UP -> books.stream().sorted().forEach(System.out::println);
            case PRICE_DOWN -> books.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        }
    }

    @Override
    public void filterBy(Language language) {
        switch (language) {
            case RUSSIAN -> books.stream()
                    .filter(product -> product.getLanguage() == Language.RUSSIAN)
                    .forEach(System.out::println);

            case ENGLISH -> books.stream()
                    .filter(product -> product.getLanguage() == Language.ENGLISH)
                    .forEach(System.out::println);

            case GERMAN -> books.stream()
                    .filter(product -> product.getLanguage() == Language.GERMAN)
                    .forEach(System.out::println);
        }
    }

    @Override
    public void filterBy(Age age) {
        switch (age) {
            case CHILDREN -> books.stream()
                    .filter(product -> product.getAge() == Age.CHILDREN)
                    .forEach(System.out::println);

            case ADULTS -> books.stream()
                    .filter(product -> product.getAge() == Age.ADULTS)
                    .forEach(System.out::println);
        }
    }
}
