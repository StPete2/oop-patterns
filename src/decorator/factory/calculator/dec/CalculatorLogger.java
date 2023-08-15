package decorator.factory.calculator.dec;

import decorator.factory.calculator.Calculable;
import decorator.log.Loggable;

public class CalculatorLogger implements Calculable {
    private Calculable calculator;
    private Loggable logger;
    @Override
    public Calculable sum(int arg) {
        return null;
    }

    @Override
    public Calculable multi(int arg) {
        return null;
    }

    @Override
    public int getResult() {
        return 0;
    }
}
