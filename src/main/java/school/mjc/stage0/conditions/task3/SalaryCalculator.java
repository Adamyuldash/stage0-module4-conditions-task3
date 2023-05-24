package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxes = 0;
        if (salary <= 10000) {taxes = salary * 0.15;}
        else if (salary <= 20000) {taxes = salary * 0.18;}
        else {taxes = salary * 0.20;}

        double salaryAfterTaxes = salary - taxes;
        System.out.println( salaryAfterTaxes);
        }
    }

