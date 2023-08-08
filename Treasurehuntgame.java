package com.techlabs.waterbill;

import java.util.Scanner;

public class TreasureIsland {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Treasure Island "
				+ " Your mission is to find the treasure");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("left or Right?");
		
		String ans=scanner.nextLine();
		
		if(ans.equals("left")) {
			 
			System.out.println("Swim or wait");
			
			String ans2= scanner.nextLine();
			
			if(ans2.equals("wait")) {
				System.out.println("Which door Red, Blue or Yellow?");
				
				String ans3=scanner.nextLine();
				
				if(ans.equals("Red")) {
					System.out.println("Burn by fire game over");
				}
				else if(ans3.equals("Blue")) {
					System.out.println("Eater by beasts game over");
				}
				else if(ans3.equals("Yellow")) {
					System.out.println("Your Win!!");
				}
				else {
					System.out.println("Game Over");
				}
				
			}
			else {
				System.out.println("Attack by trout game over");
			}
			
		}
		else {
			System.out.println("Fall into a hole game over");
		}
		
	}
	

}
