package com.test;

public class Pangram {

	public static void main(String[] args) {

		String s = "The Quick Fox Jumps Over A Lazy Dog";
		System.out.print((ispangram(s.toLowerCase())));

	}

	private static boolean ispangram(String s) {

		if(s.length()<=26) {
			return false;
		}
		else {
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch) < 0) {
					System.out.println("Not-Paragram");
					return false;
				}
			}
		}
		System.out.println("Pangram");
		return true;
	}
}
