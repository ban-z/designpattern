package actiontype.strategy.eg;



public abstract class TaxStrategy {
    public abstract double calculate(Object context);
}

class CNTax extends TaxStrategy {

    @Override
    public double calculate(Object context) {
        return 0;
    }
}

class USTax extends TaxStrategy {

    @Override
    public double calculate(Object context) {
        return 0;
    }
}

class DETax extends TaxStrategy {

    @Override
    public double calculate(Object context) {
        return 0;
    }
}


