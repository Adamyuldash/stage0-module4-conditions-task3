package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        System.out.println(new DaysInMonthPrinter().amountOfDaysInt(month));
    }


    public String amountOfDaysInt(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) return "31";
        if (month == 4 || month == 6 || month == 9 || month == 11) return "30";
        if (month == 2) return "28";
        return "wrong number!";
    }
}




