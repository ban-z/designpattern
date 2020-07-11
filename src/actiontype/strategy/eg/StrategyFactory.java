package actiontype.strategy.eg;

public class StrategyFactory {

    public TaxStrategy createStrategy(){
        return new TaxStrategy() {
            @Override
            public double calculate(Object context) {
                return 0;
            }
        };
    }
}
