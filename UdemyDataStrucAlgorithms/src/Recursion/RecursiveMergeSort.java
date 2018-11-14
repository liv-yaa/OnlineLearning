package Recursion;

/** "Divide - and - Conquer" algorithm
 *
 * Two Recursive Phases:
 * 1) Splitting phase
 * 2) Merging phase - when sorting occurs.
 *
 * Features:
 * - "Splitting" does not create any new memory. It is logical, that is, just keep track of indexes
 * - TempArray is the new memory created, and this is destroyed after it is copied back.
 * - Not In Place
 * - O(nlogn)
 * - Stable - If two elems are equal, the element in the left array will be copied into the
 *          temporary array first. *** see merge method, while loop
 *
 * https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java/learn/v4/t/lecture/8435786?start=0
 */

public class RecursiveMergeSort {

    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(array, 0, array.length);

        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Recursive method that takes input array, start index, and end index.
     * Performs repeated recursive "logical" array splitting.
     * */
    public static void mergeSort(int[] input, int start, int end) {

        // Base case - We have a one-element array. Break Recursion:
        if (end - start < 2) {
            return;
        }

        // For two or more elements, partition the left and right arrays by the midpoint:
        int mid = (start + end) / 2;

        // Do a recursive mergeSort on the left partition. When it finally returns, the entire left side will be handled.
        mergeSort(input, start, mid);

        // Do a recursive mergeSort on the right partition:  When it finally returns, the entire right side will be handled.
        mergeSort(input, mid, end);

        // Finally, call our recursive merging method.
        merge(input, start, mid, end);

    }

    /**
     * Helper method that takes input array, start index, mid index, and end index.
     * Performs repeated recursive "logical" array merging.
     * - Array1 goes from start to mid index of input
     * - Array2 goes from mid to end index of inputArray
     * */
    public static void merge(int[] inputArray, int start, int mid, int end) {

        // Base case: if the last element in the left partition is less than or equal to the first elem in
        // the right position, that means all elems in both partitions are sorted.
        // All you need to do is nothing! The array is sorted, so you can copy everything back,
        // keeping the order they are already in.
        // Ex. [7] and [55] pair is in order. Since 7 < 55, merged array is [7, 55].
        // Ex. [-22, 1] and [20, 35] partitions are sorted. So merged array is [-22, 1, 20, 35]...etc.
        // Break Recursion:
        if (inputArray[mid - 1] <= inputArray[mid]) {
            return;
        }

        // Otherwise, merge the two arrays:
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start]; // temporary array created, large enough for both partitions

        // Step through and compare index i, index j, writing the smaller elem into temp:
        while (i < mid && j < end) {
            temp[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];

            // *** Note, the <= is what makes this sort "stable". < would be "unstable" ***
            // Once we have finished traversing EITHER the left OR the right array, drop out of the loop!
        }

        /** Handliing the elements that are "extra" - if one array is longer than the other
         *
         * * If Right side has "extra" - No need to handle:
         * { 32, 34 }, {33, 36}
         * { 32, 33, 34 } // Drop out. 36 stays in the same place...so it's okay.
         * { 32, 33, 34, 36 } . << Copy the temp back into the inputArray: Success!
         *
         * * However, if Left side has "extra" - handle.
         * * If they are in the Left Array, we know they are greater than all elems in temp.
         * * So we need to "jump over"
         * { 32, 36 }, { 33, 34 }
         * { 32, 33, 34 } // Finished traversing, drop out.
         * What about 36?? It needs to be in the 4th position, not the 2nd.
         * What this means: We need to call System.arraycopy:
         */

        // "Jump over" array:
        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid - i);
        // Notice the length: if we have traversed everything, there are no elems left in the Left array,
        // and we will not end up doing a copy because length = 0.
        // Also, this will not affect the right array at all.

        // Finally, copy the temp array to the original array.
        System.arraycopy(temp, 0, inputArray, start, tempIndex);


    }


}
