package com.List_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_String_Sort {

			public static void main(String[] args) {
				String count[] = {"preetish", "vicky", "pinky", "rahul", "bitu"};
			      Set<String> set = new HashSet<String>();
			      try {
			         for(int i = 0; i < 5; i++) {
			            set.add(count[i]);
			         }
			         System.out.println(set);

			         TreeSet<String> sortedSet = new TreeSet<String>(set);
			         System.out.println("The sorted list is: "+sortedSet);
			         

			         System.out.println("The First element of the set is: "+ (String)sortedSet.first());
			         System.out.println("The last element of the set is: "+ (String)sortedSet.last());
			      }
			      catch(Exception e) {}
			   
			

		

	}

}
