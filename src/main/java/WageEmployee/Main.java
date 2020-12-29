package WageEmployee;


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(Console.valueInput("Text your rate: "));
        employee.setHourlyRate(Console.valueInput("Text your hours rate: "));

        System.out.println("Total pay roll is : " + employee.formatCurrency());

    }
}
