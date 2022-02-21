package mod8.pt1.ex1;

import java.util.Arrays;
import java.util.Scanner;

//array intro

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] myIntegers = getIntegers(5);
		int[] sorted = sortArray(myIntegers);
		printArray(sorted);		
		
	}
	
	public static int[] getIntegers(int num) {
		int[] array = new int[num];
		System.out.println("enter "+num+" numbers:\r");
		for(int i=0; i<num; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("element "+i+" = "+array[i]);
		}
	}
	
	public static int[] sortArray(int[] array) {
		/*//copying array
		int[] sortedArray = new int[array.length];
		for(int i=0; i<array.length; i++) {
			sortedArray[i] = array[i];
		}*/
		
		//shortcut copy
		int[] sortedArray = Arrays.copyOf(array, array.length);
				
		boolean flag = true;
		int temp;
		//sorting array
		while(flag) {
			flag = false;
			for(int i=0; i<sortedArray.length-1; i++) {
				if(sortedArray[i]<sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}

}
