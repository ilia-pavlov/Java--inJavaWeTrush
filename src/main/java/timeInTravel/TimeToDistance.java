package timeInTravel;

import java.util.Scanner;

public class TimeToDistance {
    public static void main(String[] args) {

       // var travel = new Travel();


        float distance = input("Distance to Location: ");
        float speed = input("Expected Speed: ");

        int seconds = time(distance, speed);
        convert(seconds);
    }

    public static int time(float distance, float speed) {

        float time = distance / speed;
        int seconds = (int) (time * 3600);
        return seconds;
    }

    public static float input(String prompt) {
        float value;
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        value = scanner.nextFloat();
        return value;
    }

    public static void convert(int i) {
        int hours = i / 3600;
        i = i - hours * 3600;
        int minutes = i / 60;
        i = i - minutes * 60;
        int seconds = i;
        System.out.printf("Hours: %d, minutes: %d, seconds: %d%n", hours, minutes, seconds);
    }
}

