package carLoan;


import java.util.Scanner;

public class Value {
    public float numbers;
    public byte MONTH_IN_YEAR = 12;
    public byte PERCENT = 100;

    public float input(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        numbers = scanner.nextFloat();
        return numbers;
    }
    public float calculateMonthlyInterest ( float annualInterest){
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        return monthlyInterest;
    }

    public double calculate(
            int principal,
            float monthlyInterest,
            byte numberOfMonths){

        double calculateAutoLoan  = principal * (monthlyInterest
                * Math.pow(1 + monthlyInterest,numberOfMonths))
                / (Math.pow(1+monthlyInterest,numberOfMonths) -1);
        return calculateAutoLoan;
    }

}
