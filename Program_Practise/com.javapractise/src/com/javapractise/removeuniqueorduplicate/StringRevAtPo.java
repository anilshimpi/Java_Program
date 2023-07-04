package com.javapractise.removeuniqueorduplicate;

import java.util.Scanner;

public class StringRevAtPo {
	
	public static void main(String[] args) {
		
		//Scanner s = new Scanner(System.in);
		//int n = s.nextInt();

		String str = "My name is Anil Shimpi";

		//String words[] = str.split(" ");
		//String rev = words[n];
		String reversedString = "";

		for (int j = str.length() - 1; j >= 0; j--) {

			reversedString = reversedString + str.charAt(j);
		}

		str= reversedString;
		System.out.println(str+ "  ");
		/*
		 * for (String s1 : words) {
		 * 
		 * //System.out.print(s1 + " "); }
		 */

	}
}
