package UtilityClasses.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsAndArrays {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("data1");
		al.add("data2");
		al.add("data3");
		al.add("data4");

		// How to make above array list object secure from multiple threads

		// option one convert array list into vector
		// 1 ]
		Vector<String> v = new Vector<>(al);

		// best option
		// 2] use utility class static factory method

		List<String> list = Collections.synchronizedList(al);

		// -----------------------------------------------------------------

		// Arrays example

		int[] data = { 10, 1, 4, 7, 2, 11, 100, 34, 67 };
		for (int i : data) {
			System.out.print(i + " ");
		}

		Arrays.sort(data);
        System.out.println();
		for (int i : data) {
			System.out.print(i + " ");
		}

	}
}
