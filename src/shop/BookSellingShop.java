package shop;

import product.Age;
import product.Language;

public interface BookSellingShop extends Shop {
    void filterBy(Language language);
    void filterBy(Age age);
}
