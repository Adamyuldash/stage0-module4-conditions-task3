package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double tax;

        if ( salary > 0 && salary   <= 10000) {
            tax = salary * 0.15;

            System.out.println(salary - tax);
        } else if (salary > 10000 && salary <= 20000) {
            tax = salary * 0.18;
            System.out.println(salary - tax);
        } else if ( salary > 20000){
            tax = salary * 0.2;
            System.out.println(salary - tax);
           }else {
        System.out.println("wrong input!");

        }
    }


    }





