package taxCalculator;

public class TaxCalculator2022 implements canTaxCalculator {
    private  double taxableIncome2022;

    public TaxCalculator2022(double taxableIncome2022) {
        this.taxableIncome2022 = taxableIncome2022;
    }

    @Override
    public double calculateTax() {
        return taxableIncome2022 * 0.3;
    }
}
