package MortgageCalculator;


public class MortgageCalculator {
    private final static byte MONTH_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;


    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double remainderLoanBalance(short numbersOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = years * MONTH_IN_YEAR;

        double remainder = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numbersOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1); // B=L[(1+c)n - (1+c)p] / [(1+c)n -1]

        return remainder;
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal * (monthlyInterest
                * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }

    private int getNumberOfPayments() {
        return years * MONTH_IN_YEAR;
    }

    public double[] getRemainingBalances() {
        double[] balances = new double [getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances [ month -1] = remainderLoanBalance(month);

        return balances;
    }


    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTH_IN_YEAR;
    }
}

