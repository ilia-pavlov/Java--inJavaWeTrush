package MorrgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 50);
        byte years = (byte) readNumber("Period (Year): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        printFront(mortgageFormatted);

        for (short month = 1; month <= years * MONTH_IN_YEAR; month++) {
            double balance = remainderLoanBalance(principal, annualInterest, years, month);

            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static void printFront(String text) {

        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + text);
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
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

    public static double remainderLoanBalance(
            int principal,
            float annualInterest,
            byte years,
            short numbersOfPaymentsMade) {

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);


        double remainder = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numbersOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1); // B=L[(1+c)n - (1+c)p] / [(1+c)n -1]

        return remainder;
    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);

        double mortgage = principal * (monthlyInterest
                * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}