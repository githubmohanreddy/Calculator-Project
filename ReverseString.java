package com.test;

public class ReverseString {

	public static void main(String[] args) {

		String s = "This is a sunny day";
		String[] arr=s.split(" ");
		String[] arr1=s.split(" ");
		String z="";
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr1[i].length();j++) {
				char c=arr[i].charAt(j);
				z=c+z;
			}
			arr1[i]=z;
			z="";
		}
		for(int i=0;i<arr1.length;i++) {
			if(i!=arr1.length-1) {
				System.out.print(arr1[i]+" ");
			}
			else {
				System.out.print(arr1[i]);
			}
		}
	}
}

