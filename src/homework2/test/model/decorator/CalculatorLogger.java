//package homework2.test.model.decorator;
//
//import homework2.test.log.Loggable;
//import homework2.test.model.Calculable;
//
//public class CalculatorLogger implements Calculable {
//    private Calculable calculator;
//    private Loggable logger;
//
//    public CalculatorLogger(Calculable calculator, Loggable logger) {
//        this.calculator = calculator;
//        this.logger = logger;
//    }
//
//    @Override
//    public Calculable sum(double arg) {
//        logger.log(String.format("Вычисляется сумма чисел: %f и %f", calculator.getResult(), arg));
//        return calculator.sum(arg);
//    }
//
//    @Override
//    public Calculable multiply(double arg) {
//        logger.log(String.format("Вычисляется произведение чисел: %f и %f", calculator.getResult(), arg));
//        return calculator.multiply(arg);
//    }
//
//    @Override
//    public Calculable divide(double arg) {
//        logger.log(String.format("Вычисляется деление чисел: %f и %f", calculator.getResult(), arg));
//        return calculator.divide(arg);
//    }
//
//    @Override
//    public double getResult() {
//        logger.log(String.format("Результат = %f", calculator.getResult()));
//        return calculator.getResult();
//    }
//}
