package creationtype.prototype.eg;

public class Client {

    public static void main(String[] args) {
        ConcretePrototype obj1 = new ConcretePrototype();
        obj1.setAttr("Sunny");
        Prototype obj2 = obj1.clone();
    }
}
