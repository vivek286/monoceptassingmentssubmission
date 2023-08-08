package com.techlabs.assignments;

import java.util.Scanner;


public class RideBillCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Height");
		
		int tbil=0;
		int height=sc.nextInt();
		
		if(height>120) {
			System.out.println("Enter your age");
			int age=sc.nextInt();
			
			if(age<12) {
				tbil+=5;
				
				System.out.println("Do you want photos, For Yes Enter True or For no enter False");
				
				boolean flag=sc.nextBoolean();
				
				if(flag) System.out.println(" The total bill is"+" $"+tbil+3);
				else System.out.println(" The total bill is"+" $"+tbil);
				
			}
			else if(age>=12 && age<18) {
				tbil+=7;
				
				System.out.println("Do you want photos, For Yes Enter True or For no enter False");
				
				boolean flag=sc.nextBoolean();
				
				if(flag) System.out.println(" The total bill is"+" $"+tbil+3);
				else System.out.println(" The total bill is"+" $"+tbil);
			}
			else if(age>=45 && age<=55) {
				System.out.println("Do you want photos, For Yes Enter True or For no enter False");
				
				boolean flag=sc.nextBoolean();
				
				if(flag) System.out.println(" The total bill is"+" $"+tbil+3);
				else System.out.println(" The total bill is"+" $"+tbil);
			}
			else {
				tbil+=12;
				
				System.out.println("Do you want photos, For Yes Enter True or For no enter False");
				
				boolean flag=sc.nextBoolean();
				
				if(flag) System.out.println(" The total bill is"+" $"+tbil+3);
				else System.out.println(" The total bill is"+" $"+tbil);
			}
		}
		else {
			System.out.println("can't ride");
		}
		

	}

}
