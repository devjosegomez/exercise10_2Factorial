package com.exercise10_2Factorial.app;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long factorial = 1;
		int number = -1;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number to calculate factorial: ");
			number=input.nextInt();
			if(number<=0) {
				System.out.println("You must enter a positive value");
			}
			
		}while(number<=0);
	
		factorial = Givefactorial(number);
		System.out.println("The factorial of " + number + " is: " + factorial);
		
		input.close();
	}
	
	
	public static long Givefactorial(int n){
		int factorial=1;
		for(int i=1; i<=n; n++) {
			factorial*=i;
		}
		return factorial;
	}
}
