package com.unitest.ticktaktoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CellTest {
	Cell cell;
	
	@BeforeEach
	void init() {
		cell =new Cell();
	}
	
	
	@Test
	void testGetMark() {
		assertEquals(MarkType.empty, cell.getMark());
	}

	@Test
	void testIsEmpty() {
		cell.setMark(MarkType.empty);
		assertTrue(cell.isEmpty());
	}

	@Test
	void testSetMark() {
		cell.setMark(MarkType.o);
		assertEquals(MarkType.o, cell.getMark());
	}

}
