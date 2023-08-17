package homework2.test.model;

public interface Calculable {
    Calculable sum (double arg);
    Calculable multiply (double arg);
    Calculable divide (double arg);
    double getResult();
}
