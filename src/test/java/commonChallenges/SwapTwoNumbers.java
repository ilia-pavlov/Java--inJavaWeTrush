package commonChallenges;

public class SwapTwoNumbers {
    public static void main(String[] args){
            int[] array = {1, 2, 3, 4};
            int indexL = 0;
            int indexR = 3;

                int temp = array[indexL];
                array[indexL] = array[indexR];
                array[indexR] = temp;

               System.out.println(array[0]);
               System.out.println(array[3]);
            }

        }
