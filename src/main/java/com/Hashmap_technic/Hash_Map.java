package com.Hashmap_technic;


import java.util.HashMap;
import java.util.Scanner;


public class Hash_Map {
	
	
	public static void main(String[]args){

		String name ="preetish";
        long nbr = 8152888585L;      
         
      
        HashMap<String,Integer> grades = new HashMap<String,Integer>();
        
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

        for(;;){
        	 System.out.print ("Enter name: ");

        	 String input = in.nextLine();
        	 
        	  
        	 if (input.contentEquals("preetish"))
        	 	            	 
                System.out.println(name +" mobile no: "+nbr);
        	 
        	             Integer nbr1 = in.nextInt();
        	 
        	             grades.put(input, nbr1);
		                    
		}
        
	
	}

}

