package creationtype.singleton.concurrentClass;

/*
 * 描述：懒汉式（线程不安全，同步代码块）（不可用）
 * */
public class Singleton5 {

    private static Singleton5 INSTANCE;

    private Singleton5(){}

    // 多线程环境存在竞态条件
    public static Singleton5 getInstance(){
        if (INSTANCE == null){
            //未解决线程安全问题，进入if后，多线程仍然会创建多实例
            synchronized (Singleton5.class) {
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }
}
