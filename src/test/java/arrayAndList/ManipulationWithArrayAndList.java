package arrayAndList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ManipulationWithArrayAndList {
    public static void main (String[] args){

        //create an array and convert to list
        Character[] ray = {'p','o','w'};
        List<Character> line = Arrays.asList(ray);
        System.out.println("List is : ");
        output(line);

        //reverse and print out the list
        Collections.reverse(line);
        System.out.println("After reverse : ");
        output(line);

        //create new array and a new list
        Character[] newRay = new Character[3];
        List<Character> copyLine = Arrays.asList(newRay);


        //copy contest of line into copyLine
        Collections.copy(copyLine,line);
        System.out.println("Copy of list : ");
        output(copyLine);

        //fill collection with crap
        Collections.fill(line,'X');
        System.out.println("After filling the list : ");
        output(line);
    }
    // output method
    private static void output(List<Character> list) {

        for (Character thing:list)
            System.out.printf("%s", thing );

        System.out.println();
    }
}