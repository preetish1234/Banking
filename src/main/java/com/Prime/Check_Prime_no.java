package com.Prime;

import java.util.Scanner;

public class Check_Prime_no {

	public static void main(String[] args) {
		Boolean prime = true;
		
	System.out.println("Enter nbr to check prime or not");
	
	@SuppressWarnings("resource")
	Scanner scn = new Scanner(System.in);
	Integer num = scn.nextInt();
	
	for(int i=2;i<num;i++){
		
		if (num%2==0){
			prime = false;
			

		}
		
	}
	if (prime==true){
		
		System.out.println("Given nbr is a prime nbr");
	}else{
		System.out.println("Given nbnr is not a prime nbr");
	}

	}

}
