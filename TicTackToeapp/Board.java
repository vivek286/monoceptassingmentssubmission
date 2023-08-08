package com.techlabs.chessboardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board {
			MarkType cell[]=new MarkType[10]; 
			
			public Board() {
				for(int i=1;i<10;i++) {
						cell[i]=MarkType.empty;
				}
				try {
					boolean status=true;
					int choice;
					do{
						Scanner scanner=new Scanner(System.in);
						System.out.println("Enter value to play\n"
								+ "1. For location Display\n"
								+ "2. Board Display\n"
								+ "3 Enter mark\n"
								+ "4. Check Empty or not\n"
								+ "5. Exit\n");
						choice=scanner.nextInt();
						switch (choice) {
						case 1:
							displaylocation();
							break;
						case 2:
							displayBoard();
							break;
						case 3:
							setCellMark();
							break;
						case 4:
							isBoardFull();
							break;
						case 5:
							System.exit(0);
							break;
						default:
							System.out.println("Enter proper value");
						}
						scanner.close();
						
					}
					while(status);
				} catch (Exception e) {
					System.out.println("Enter proper value"+e.getStackTrace());
				}
				
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


			public void isBoardFull() {
				for (MarkType markTypes : cell) {
					if(!markTypes.equals(MarkType.empty))
						System.out.println(false);
				}
				System.out.println(true);
			}
			
			public void setCellMark() {
				try {
					System.out.println("Enter Mark Type\n"
							+ "For Cross -> x\n"
							+ "For Circle ->o\n");
					Scanner scanner=new Scanner(System.in);
					System.out.println("Enter Location");
					int loc=scanner.nextInt();
					
					System.out.println("Enter Mark");
					String markType=scanner.next();
					MarkType mark=MarkType.valueOf(markType);
					cell[loc]=mark;
				}
				catch (Exception e) {
					System.out.println("Cell Already Marked" + e.getStackTrace());
				}
			}
			
			public void displayBoard() {
				for(int i=1;i<10;i++) {
					if(i==4 || i==7) System.out.println();
					System.out.print(cell[i]+" -- ");
				}
			}


			@Override
			public String toString() {
				return "Board [cell=" + Arrays.toString(cell) + "]";
			}


			public MarkType[] getCell() {
				return cell;
			}


			public void setCell(MarkType[] cell) {
				this.cell = cell;
			}
			
};
