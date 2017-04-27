package com.List_set;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_String {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Write a program to find the String value is present or not
		
		
		String obj[] ={"preetish","neetish","kajol","jaleshwar"};
		
		List<String> find = new ArrayList<String>();
		
		 {
		      for(int i = 0; i<=3; i++){
		    	  
		    	  find.add(obj[i]);
		      }
		        

		
	System.out.println("Variables are: "+find);	
	  Scanner in = new Scanner(System.in);
		
	  System.out.println("Enter name :-");
	  String name =(in.nextLine());
	  
	    if(find.contains(name))
		      
		  {
		  System.out.println("Name is present-->> "+ name +":-> "+ find.contains(name));
		  }
		   
	        else
		  
	      System.out.println(name +" is not present:--> " + find.contains(name));
		    	
		
		 }
	    
	}

}
	