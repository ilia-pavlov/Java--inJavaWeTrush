package Loops;

public class WhileLoopCompareWithFor {
    public static void main(String[] args){
        for (int i = 5; i > 0; i--)
            System.out.println("Hello World " + i );

        int i =5;
        while (i>0) {
            System.out.println("Hello World " + i);
            i--;
        }
    }
}
