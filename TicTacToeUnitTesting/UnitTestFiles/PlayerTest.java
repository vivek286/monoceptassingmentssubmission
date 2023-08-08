package com.unitest.ticktaktoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	
	Board board;
	Player player;
	
	@BeforeEach
	void init() {
		board =new Board();
		player=new Player();
	}
	
	@Test
	void testPlayer() {
		assertEquals(board,player );
	}

}
