package com.test;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray_Asending {

	public static void main(String[] args) {
		
		Integer[] array = {6,5,1,7,9,4,87};
		
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Sorting The Array In descending order: "+ Arrays.toString(array));
	}
}
