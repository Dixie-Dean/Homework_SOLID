package products;

import java.math.BigDecimal;

public class Book implements Product {
    private final String title;
    private final String country;
    private final BigDecimal price;
    private final Age age;
    private final Language language;

    public Book(String title, String country, BigDecimal price, Age age, Language language) {
        this.title = title;
        this.country = country;
        this.price = price;
        this.age = age;
        this.language = language;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Age getAge() {
        return age;
    }

    @Override
    public Language getLanguage() {
        return language;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Country: " + country + " | Price: " + price + " | Tags: " + age + ", " + language;
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}
