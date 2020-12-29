package timeInTravel;

public class TimeToDistance {
    public static void main(String[] args) {

        float distance = Input.input("Distance to Location: "); //secure negative numbers
        float speed = Input.input("Expected Speed: ");

        int seconds = Calculate.time(distance, speed);
        Calculate.convert(seconds);
    }
}

