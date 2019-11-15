package creationtype.factory.factorymethod.eg;

import creationtype.factory.simplefactory.eg.Product;

public class Client {

    public static void main(String[] args) {
        Factory factory;
        factory = new ConcreteFactory();
        Product product;
        product = factory.factoryMethod();
    }
}
