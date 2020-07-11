package actiontype.strategy.eg;

// 税率计算
public class SalesOrder {

    int tax = -1;
    int CN_TAX = 0;
    int US_TAX = 1;
    int DE_TAX = 2;

    int FR_TAX = 3; // 更改

    // 策略模式
    TaxStrategy taxStrategy;

    public SalesOrder(StrategyFactory strategyFactory){
        this.taxStrategy = strategyFactory.createStrategy();
    }

    public double newCalculateTax(){
        double val = taxStrategy.calculate(new Object());
        return val;
    }

    public double CalculateTax(){
        if (tax == CN_TAX){

        }else if (tax == US_TAX){

        }else if (tax == DE_TAX){

        // 更改--------------------
        }else if (tax == FR_TAX){

        }
        return tax;
    }
}
