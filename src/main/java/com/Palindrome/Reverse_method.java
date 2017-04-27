package com.Palindrome;

import java.util.Scanner;

public class Reverse_method {


		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
		
			 
		      String original, reverse = "";
		      Scanner in = new Scanner(System.in);
		 
		      System.out.println("Enter a string to reverse");
		      original = in.nextLine();
		 
		      int length = original.length();
		 
		      for ( int i = length - 1 ; i >= 0 ; i-- )
		         reverse = reverse + original.charAt(i);
		      
		         if (original.equals(reverse))
		      
		      System.out.println(reverse+" is Palindrome ");
		      else
		      System.out.println(reverse+" Not a palindrome");
			
		  }
		
		
	}


