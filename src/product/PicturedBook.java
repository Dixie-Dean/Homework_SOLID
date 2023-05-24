package product;

import java.math.BigDecimal;

public class PicturedBook extends Book{
    public PicturedBook(String title, String country, BigDecimal price, Age age, Language language) {
        super(title, country, price, age, language);
    }
}
