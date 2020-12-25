package carLoan;

import java.text.NumberFormat;


public class CarLoan {
    public static void main (String[] args){

        Value value = new Value();

        int principal = (int)value.input("Principal: ");
        float annualInterest = value.input("Annual Interest Rate: ");

        float monthlyInterest = value.calculateMonthlyInterest(annualInterest);
        byte numberOfMonths = (byte) value.input("Period (Months): ");

        double autoLoan = value.calculate(principal,monthlyInterest,numberOfMonths);
        String autoLoanFormatted = NumberFormat.getCurrencyInstance().format(autoLoan);

        System.out.println("Auto Loan: " + autoLoanFormatted);
    }
}
