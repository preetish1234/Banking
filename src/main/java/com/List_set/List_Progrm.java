package com.List_set;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class List_Progrm {

	public static void main(String[] args) {
		
	int count[]= {1,2,4,3,5,6,8,7,9,9};
		
		List<Integer> obj = new ArrayList<Integer>();
		 {
		      for(int i = 0; i <= 9; i++){
		         obj.add(count[i]);
		         
		         
		         }
		   System.out.println(obj);
		     @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
		     
		     
		     System.out.println("Enter nbr :-");
		 	int input2 =  Integer.parseInt(in.nextLine());
		  if(obj.contains(input2))
		      
		  {
		  System.out.println("Hurry element is present-->> "+input2+" "+obj.contains(input2));
		  }
		  else
		  System.out.println("Sorry Element is not present"); 
		   
		    
		 }
	  }
	 }