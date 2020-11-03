package commonChallenges;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ArrayLength {
    public static void main (String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length - 2; i++) {
                System.out.println(array[i]);
            }
        }
    }
class ReverseArrayLength {
    public static void main (String[] args) {

        Integer[] idaho = {1, 2, 3, 4, 5};
        List<Integer> numbers = Arrays.asList(idaho);
        Collections.reverse(numbers);
        for(Integer X: numbers){
            System.out.printf("%s", X);
        }

    }
}
