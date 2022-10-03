package programming.problems.quicksort;

public class StrippedQuickSort {

    public static void main(String[] args) {

       int[] numbers = {3, 7, 0, 2, 4, 8, 9, 5, 1, 6};
//        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] numbers = {4, 3, 2, 1, 0, 9, 8, 7, 6, 5};
//        int[] numbers = {9, 8, 7, 6, 0, 4, 3, 2, 1, 5};

        print(numbers);

        quicksort(numbers);

        print(numbers);
    }

    public static void quicksort(int[] numbers) {
        quicksort(numbers, 0, numbers.length - 1, 0);
    }

    public static void quicksort(int[] numbers, int leftMostIx, int rightMostIx, int depth) {
        int pivotIx = rightMostIx;
        int newPivotLocation = -1;
        int currLeft = leftMostIx;
        int currRight = rightMostIx - 1;

        // Move currLeft and currRight to meet in the middle. When finding currLeft values
        // greater than pivot and currRight values less than pivot, swap them.
        
        
        // Once currLeft meets currRight in the middle, swap that middle value with pivot
        // if it's greater than pivot.

        printArr(numbers, leftMostIx, rightMostIx, newPivotLocation, depth);

        // sort left

        // sort right
    }

    private static void swap(int[] numbers, int leftIx, int rightIx) {
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
