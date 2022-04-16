package programming.problems.quicksort;


public class StrippedQuickSort {

	public static void main(String[] args) {
		
		int[] numbers = {3, 7, 0, 2, 4, 8, 9, 5, 1, 6};

		quicksort(numbers);
	}
	
	public static void quicksort(int[] numbers) {
		quicksort(numbers, 0, numbers.length - 1, 0);
	}
	
	public static void quicksort(int[] numbers, int leftMostIx, int rightMostIx, int depth) {
		int pivotIx = rightMostIx;
		int currLeft = leftMostIx;
		int currRight = rightMostIx - 1;
		
		//TODO add code here
		
	}
	
	private static void swap(int[] numbers, int leftIx, int rightIx) {
		//TODO add code here
	}
	
}
