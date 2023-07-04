package com.javapractise.countword;

public class RemovePatterLett {

	public static void main(String[] args) {

		String str = "abc#ab#";
		// expected output aba
		String[] splitString = str.split("#");
		
		for (int i = 0; i < splitString.length; i++) {
			
			for (int j = 0; j < splitString[i].length() - 1; j++) {
				
				System.out.print(splitString[i].charAt(j));
			}

		}

	}

}
