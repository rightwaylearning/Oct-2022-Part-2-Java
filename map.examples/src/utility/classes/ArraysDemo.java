package utility.classes;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] arr= {10,3,6,12,8,5};

		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("=============================");
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		
		
	}
}
