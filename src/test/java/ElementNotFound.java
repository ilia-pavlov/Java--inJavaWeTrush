// print out message (ONLY) if no elements found

public class ElementNotFound {
    public static void main(String[] args) {
        int[] array = {1, 32, 34, 2, 653, 737, 357357};
        int valueToSearch = 2;

        boolean isElementFound = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToSearch) {
                System.out.println("element value found:" + array[i]);
                System.out.println("index of the element is:" + i);
                isElementFound = true;
            }
        }

        if (!isElementFound) {
            System.out.println("element is not in the array");
        }
    }
}

