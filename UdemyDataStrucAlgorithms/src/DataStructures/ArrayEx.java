package DataStructures;

/** From Lecture 12-13, "A quick review of Arrays in Java" and "Arrays as a Data Structure"
 * https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java/learn/v4/t/lecture/8435754?start=0
 * */

public class ArrayEx {

    public static void main(String[] args) {

        int[] intArray = new int[7]; // Created an array with specified size

        // Fill array
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 20 + i;
        }

        // Print array
        for (int j = 0; j < intArray.length; j++) {
            System.out.print(intArray[j] + " ");
        }

        // Get index of an array - Constant time complexity - O(1) worst case
        int x = intArray[0];
        System.out.println("Index *at* 0 is " + x);


        // Get a value from the array - Linear time complexity - O(n) worst case
        // What would be the worst case? If the number we're looking for is in the last position.
        // We'd have to search the entire array, looping n times.
        // So number of elements ~proportional to~ number of steps we perform

        int y = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                x = i;
            }
        }
        System.out.println("Index *of* 7 is " + y);

    }
}
