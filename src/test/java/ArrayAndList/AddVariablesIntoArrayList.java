package ArrayAndList;

import java.util.Arrays;
import java.util.LinkedList;


class AddIntegersArrayList {
    public static void main(String[] args){
        Integer[] numbers = {1,2,3,4,5};
        LinkedList<Integer> line = new LinkedList<Integer>(Arrays.asList(numbers));

        line.add(6);
        line.addFirst(0);
        line.add(1, 9);

        numbers = line.toArray(new Integer[line.size()]);
        for(int numOfNumbers : numbers){
            System.out.printf("%s", numOfNumbers);
        }
    }
}

class AddStringsIntoArrayList {
    public static void main(String[] args){
        String[] numbers = {" one ", " two ", " tree ", " four "};
        LinkedList<String> line = new LinkedList<String>(Arrays.asList(numbers));

        line.add(" Five ");
        line.addFirst(" Zero ");
        line.add(1, " FirstFirst ");

        numbers = line.toArray(new String[line.size()]);
        for(String numOfNumbers : numbers){
            System.out.printf("%s", numOfNumbers);
        }
    }
}