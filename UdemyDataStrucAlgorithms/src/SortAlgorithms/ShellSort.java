package SortAlgorithms;

/**
 *
 * ShellSort sort has EXPONENTIAL runtime with O(n^2) time complexity, BUT
 * More often than not, it performs better than other exponential sorts
 *
 * Unstable - we have to compare elements that are far away from each otehr.
 * Not In Place. Why?
 *
 * Does not use swap()
 *
 * Steps:
 * - Iterate through a gap value, which eventually decreases to 1 (Insertion sort)
 * -
 * -
 *
 * */

public class ShellSort {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        // 1 - Iterate through a gap value, which eventually decreases to exactly 1
        // For our purposes, we're just using the length / 2, but other sequences have different affect on runtime.
        // Each time we divide gap by 2 (taking floor value, int - of course)

        for (int gap = array.length / 2; gap >= 1; gap /= 2) {

            // Looks the same as InsertionSort, but uses gap:
            for (int i = gap; i < array.length; i ++) {

                int newElem = array[i]; // The value we're looking at
                int j = i;

                // This is similar to the inner for - loop in InsertionSort
                while (j >= gap && array[j - gap] > newElem) {

                    array[j] = array[j - gap];

                    // j now becomes the next "gap jump" over:
                    j -= gap;



                }

                // we found the location:
                array[j] = newElem;

            }


        }


        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
