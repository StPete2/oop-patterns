package homework1.controller;

import homework1.model.Calculable;
import homework1.model.impl.Calculator;

import java.util.Scanner;

public class UserController implements Parsable, Calculable {
    private Calculable calculator;

    @Override
    public double parseDouble(String inputString){
        return Double.parseDouble(inputString);
    }

    public Calculable create(double primaryArg) {
        return calculator = new Calculator(primaryArg);
    }


    public String scan(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    @Override
    public Calculable sum(double arg) {
//        logger.log(String.format("Вычисляется сумма чисел: %f и %f", calculator.getResult(), arg));
        return calculator.sum(arg);
    }

    @Override
    public Calculable multiply(double arg) {
        return calculator.multiply(arg);
    }

    @Override
    public Calculable divide(double arg) {
        return calculator.divide(arg);
    }

    @Override
    public double getResult() {
        return calculator.getResult();
    }
}
