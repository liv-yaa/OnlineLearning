package SortAlgorithms;

/**
 * Sorted partition grows by 1
 * Bubble sort has EXPONENTIAL (very bad) runtime
 * O(n^2) time complexity
 *
 *
 * */

public class BubbleSort {

    public static void main(String[] args) {

        int[] bubbleSortArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = bubbleSortArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {

            // Inner loop - traverse the array
            // "Bubble" the largest value to the end of the array
            // Only need to go up to the lastUnsortedIndex
            for (int i = 0; i < lastUnsortedIndex; i++) {

                // Check adjacent values:
                if (bubbleSortArray[i] > bubbleSortArray[i + 1]) {

                    // Use helper method:
                    swap(bubbleSortArray, i, i + 1);
                }

            }
        }

        for (int i = 0 ; i < bubbleSortArray.length; i++) {
            System.out.print(bubbleSortArray[i] + " ");
        }
    }

    // Helper function
    public static void swap (int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        // Swap
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }




}
