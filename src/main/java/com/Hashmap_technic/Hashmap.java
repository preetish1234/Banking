package com.Hashmap_technic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) {
		boolean loopAgain = true;  
		Scanner in = new Scanner(System.in);
    
      
   Map<String,String> hmap = new HashMap<String,String>();
        
hmap.put("preetish", "8152888585");
hmap.put("preetish", "9431543369");
hmap.put("jaleshwar", "7079377847");
hmap.put("preeti", "8152888585");
System.out.println(hmap);

do {
	//System.out.println(hmap);
	System.out.println("Enter name :-");
	String input = in.nextLine();
	
	if("preetish".equals(input)){
	System.out.println("Moblie no-"+hmap.get(input));
	
	}
	
	System.out.println("Enter name :-");
	String input2 = in.nextLine();
	
	if ("jaleshwar".equals(input2));
System.out.println("Moblie no-"+hmap.get(input2));
	


System.out.println("Enter name :-");
String input1 = in.nextLine();

if ("preeti".equals(input1));
System.out.println("Moblie no-"+hmap.get(input1));



} 


while (loopAgain);
in.close();
  }


}
