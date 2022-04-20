package programming.problems.mergesort;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		
//		int[] numbers = {3, 7, 0, 2, 4, 8, 9, 5, 1, 6};
//		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int[] numbers = {4, 3, 2, 1, 0, 9, 8, 7, 6, 5};
//		int[] numbers = {9, 8, 7, 6, 0, 4, 3, 2, 1, 5};

		int[] numbers = createRandomNumbersArray();
		
		printArr(numbers);
		
		sort(numbers, 0);
		
		printArr(numbers);
	}
	
	private static int[] createRandomNumbersArray() {
		Random rand = new Random();
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		return numbers;
	}
	
	public static void sort(int[] numbers, int depth) {
		
		if (numbers.length == 1) {
			return;
		}
		
		int midpoint = numbers.length / 2;
		
		int[] leftNumbers = new int[midpoint];
		
		int lengthRight = numbers.length - midpoint;
		int[] rightNumbers = new int[lengthRight];
		
		//Populate left
		for (int i = 0; i < midpoint; i++) {
			leftNumbers[i] = numbers[i];
		}
		
		//Populate right
		for (int i = 0; i < lengthRight; i++) {
			rightNumbers[i] = numbers[midpoint + i];
		}
		
		//Split and sort each side
		sort(leftNumbers, depth++);
		sort(rightNumbers, depth++);
		
		//Merge sorted sides into target
		/*
		 * l = 0
		 * r = 0
		 * 
		 * 2 4		1 3 5
		 * 1 2 3 4 5
		 */
		
		int leftSize = leftNumbers.length;
		int rightSize = rightNumbers.length;
		int l = 0;
		int r = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (l < leftSize && r < rightSize) {
				if (leftNumbers[l] <= rightNumbers[r]) {
					numbers[i] = leftNumbers[l];
					l++;
				} else {
					numbers[i] = rightNumbers[r];
					r++;
				}
			} else if (l < leftSize){
				numbers[i] = leftNumbers[l];
				l++;
			} else if (r < rightSize) {
				numbers[i] = rightNumbers[r];
				r++;
			} else {
				//ASSERT: neither available
				System.out.println("Error - neither left or right has any numbers left and target is not full.");
			}
		}
	}
	
	public static void printArr(int[] numbers) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		for (int i = 0; i < numbers.length; i++) {
			
			sb.append(" " + numbers[i]);
			
		}
		
		sb.append(" ]");
		
		System.out.println(sb);
	}
}
