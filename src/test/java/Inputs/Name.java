package Inputs;

import java.util.Scanner;

public class Name {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine().trim();    //scanner.next() for one word®     //trim(); for trimming spaces
        System.out.println("You are " + name);
    }
}
