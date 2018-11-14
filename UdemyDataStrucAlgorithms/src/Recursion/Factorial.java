package Recursion;

/** From lecture 25
 * Compares different ways of calculating factorial: normal, or recursion.
 * https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java/learn/v4/t/lecture/8435784?start=0
 * */

public class Factorial {

    public static void main(String[] args) {
        int m = 3;

        System.out.println("Nonrecursive result " + iterativeFactorial(m));
        System.out.println("Recursive result " + recursiveFactorial(m));



    }
    /** NONRECURSIVE WAY (Less elegant) */
    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;

        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    /** RECURSIVE WAY (More elegant) */
    public static int recursiveFactorial(int n) {

        // Base case
        if (n <= 1) {
            return 1;

        }

        // Recursive case
        else {
            return n * recursiveFactorial(n - 1);
        }
    }

}
