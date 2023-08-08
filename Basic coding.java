// To Find factorial of a number

package com.techlabs.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the number for factorial");
		
		int number=ob.nextInt();
		
		int fact=1;
		int i=number;
		while(i>1) {
			fact=fact*i;
			i--;
		}
		
		System.out.println("Factorial of the number is"+" "+ fact);
		
	}

}
__________________________________________________________


// To check if given number is a prime number

package com.techlabs.prime;

import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class Primeornot {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		for(int i=1;i<100;i++) {
			if(Primeornot(i)) System.out.println(i);
			else continue;
		}
		
		

	}

	private static boolean Primeornot(int number) {
		// TODO Auto-generated method stub
		if(number<=1) return false;
		
		for(int i=2;i<number;i++) {
			if(number%i==0) return false;
		}
		return true;
	}

}
------------------------------------------------
 // Print first n numbers in fibonacci series

package com.recursion.first;

import java.util.Scanner;

public class FirstNNaturalNumber {
	public static void printnatural(int n,int sum) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
		
		sum+=n;
		printnatural(n-1,sum);
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		printnatural(n,0);
	}

}
