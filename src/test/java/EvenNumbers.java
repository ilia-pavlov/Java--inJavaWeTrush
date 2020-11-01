//1. Loop
//2. Go though number from 1 to 10
//3. Filter out only even numbers
//4. Print "hello there!"

public class EvenNumbers {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String phraseToPrint = "Hello there!";

        for (int i = 0; i < input.length; i++) {
            int currentElement = input[i];
            if (currentElement % 2 == 0) {
                System.out.println(currentElement + " " + phraseToPrint);

            } else {
                System.out.println("Number out of boundaries:" + currentElement);
            }
        }
    }
}