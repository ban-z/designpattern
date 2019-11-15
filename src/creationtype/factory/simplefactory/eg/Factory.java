package creationtype.factory.simplefactory.eg;

public class Factory {

    //静态工厂方法
    public static Product getProduct(String arg){
        Product product = null;
        if (arg.equalsIgnoreCase("A")){
            product = new ConcreteProduct("A");
        }else if (arg.equalsIgnoreCase("B")){
            product = new ConcreteProduct("B");
        }

        return product;
    }
}
