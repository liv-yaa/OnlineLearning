package Recursion;

/** "Divide - and - Conquer" algorithm
 * Usually written recursively.
 * Two phases:
 * 1) Splitting phase = logical
 * 2) Merging phase - when sorting occurs
 *
 * Features:
 * - Not In Place
 * - O(nlogn)
 * - Stable - If they are equal, the element in the left array will be copied into the temporary array first. ******
 *
 * https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java/learn/v4/t/lecture/8435786?start=0
 */

public class RecursiveMergeSort {

    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };



        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /** Recursive method that takes input array, start index, and end index. */
    public static void mergeSort(int[] input, int start, int end) {

        // Base case - a one element array is sorted.
        if (end - start < 2) {
            return; // This will "break" the recursion.

        }

        // For two or more elements, partition the left and right arrays:
        // All you need to do is find the start and end indices (logical partitioning)

        int mid = (start + end) / 2;

        // Do a recursive mergeSort on the left partition. When it finally returns, the entire left side will be handled.
        mergeSort(input, start, mid);

        // Do a recursive mergeSort on the right partition:  When it finally returns, the entire right side will be handled.
        mergeSort(input, mid, end);

        // Call our merging method.
        merge(input, start, mid, end);


    }

    public static void merge(int[] input, int start, int mid, int end) {

        // Base case: if the last element in the left partition is less than or equal to the first elem in
        // the right position, that means all elms in the left partition are sorted
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start]; // large enough for both partitions

        // Step through and compare, writing the smaller into temp:
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        }



        // Else, merge two arrays: asfsa
        merge(input, start, mid, end);





    }


}
