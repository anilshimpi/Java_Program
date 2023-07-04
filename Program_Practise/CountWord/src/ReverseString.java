import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		String str="prathamesh patil";
		
		String words[]=str.split(" ");
		String rev=words[n];
		 String reversedString="";
	      
		
		for (int i = 0; i < rev.length(); i++) 
	    {
	      String reverseWord = "";
	     
	      for (int j = rev.length() - 1; j >= 0; j--) {
	    	  
	        reverseWord = reverseWord + rev.charAt(j);
	      }
	      reversedString = reversedString + reverseWord + " ";
	    }
	 
	    // Displaying the string after reverse
	    System.out.print("Reversed string : " + reversedString);
		
		
	}
}
