package com.unitest.ticktaktoe;
public class Board {
			private Cell[] cells=new Cell[10];
			
			public Board() {
				super();
				for(int i=1;i<cells.length;i++) {
						cells[i]=new Cell();
				}
			}
			public Cell[] getCells() {
				return cells;
			}
			
			private void displaylocation() {
				try {
					System.out.println("Enter the location according to board \n"
							+ "1 -- 2 -- 3\n"
							+ "4 --  5 -- 6\n"
							+ "7 -- 8-- 9-- \n");
				} catch (Exception e) {
					System.out.println("Board has not location");
				}
				
			}


			public boolean isBoardFull() {
				for(Cell cell:cells) {
					if(cell.getMark()==MarkType.empty) {
						return false;
					}
				}
				return true;
			}
			
			public void setCellMark(int loc,MarkType mark) throws Exception {
				if(loc<1 || loc>9) {
					throw new Exception("Invalid location");
				}
				cells[loc].setMark(mark);
			}
			
			
			
			public void displayBoard() {
				for(int i=1;i<=3;i++) {
					System.out.print(cells[i].getMark());
				}
				System.out.println();
				for(int i=4;i<=6;i++) {
					System.out.print(cells[i].getMark());
				}
				System.out.println();
				for(int i=7;i<=9;i++) {
					System.out.print(cells[i].getMark());
				}
				
				
			}
			
};
