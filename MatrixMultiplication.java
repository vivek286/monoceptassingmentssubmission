package com.techlabs.array;

import java.util.Scanner;

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first matrix");
		System.out.println("Enter number of rows");
		int row=scanner.nextInt();
		System.out.println("Enter number of columns");
		int col=scanner.nextInt();
		
		int matrix[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Enter second matrix");
		System.out.println("Enter number of rows");
		int row2=scanner.nextInt();
		System.out.println("Enter number of columns");
		int col2=scanner.nextInt();
		int matrix2[][]=new int[row2][col2];
		int ansm[][]=new int[col][row2];
		if(col!=row2) System.out.println("Enter proper matrix");
		else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					matrix2[i][j]=scanner.nextInt();
				}
			}
			for(int i=0;i<col;i++) {
				for(int j=0;j<row2;j++) {
						ansm[i][j]=0;
				}
			}
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<col;k++) {
						ansm[i][j]+=matrix[i][k]*matrix2[k][j];
					}
				}
			}
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<col2;j++) {
					System.out.print(ansm[i][j]+"\t");
				}
				System.out.println();
			}
			
			
		}
		
		
	}
}
