package Loops;

import java.util.Scanner;

public class WhileLoopIfLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String quit = "quit";
        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass")) //in case if user use the word "pass" terminate search and send him to the beginning of the test
                continue;
            if (input.equals(quit))
                break;
                System.out.println("Wrong Input " + input + " ! try \"quit\" !!");
        }

    }
}
