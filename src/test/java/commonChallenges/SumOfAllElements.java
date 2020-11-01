package commonChallenges;

//write the function then takes an array of integers the sum of all elements
//sumArray([1,2,3,4,5]) -> 15
public class SumOfAllElements {
    public static void main(String[] args) {
        int[] array = {10,23,12,23,45};
        //int[]array = new int[100]; new list - 100 numbers in array with 0 value
        int sum = 0;
        for (int num : array) {
              sum += num;
           if (array[99] != num) {
                 continue;
                }
                System.out.println("The sum of the elements is " + sum);

           }
        }
    }

