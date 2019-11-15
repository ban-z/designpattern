package creationtype.singleton.concurrentClass;

import creationtype.factory.abstractfactory.storyrealize.button.SpringButton;

/*
* 静态内部类：（可用）(归结为懒汉式)
* */
public class Singleton7 {

    private Singleton7(){}

    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
