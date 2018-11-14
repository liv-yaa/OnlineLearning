package SortAlgorithms;

public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    /**
     * Method 1: quickSort, a recursive method:
     * */
    public static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        // Otherwise, the array has more than one element
        // Figure out the index of the pivot, when the array is sorted"

        int pivotIndex = partition(input, start, end);

        // Recursive part:
        quickSort(input, start, pivotIndex); // Left subarray
        quickSort(input, pivotIndex + 1, end); // Right subarray




    }

    /**
     * Method 2: partition, a helper method:
     * Will return the index of the position of the pivot
     *
     * This implementation will use the first element in the array / subarray as the pivot.
     * This will change as recursion occurs.
     * */
    public static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // Decrement j until you find an element that's less than the pivot OR j is greater than or equal to i:
            while (i < j && input[--j] >= pivot); // Empty loop body!!
            if (i < j) {

                // Move the element at j into position i:
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot); // Empty loop body again!!
            if (i < j) {

                input[j] = input[i];
            }

            // At this point, the value of j will be the index where we want to insert the pivot!
            input[j] = pivot;



        }
        return j; // The index. Needed for quicksort ^^

    }
}
