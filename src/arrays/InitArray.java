package arrays;
// Initializing the elements of an array to default values of zero.

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ARRAY_LENGTH]; // create array

        // calculate value for each array element
        for(int counter=0; counter<array.length;counter++)
            array[counter]=2 + 2*counter;

        System.out.printf("%s%8s\n", "Index", "Value"); // column headings

        // output each array element's value
        for(int counter =0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
    } // end main
} // end class InitArray
