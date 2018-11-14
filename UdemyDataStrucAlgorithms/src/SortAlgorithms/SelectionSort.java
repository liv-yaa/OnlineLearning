package SortAlgorithms;

/** Demo of Selection Sort algorithm:
 * 1. Find the largest element in the list and swap it w/ element in last position
 * 2. Find the next largest element in the list and swap it w/ element in the next to last position
 * 3. Continue until we reach the first position
 *
 * lastUnsortedIndex = 6 - this is the last index of the unsorted partition
 * i = 0 - this is the index used to traverse the array from left to right
 * largest = 4 - index of the largest element in unsorted partition
 *
 * */

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        // OUTER LOOP: Traverse from end
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --) {

            int largest = 0;

            // INNER LOOP: Traverse the unsorted partition and look for largest element:
            for (int i = 1; i <= lastUnsortedIndex; i++) {

                if (array[i] > array[largest]) {
                    largest = i; // Found a new largest element
                }
            }

            // SWAP:
            swap(array, largest, lastUnsortedIndex);
        }

        // Print sorted array
        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        // else
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
