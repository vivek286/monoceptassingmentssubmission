package WordGuessGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.activation.MailcapCommandMap;

public class TestWordguess {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int playagain=0;
		WordGuess wordguess=new WordGuess();
		do {
			getRandomWord(wordguess.getWords(),scanner);
			
			System.out.println("want to play again for yes enter (1) and for no enter (0)");
			playagain=scanner.nextInt();
		}
		while(playagain==1);	
		
		System.out.println("Thanks for playing ");
	}	
		
	public static void getRandomWord(String arr[],Scanner scanner) {
		Random random=new Random();
		int randomindex=random.nextInt(7);
		String word=arr[randomindex];
		int wordLength=word.length();
		
		StringBuilder guessword=new StringBuilder(wordLength);
		for(int i=0;i<wordLength;i++) 
			guessword.append("_");
		
		Map<Character, ArrayList<Integer>> map=getIndexes(word);
		
		if(playGame(scanner,word,map,guessword)) {
			System.out.println("you wont the game");
			return;
		}
		System.out.println("all life used you lose the game");
		
	}
	
	 private static boolean playGame(Scanner scanner, String word, Map<Character, ArrayList<Integer>> map, StringBuilder guessWord) {
		  int wordLength = word.length(), life = wordLength, correctGuess = 0;
		  String userGuess="";
		  
		  System.out.println("System Guess:- " + word);
		  while(correctGuess < wordLength && life != 0) {
		   System.out.println("Guess a alphabet from a to z");
		   userGuess = scanner.next();
		   Character character = userGuess.charAt(0);
		   if(validate(character, map, guessWord) == false) {
		    life--;
		   }else {
		    correctGuess++;
		   }
		   System.out.println("Current word:- " + guessWord);
		   System.out.println("Life left:- " + life);
		  }
		  if(correctGuess == wordLength) 
		   return true;
		  return false;
		 }
	 	
	 private static boolean validate(Character character, Map<Character, ArrayList<Integer>> map, StringBuilder guessWord) {
		   ArrayList<Integer> targetList = map.get(character);
		         if (targetList == null || targetList.isEmpty()) {
		         System.out.println("Incorrect Guess! Try again.");
		            return false;
		         }
		         int index = targetList.get(0);
		         guessWord.setCharAt(index, character);
		         targetList.remove(0);
		   return true;
		 }
	 
	 private static Map<Character, ArrayList<Integer>> getIndexes(String word){
		  Map<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
		  int wordLength = word.length();
		  for(int i=0; i<wordLength; ++i) {
		   map.putIfAbsent(word.charAt(i), new ArrayList<>());
		   map.get(word.charAt(i)).add(i);
		  }
		  return map;
		 }
	 
	 
	 
	 
}
