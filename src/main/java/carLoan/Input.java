package carLoan;

import java.util.Scanner;

public class Input {
    public static float input(String text){

        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        float numbers = scanner.nextFloat();
        return numbers;
    }
}
