package homework1.model.impl;

import homework1.log.impl.ConsoleLogger;
import homework1.model.Calculable;

public class Calculator implements Calculable {
    private double primaryArg;

    ConsoleLogger logger = new ConsoleLogger();

    public Calculator(double primaryArg) {
        this.primaryArg = primaryArg;
    }
    @Override
    public Calculable sum(double arg) {
        logger.log(String.format("Вычисляется сумма чисел: %f и %f", primaryArg, arg));
        primaryArg+=arg;
        return this;
    }

    @Override
    public Calculable multiply(double arg) {
        primaryArg*=arg;
        return this;
    }

    @Override
    public Calculable divide(double arg) {
        primaryArg/=arg;
        return this;
    }

    @Override
    public double getResult() {
        return primaryArg;
    }
}
