package org.zhouhy.concurrency.phase01.ch05;

@FunctionalInterface
public interface TaxCalculatorStrategy {
    double calculatorTax(double salary, double bonus);
}
