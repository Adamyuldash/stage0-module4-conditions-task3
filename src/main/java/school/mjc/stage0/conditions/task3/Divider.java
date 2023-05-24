package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {

        boolean odi = number == 0;
        if (odi) {
            System.out.println("cannot divide by zero");
        } else {
            boolean b = number % 5 == 0;
            boolean c = number % 11 == 0;
            if (b && c) {
                System.out.println("Dividable");
            }else {
                System.out.println("Non-dividable");
            }
        }
    }

    public static void main(String[] args) {
        int number = 32;
        System.out.println( number % 5 == 0 && number % 11 == 0);
    }
}