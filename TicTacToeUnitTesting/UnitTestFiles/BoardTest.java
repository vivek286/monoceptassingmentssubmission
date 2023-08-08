package com.unitest.ticktaktoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	
	Board board;
	
	@BeforeEach
	void init() {
		board=new Board();
	}
	
	@Test
	void testGetCells() {
		Cell[] cells=new Cell[10];
		assertEquals(cells, board.getCells());
	}

	@Test
	void testIsBoardFull() {
			Cell[] eCells=board.getCells();
			for(Cell ec:eCells) {
				ec.setMark(MarkType.x);
			}
			assertTrue(board.isBoardFull());
	}

	@Test
	void testSetCellMark() {
		Cell[] eCells=board.getCells();
		eCells[2].setMark(MarkType.x);
		Cell[] nCells=board.getCells();
		
		assertEquals(MarkType.x, nCells[2].getMark());
	}

}
