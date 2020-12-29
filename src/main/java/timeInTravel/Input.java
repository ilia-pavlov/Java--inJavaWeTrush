package timeInTravel;

import java.util.Scanner;

public class Input {
    private static float value;
    private static Scanner scanner = new Scanner(System.in);

    public static float input(String prompt) {
        System.out.println(prompt);
        value = scanner.nextFloat();
        return value;
    }
    public static void input() {
        value = scanner.nextFloat();
        if(value <= 0)
            throw new IllegalArgumentException("Value cannot be less then 0");
    }
}
