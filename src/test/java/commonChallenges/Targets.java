package commonChallenges;//Given an array of integers nums and integer target,
//return indices of the two numbers such then they add up to target;
//You can return the answer in any order.

public class Targets {
    public static void main(String[] args) {
        int[] array = {1, 23, 54, 654, 78, 9};
        int target = 55;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                    int sums1 = array[i];
                    int sums2 = array[j];
                    if (sums1 + sums2 == target) {
                        System.out.println("indices are add up to target" + " " + i + " " + j);

                    }
                }
            }
        }
    }
