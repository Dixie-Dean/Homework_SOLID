import customer.Customer;
import customer.Person;
import manager.Manager;
import order.Price;
import product.Age;
import product.Book;
import product.Language;
import product.PicturedBook;
import shop.BookSellingShop;
import shop.BookStore;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("SHOP");
        BookSellingShop bookShop = new BookStore();

        Manager manager = bookShop.getManager();
        manager.addProduct(new Book(
                "Hobbit",
                "Great Britain",
                new BigDecimal("9.95"),
                Age.CHILDREN,
                Language.ENGLISH)
        );

        manager.addProduct(new Book(
                "The Lord of The Rings",
                "Great Britain",
                new BigDecimal("10.55"),
                Age.ADULTS,
                Language.ENGLISH)
        );

        manager.addProduct(new Book(
                "War and Piece",
                "Russia",
                new BigDecimal("11.35"),
                Age.ADULTS,
                Language.RUSSIAN)
        );

        manager.addProduct(new Book(
                "Crime and Punishment",
                "Russia",
                new BigDecimal("9.40"),
                Age.ADULTS,
                Language.RUSSIAN)
        );

        manager.addProduct(new Book(
                "Three Comrades",
                "Germany",
                new BigDecimal("8.80"),
                Age.ADULTS,
                Language.GERMAN)
        );

        manager.addProduct(new Book(
                "Arch of Triumph",
                "Germany",
                new BigDecimal("8.60"),
                Age.ADULTS,
                Language.GERMAN)
        );

        manager.addProduct(new Book(
                "Harry Potter",
                "Great Britain",
                new BigDecimal("5.60"),
                Age.CHILDREN,
                Language.ENGLISH)
        );

        manager.addProduct(new PicturedBook(
                "Harry Potter II",
                "Great Britain",
                new BigDecimal("8.60"),
                Age.CHILDREN,
                Language.ENGLISH));

        bookShop.displayProducts();

        System.out.println("\nFilter Price: ");
        bookShop.filterBy(Price.PRICE_UP);

        System.out.println("\nFilter Language: ");
        bookShop.filterBy(Language.GERMAN);

        System.out.println("\nFilter Age: ");
        bookShop.filterBy(Age.CHILDREN);


        System.out.println("\nCUSTOMER ");
        Customer customer = new Person();

        customer.addToCart(bookShop.getProduct("Hobbit"));
        customer.addToCart(bookShop.getProduct("Harry Potter"));
        customer.checkCart();

        customer.removeFromCart("Harry Potter");
        customer.checkCart();

        customer.pay();
    }
}