package Inputs;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        double age = scanner.nextDouble(); // byte age = scanner.nextByte();  for integer age
        System.out.print("You are " + age);
    }
}