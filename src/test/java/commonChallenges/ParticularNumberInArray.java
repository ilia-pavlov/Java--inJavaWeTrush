package commonChallenges;//write a function to check if an array contains a particular number:
//check([1,2,3,4,5,],     3 -> true

public class ParticularNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            if (num == 3)
                System.out.println(num + " true!");
        }
    }
}

