package products;

import java.math.BigDecimal;

public interface Product extends Comparable<Product> {
    BigDecimal getPrice();
    Language getLanguage();
    Age getAge();
    String getTitle();
}
