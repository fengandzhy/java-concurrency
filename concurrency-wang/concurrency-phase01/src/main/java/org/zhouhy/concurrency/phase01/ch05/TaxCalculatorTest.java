package org.zhouhy.concurrency.phase01.ch05;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(10000,5000,(a,b)-> a*0.1 + b*0.15);
        System.out.println(taxCalculator.calculate());
    }
}
