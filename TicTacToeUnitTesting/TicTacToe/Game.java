package com.unitest.ticktaktoe;

import com.unitest.ticktaktoe.Player;

public class Game {
	public Game() {
		Board board=new Board();
		Player player1=new Player(board);
		Player player2=new Player(board);
	}
	
	
	public void gameStart() {
		
	}
	
	public boolean isgamewin() {
		
	}
	
	public boolean isgamedraw() {
		return true;
	}
	
	public boolean isGameInProgress() {
		
	}
	

	
	
}
