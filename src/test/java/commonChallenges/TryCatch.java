package commonChallenges;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int index = 10;

        int element01=0;
        try {
            element01 = arr[index];
        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("Exception been thrown");
        }
        System.out.println(element01);
    }
}

