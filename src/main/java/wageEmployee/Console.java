package wageEmployee;

import java.util.Scanner;

public class Console {
    public static int valueInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }
}
