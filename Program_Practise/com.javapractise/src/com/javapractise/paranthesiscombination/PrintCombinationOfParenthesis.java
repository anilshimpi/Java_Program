package com.javapractise.paranthesiscombination;

public class PrintCombinationOfParenthesis {
	
	// Function that print all combinations of
    // balanced parentheses
    // open store the count of opening parenthesis
    // close store the count of closing parenthesis
	
	static void printParanthesis(char str[],int pos,int n,int open,int close) {
		
		if(close==n) {
			
			for(int i=0; i<str.length;i++) 
				System.out.print(str[i]);
				System.out.print(",");
				return;
		}
			
			else {
				if(open>close) {
					str[pos]='}';
					printParanthesis(str, pos+1, n, open, close+1);
				}
				
				if(open<n) {
					str[pos]='{';
					printParanthesis(str, pos+1, n, open+1, close);
				}
			}	
	}
	
	// Wrapper over _printParenthesis()
	
	static void printBracket(char str[],int n) {
		
		if(n>0)
			printParanthesis(str, 0, n, 0, 0);
		return;
	}

	public static void main(String[] args) {
		
		int n=3;
		char[] str=new char[2*n];
		printBracket(str, n);

	}

}
