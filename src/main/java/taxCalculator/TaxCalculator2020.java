package taxCalculator;

public class TaxCalculator2020 implements canTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.25;
    }
}
