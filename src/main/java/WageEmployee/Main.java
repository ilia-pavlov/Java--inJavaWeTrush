package WageEmployee;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.baseSalary = valueInput("Text your rate: ");
        employee.hourlyRate = valueInput("Text your hours rate: ");

        int wage = employee.calculateWage(valueInput("Text your overtime: "));
        String wageFormatted = NumberFormat.getCurrencyInstance().format(wage);

        System.out.println("Total pay roll is : " + wageFormatted);
    }

    private static int valueInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }
}
