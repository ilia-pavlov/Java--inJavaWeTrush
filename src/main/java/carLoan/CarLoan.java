package carLoan;


public class CarLoan {
    public static void main (String[] args){

        int principal = (int) Input.input("Principal: ");
        float annualInterest = Input.input("Annual Interest Rate: ");
        byte numberOfMonths = (byte) Input.input("Period (Months): ");

        String autoLoanFormatted = calculate.formatCurrency(principal, annualInterest, numberOfMonths);
        System.out.println("Auto Loan: " + autoLoanFormatted);
    }

}
