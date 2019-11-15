package creationtype.singleton.concurrentClass;

/*
* 描述：懒汉式（线程不安全）（不可用）
* */
public class Singleton3 {

    private static Singleton3 INSTANCE;

    private Singleton3(){}

    // 多线程环境存在竞态条件
    public static Singleton3 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
