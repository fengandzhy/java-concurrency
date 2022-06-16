package org.zhouhy.concurrency.phase01.ch05;

public class TaxCalculator {
    
    private double salary;
    private double bonus;
    private TaxCalculatorStrategy taxCalculatorStrategy;
    
    public TaxCalculator(double salary,double bonus,TaxCalculatorStrategy taxCalculatorStrategy){
        this.salary = salary;
        this.bonus = bonus;
        this.taxCalculatorStrategy = taxCalculatorStrategy;
    }
    
    public double calculate(){
        return taxCalculatorStrategy.calculatorTax(salary,bonus);
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }
}
