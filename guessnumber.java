package com.techlabs.assignments;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
public static void main(String[] args) {
		
		Random rd=new Random();
	
		
		Scanner scanner=new Scanner(System.in);
		
		int noofguess=1;
		boolean wanttoplayagain=true;
		
		Scanner sc=new Scanner(System.in);
		while(wanttoplayagain) {
			int number=rd.nextInt(100);
			
			System.out.println("Random number is"+" :"+number);
			
			System.out.println("Guess Number");
			
			int value=sc.nextInt();
			
			while(number!=value) {
				if(noofguess>10) {
					System.out.println("No of guess should not greater than 10");
					break;
				}
				else if(value<number) {
					System.out.println("Too low number");
					noofguess++;
					value=sc.nextInt();
				}
				else {
					System.out.println("Too High number");
					noofguess++;
					value=sc.nextInt();
				}
			}
			if(noofguess<10 && number ==value) {
				System.out.println("You win and number of guess are"+" "+ noofguess);
			}
			System.out.println("Do you want to play again");
			
			wanttoplayagain=scanner.nextBoolean();
		}
		
		

	}
}
