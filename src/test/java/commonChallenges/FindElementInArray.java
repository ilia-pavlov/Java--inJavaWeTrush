package commonChallenges;//find index of integer 7 in Array {23,34,46,231,65,7,78}

public class FindElementInArray {
    public static void main(String[] args) {
        int[] array = {23, 34, 46, 231, 65, 8, 78};
        int valueForSearch = 8;

        boolean indexFound=false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueForSearch) {
                System.out.println("index of integer in array is:"+ i );
                indexFound = true;
            }
        }
            if (!indexFound){
                System.out.println("array doesn't include value for search"+" "+ valueForSearch);
            }
    }

}