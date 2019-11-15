package creationtype.factory.factorymethod.eg;

import creationtype.factory.simplefactory.eg.ConcreteProduct;
import creationtype.factory.simplefactory.eg.Product;

public class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
