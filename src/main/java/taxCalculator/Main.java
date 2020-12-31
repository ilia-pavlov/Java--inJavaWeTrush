package taxCalculator;

public class Main {
    public static void main(String[] args){
    TaxCalculator2020 calculator = new TaxCalculator2020(100_000);
    TaxReport reporter = new TaxReport();
    reporter.show(calculator);

    reporter.show(new TaxCalculator2021());
    reporter.show(new TaxCalculator2022(150_000));
    }
}
