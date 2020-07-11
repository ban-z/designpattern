package actiontype.strategy.storyrealize;

public class Main {

    static Context context;
    static AbstractStrategy strategy;

    public static void main(String[] args) {
        context = new Context();
        strategy = new ConcreteStrategA();
        context.setStrategy(strategy);
        context.algorithm();
    }
}
