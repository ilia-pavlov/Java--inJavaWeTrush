package taxCalculator;

public class TaxReport {
    private canTaxCalculator calculator;

//    public TaxReport(ableTaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    public void show(canTaxCalculator calculator) {
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(ableTaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
