package creationtype.singleton.concurrentClass;

/*
* 双重检查：推荐使用
*       线程安全
*       延迟加载
*       效率较高
*
* 为什么要double-check？
*           保证线程安全；
* 单check为什么不行？
*           多次创建实例
* 饿汉式：性能问题
*
* 为什么要用volatile？
*       新建对象实际上由三个步骤（基础变量赋值，引用赋值，原子变量类未原子操作）
*           resource = new Resource();
*               1.创建一个空对象Resource
*               2.调用构造方法
*               3.赋值给resource引用
*               （会受重排序影响    1.3.2 --> 导致空指针）
* */
public class Singleton6 {

    //volatile防止重排序（创建对象的三个步骤）
    //并且提供了可见性
    private volatile static Singleton6 INSTANCE;

    private Singleton6(){}

    // 多线程环境存在竞态条件
    public static Singleton6 getInstance(){
        if (INSTANCE == null){
            synchronized (Singleton6.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton6();
                }
            }
        }
        return INSTANCE;
    }
}
