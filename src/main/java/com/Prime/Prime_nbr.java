package com.Prime;

public class Prime_nbr {


	public static void main(String[] args) {
		int num = 2;
		Boolean prime = true;
		
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				
			prime=false;
			break;
			}
			
		}
	if(prime){
		System.out.println(num+" is a prime nbr");
	}
	else{
		System.out.println(num+" is not a prime nbr");
	}
	}
}
