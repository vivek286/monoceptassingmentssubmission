package com.unitest.ticktaktoe;

import com.unitest.ticktaktoe.MarkType;

public class Cell {
	private MarkType mark;

	public Cell() {
		super();
		this.mark = MarkType.empty;
	}

	public MarkType getMark() {
		return mark;
	}
	
	public boolean isEmpty() {
		if(mark.equals(MarkType.empty)) {
			return true;
		}
		return false;
	}
	
	public void setMark(MarkType mark) {
		if(!isEmpty()) {
			throw new NullPointerException("Cell already marked");
		}
		this.mark = mark;
	}
	
	
}
