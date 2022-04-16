package programming.problems.quicksort;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		
//		int[] numbers = {3, 7, 0, 2, 4, 8, 9, 5, 1, 6};
//		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int[] numbers = {4, 3, 2, 1, 0, 9, 8, 7, 6, 5};
//		int[] numbers = {9, 8, 7, 6, 0, 4, 3, 2, 1, 5};

		int[] numbers = createRandomNumbersArray();

		print(numbers);
		
		quicksort(numbers);
		
		print(numbers);
	}
	
	private static int[] createRandomNumbersArray() {
		Random rand = new Random();
		int[] numbers = new int[60];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		return numbers;
	}
	
	public static void quicksort(int[] numbers) {
		quicksort(numbers, 0, numbers.length - 1, 0);
	}
	
	public static void quicksort(int[] numbers, int leftMostIx, int rightMostIx, int depth) {
		int pivotIx = rightMostIx;
		int newPivotLocation = -1;
		int currLeft = leftMostIx;
		int currRight = rightMostIx - 1;
		
		while (currLeft < currRight) {
			
			
			while (currLeft < currRight && numbers[currLeft] <= numbers[pivotIx]) {
				currLeft++;
			}
			
			while (currRight > currLeft && numbers[currRight] >= numbers[pivotIx]) {
				currRight--;
			}
			
			if (currLeft == currRight) {
				break;
			} else {
				swap(numbers, currLeft, currRight);
			}
		}
		
		if (numbers[pivotIx] < numbers[currLeft]) {
			swap(numbers, currLeft, pivotIx);
			newPivotLocation = currLeft;
		} else {
			newPivotLocation = pivotIx;
		}
		
		printArr(numbers, leftMostIx, rightMostIx, newPivotLocation, depth);
		
		// sort left
		if (newPivotLocation > (leftMostIx + 1)) {
			quicksort(numbers, leftMostIx, newPivotLocation -1, depth + 1);
		}
		
		// sort right
		if (newPivotLocation < (rightMostIx - 1)) {
			quicksort(numbers, newPivotLocation + 1, rightMostIx, depth + 1);
		}
	}
	
	private static void swap(int[] numbers, int leftIx, int rightIx) {
		int temp = numbers[leftIx];
		numbers[leftIx] = numbers[rightIx];
		numbers[rightIx] = temp;
	}
	
	public static void print(int[] numbers) {
		printArr(numbers, 0, numbers.length - 1, -1, 0);
	}

	public static void printArr(int[] numbers, int leftIx, int rightIx, int pivotIx, int depth) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = leftIx; i <= rightIx; i++) {
			if (i == leftIx) {
				sb.append("Depth: " + depth + " [ ");
			}
			
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
