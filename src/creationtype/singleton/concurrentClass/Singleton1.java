package creationtype.singleton.concurrentClass;

/*
* 描述：饿汉式（静态常量）（可用）
*           简单
*           类装载式就完成实例化
* */
public class Singleton1 {

    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
