package Playground;

public class inputOfCode01 {
    public static void main (String[] args){
        int a =7;
        int b = 9;
        swap(a,b);
        System.out.println(a +""+b);
    }

    private static void swap(int a, int b) {
        int c=a;
        a=b;
        b=c;
        System.out.println(a +""+ b + "");
    }

}
