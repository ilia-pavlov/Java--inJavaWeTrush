package Inputs;

import java.util.Scanner;

public class TimeToDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Distance to Location: ");
        float distance = scanner.nextFloat();

        System.out.println("Expected Speed: ");
        float speed = scanner.nextFloat();
        float time = distance / speed;
        int seconds = (int) (time * 3600);

        convert(seconds);
    }
    private static void convert(int i) {
        int hours = i / 3600;
        i = i - hours * 3600;
        int minutes = i / 60;
        i = i - minutes * 60;
        int seconds = i;
        System.out.printf("Hours: %d, minutes: %d, seconds: %d%n", hours, minutes, seconds);
    }
}

