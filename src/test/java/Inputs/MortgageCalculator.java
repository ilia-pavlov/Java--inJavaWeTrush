package Inputs;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {


        int principal = 0;
        float annualInterest = 0;
        byte years = 0;

        principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        annualInterest = (float) readNumber("Annual Interest: ", 1, 50);
        years = (byte) readNumber("Period (Year): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + "and " + max);
        }
        return value;
    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);

        double mortgage = principal * (monthlyInterest
                * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

}
