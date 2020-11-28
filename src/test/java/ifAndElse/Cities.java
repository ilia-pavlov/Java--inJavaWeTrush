package ifAndElse;

import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("New of City: ");
        String city = scanner.nextLine();

        switch (city) {
            case "New York":
                System.out.println("To New York 35mi");
                break;

            case "Tampa":
                System.out.println("To Tampa 1375mi");

            default:
                System.out.println("No city was selected");
        }
    }
}

