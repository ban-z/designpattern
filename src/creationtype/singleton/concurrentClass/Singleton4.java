package creationtype.singleton.concurrentClass;

/*
 * 描述：懒汉式（线程安全，同步方法）（不推荐使用）
 *          效率太低
 * */
public class Singleton4 {

    private static Singleton4 INSTANCE;

    private Singleton4(){}

    // 多线程环境存在竞态条件
    public synchronized static Singleton4 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }
}
