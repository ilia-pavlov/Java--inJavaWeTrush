package arrayAndList;

import java.util.Arrays;


public class LinkedListFunctions {
    public static void main (String[] args){

        String[]fruits ={" apples "," oranges "," bananas "," watermelon "};
        java.util.LinkedList<String> myList = new java.util.LinkedList<String>(Arrays.asList(fruits));


        myList.add(" plumps ");
        myList.addFirst(" chary ");


        //convert back to an array
        fruits = myList.toArray(new String[myList.size()]);

        for(String fruitsNumber : fruits){
            System.out.printf("%s", fruitsNumber);
        }

    }
}
