package com.techlabs.waterbill;
import java.util.*;
public class WaterBill {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter units you consumed");
		int units=scanner.nextInt();
		
		int meter_charge=75;
		
		int charge=0;
		
		int totatwaterbill=0;
		
		if(units<=100) {	
			charge=units*5;
		}
		else if(units<=250) {
			charge=units*10;
		}
		else {
			charge=units*20;
		}
		
		int totalwaterbill=charge+meter_charge;
		
		System.out.println("total water Bill is:->"+ " "+ totalwaterbill);
		
		

	}

}
