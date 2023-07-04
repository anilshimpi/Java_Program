package com.javapractise.reveresestringatposition;

import java.util.Scanner;

public class StringReverseAtPosition {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no=	sc.nextInt();
		
		String str="This is my laptop";
		String[] words=str.split(" ");
		String rev=words[no];
		String reverseString="";
		
		for(int i=rev.length()-1;i>=0;i--) {
			
			reverseString+=rev.charAt(i);
		}
		
		words[no]=reverseString;
		
		for(String s:words) {
			System.out.print(s+ " ");
		}
		

	}

}
