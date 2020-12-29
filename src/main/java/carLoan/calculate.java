package carLoan;

import java.text.NumberFormat;

public class calculate {
    private static final byte MONTH_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    private static float monthlyInterest;
    private static double calculateAutoLoan;

    private static double calculate(
            int principal,
            float monthlyInterest,
            byte numberOfMonths) {

        calculateAutoLoan = principal * (monthlyInterest
                * Math.pow(1 + monthlyInterest, numberOfMonths))
                / (Math.pow(1 + monthlyInterest, numberOfMonths) - 1);

        return calculateAutoLoan;
    }

    public static String formatCurrency(int principal, float annualInterest, byte numberOfMonths) {
        monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        double autoLoan = calculate(principal, monthlyInterest, numberOfMonths);

        String autoLoanFormatted = NumberFormat.getCurrencyInstance().format(autoLoan);
        return autoLoanFormatted;
    }
}
