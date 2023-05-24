package shop;

import products.Age;
import products.Language;

public interface BookSellingShop extends Shop {
    void filterBy(Language language);
    void filterBy(Age age);
}
