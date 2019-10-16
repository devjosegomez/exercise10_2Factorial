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
	
		factorial = Givefactorial(5);
		
		input.close();
	}
	
	
	public static long Givefactorial(int n){
		return 1;
	}

	public static long Givefactorial(double n){
		return 1;
	}
}
