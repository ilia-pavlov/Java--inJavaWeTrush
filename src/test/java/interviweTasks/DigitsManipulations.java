package interviweTasks;//Given a positive integer number 'n', your test
// is to calculate the difference between
// the product of its digits and the sum of digits.
//The order matters; the answer should be of the form
//product - sum(and not sum-product)

public class DigitsManipulations {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};

        int sumP = 1;
        for (int numP : arr) {
            sumP *= numP;
            if(arr[5] !=numP){
                continue;
            }
            //System.out.println(sumP);

            int sumS = 0;
            for (int numS : arr) {
                sumS += numS;
                //System.out.println(sumS);
            }
            int n = sumP - sumS;
            System.out.println(n);
        }
    }
}
