package creationtype.factory.simplefactory.eg;

public class ConcreteProduct extends Product {

    private String productName = "null";

    public ConcreteProduct(){}

    public ConcreteProduct(String s) {
        productName = s;
    }

    //实现业务方法
    @Override
    public void methodDiff() {
        //业务方法的实现
        System.out.println("我是业务实现类，我的名字是" + productName);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
