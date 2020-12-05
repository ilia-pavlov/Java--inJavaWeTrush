package playground;

import java.text.NumberFormat;
import java.util.Scanner;

public class codingClean {
    public static void main(String[] args){

        int weekPayCheck = takeRatePerHour("Your hours pay: ") * workHours("Your work hour on last week: ");
       String payCheckFormat = NumberFormat.getNumberInstance().format(weekPayCheck);
        System.out.println("Your week pay check is : $" + payCheckFormat);
    }

    public static int takeRatePerHour(String hourRate ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hourRate);
        int hoursPay = scanner.nextByte();
        return hoursPay;
    }
    public static int workHours(String lastWeekHours ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lastWeekHours);
        int workHours = scanner.nextByte();
        return workHours;
    }
}
