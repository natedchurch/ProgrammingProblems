package programming.problems.insertionsort;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		
//		int[] numbers = {3, 7, 0, 2, 4, 8, 9, 5, 1, 6};
//		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int[] numbers = {4, 3, 2, 1, 0, 9, 8, 7, 6, 5};
//		int[] numbers = {9, 8, 7, 6, 0, 4, 3, 2, 1, 5};

		int[] numbers = createRandomNumbersArray();

		printArr(numbers);
		
		sort(numbers);
		
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
	
	public static void sort(int[] numbers) {
		
		for (int i = 1; i < numbers.length; i++) {
			int currNum = numbers[i];
			
			int j = i - 1;
			while(j >= 0 && numbers[j] > currNum) {
				numbers[j + 1] = numbers[j];
				j--;
			}
			
			if (j < 0) {
				//ASSERT: currNum is smallest so far, so place at beginning of array
				numbers[0] = currNum;
			} else {
				//ASSERT: currNum is greater than or equal to numbers[j], so place after j
				numbers[j + 1] = currNum;
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
