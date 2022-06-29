package programming.problems.quicksort;

public class StrippedQuickSort {

    public static void main(String[] args) {

        int[] numbers = { 3, 7, 0, 2, 4, 8, 9, 5, 1, 6 };

        print(numbers);

        quicksort(numbers);

        print(numbers);
    }

    public static void quicksort(int[] numbers) {
        quicksort(numbers, 0, numbers.length - 1, 0);
    }

    /*
     * numbers = {3, 7, 0, 2, 4, 5, 9, 8, 1, 6}; // Initial state
     * numbers = {3, 1, 0, 2, 4, 8, 9, 5, 7, 6}; // After swap 1
     * numbers = {3, 1, 0, 2, 4, 5, 9, 8, 7, 6}; // After swap 2
     * numbers = {3, 1, 0, 2, 4, 5, 6, 8, 7, 9}; // After pivot swap
     */

    public static void quicksort(int[] numbers, int leftMostIx, int rightMostIx, int depth) {
        int pivotIx = rightMostIx;
        int currLeft = leftMostIx;
        int currRight = rightMostIx - 1;

        // TODO add code here

    }

    private static void swap(int[] numbers, int leftIx, int rightIx) {
        // TODO add code here
    }

    public static void print(int[] numbers) {
        printArr(numbers, 0, numbers.length - 1, -1, 0);
    }

    public static void printArr(int[] numbers, int leftIx, int rightIx, int pivotIx, int depth) {
        StringBuffer sb = new StringBuffer();
        sb.append("Depth: " + depth + " [ ");

        for (int i = leftIx; i <= rightIx; i++) {

            if (i == pivotIx) {
                sb.append("**");
            }

            sb.append(numbers[i]);

            if (i == pivotIx) {
                sb.append("** ");
            } else {
                sb.append(" ");
            }
        }

        sb.append("]");

        System.out.println(sb);
    }
}
