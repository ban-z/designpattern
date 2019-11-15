package creationtype.factory.simplefactory.eg;

public abstract class Product {

    //所有产品的公共业务方法
    public void methodSame(){
        //公共方法的实现
        System.out.println("基类公共方法的实现");
    }

    //声明抽象业务方法
    public abstract void methodDiff();
}
