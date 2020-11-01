package commonChallenges;

public class FizzAndBuzz {
    public static void main(String[] args) {
        int numbers = 10;
        for (int i = 1; i <= numbers; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                System.out.println("FizzAndBuzz");
            } else if
                (i % 2 == 0) {
                    System.out.println("Fizz");
                } else if
                    (i % 3 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i + " " + "out of boundaries!");
                    }
                }
            }
        }
