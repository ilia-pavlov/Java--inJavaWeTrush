package MortgageCalculator;

public class Main {


    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest: ", 1, 50);
        byte years = (byte) Console.readNumber("Period (Year): ", 1, 30);

        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
        }
    }
