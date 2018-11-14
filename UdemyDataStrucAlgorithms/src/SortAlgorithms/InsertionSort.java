package SortAlgorithms;
/**
 *
 * InsertionSort sort has EXPONENTIAL (very bad) runtime
 * O(n^2) time complexity
 *
 * Stable - we're growing the Sorted Partition, from left to right.
 *
 * */

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        // Implementation starts out by assuming the element at 0 is the Sorted partition.
        // So, the firstUnsortedIndex starts out as the elem at 1 (35, here) ...and traverses to end position (-22, here).
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
                firstUnsortedIndex++) {

            // Save the value we are going to insert bc it will be overwritten during shifting:
            int newElem = array[firstUnsortedIndex];
            int i;

            // Keep looking through the SORTED partition for the insertion position. until:
            // That is, until we:
            // - hit the front, AND
            // - the elem at i - 1 is greater than newElem.
            // (Decrement i because we're moving left)
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElem; i--) {

                // Shift the element at i - 1 to the right, to make room for newElem.
                // Shifting left is done by replacing adjacent indexes:
                array[i] = array[i - 1];

            }

            // Assign the new element to the new position:
            array[i] = newElem;

        }


        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
