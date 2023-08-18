package homework2.test.model.impl;

import homework2.test.log.Loggable;
import homework2.test.log.impl.ConsoleLogger;
import homework2.test.model.Calculable;

import java.time.LocalDateTime;

public class Calculator implements Calculable{
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
        logger.log(String.format("Вычисляется произведение чисел: %f и %f", primaryArg, arg));
        primaryArg*=arg;
        return this;
    }

    @Override
    public Calculable divide(double arg) {
        logger.log(String.format("Вычисляется деление чисел: %f и %f", primaryArg, arg));
        primaryArg/=arg;
        return this;
    }

    @Override
    public double getResult() {
        logger.log(String.format("Результат = %f", primaryArg));
        return primaryArg;
    }
}
