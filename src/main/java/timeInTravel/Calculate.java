package timeInTravel;

public class Calculate {
    private static int seconds;

    public static int time(float distance, float speed) {

        float time = distance / speed;
        seconds = (int) (time * 3600);
        return seconds;
    }

    public static void convert(int i) {
        int hours = i / 3600;
        i = i - hours * 3600;
        int minutes = i / 60;
        i = i - minutes * 60;
        seconds = i;
        System.out.printf("Hours: %d, minutes: %d, seconds: %d%n", hours, minutes, seconds);
    }
}
