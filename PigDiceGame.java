package com.techlab.game;
import java.util.Random;import java.util.Scanner;
public class PigDiceGameApplication {
 public static void main(String[] args) {
  Random random=new Random();  Scanner sc= new Scanner(System.in);
    
    int total=0,tScore=0,i=1;
  System.out.println("TURN "+i);  while(total<=20) {
   System.out.println("Roll or Hold? (r/h):");   char option=sc.next().charAt(0);
  if(option=='r') {   int randomNumber=random.nextInt(6)+1;
   System.out.println("Die:"+randomNumber);   tScore=tScore+randomNumber;
   if(randomNumber==1)   {
    tScore=0;    System.out.println("");
    System.out.println("Turn over. No score.");    System.out.println("");
    System.out.println("");    i++;
    System.out.println("TURN "+i);
   }   
      }  else {
   total=total+tScore;   System.out.println("score for turn:"+tScore);
   System.out.println("total score"+total);   if(total>=20) {
    System.out.println("");    System.out.println("you finished in "+i+" turns");
    break;   }
   tScore=0;  
   System.out.println("");
   System.out.println("");   i++;
   System.out.println("TURN "+i);  }
    }
  
 }
}
