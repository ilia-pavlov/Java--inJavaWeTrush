package WageEmployee;

import java.text.NumberFormat;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Good try buddy! BUT...salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
        throw new IllegalArgumentException("Again nice try! BUT.....hours rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public String formatCurrency() {
        int wage = calculateWage(Console.valueInput("Text your overtime: "));
        String wageFormatted = NumberFormat.getCurrencyInstance().format(wage);
        return wageFormatted;
    }
}
