package Inputs;

import java.text.NumberFormat;
import java.util.Scanner;

public class CarLoan {
    public static void main (String[] args){
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;

        System.out.println("Period (Months): ");
        byte numberOfMonths = scanner.nextByte();

        double autoLoan  = principal * (monthlyInterest
                * Math.pow(1 + monthlyInterest,numberOfMonths))
                / (Math.pow(1+monthlyInterest,numberOfMonths) -1);

        String autoLoanFormatted = NumberFormat.getCurrencyInstance().format(autoLoan);
        System.out.println("Auto Loan: " + autoLoanFormatted);
    }
}
