package WeekFourAssignments;

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		fillRandom(matrix);
//		printMaxMatrix(matrix);
//		sumColumn(matrix);
		
		ticTacToe();
	}
	
	static void printMaxMatrix(int[][] m) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				max = Math.max(m[i][j], max);
			}
		}
		System.out.printf("The max number is: %d" , max);
	}
	static void fillRandom(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)(Math.random()*21);
				// 0 - 20 in all cells in the matrix
			}
		} 
	}
	static void sumColumn(int[][] m) {
		Scanner in = new Scanner(System.in);
		int sum =0;
		System.out.println("\nEnter the column you'd like to sum: ");
		int col = in.nextInt();
		for(int i = 0; i < m.length; i++) {
			sum+= m[i][col-1];
			System.out.print(m[i][col-1] + " ");
		}
		System.out.printf("The sum of column %d is %d", col, sum);
	}
	
	static void ticTacToe() {
		Scanner in = new Scanner(System.in);
		int row, col, turns = 0;
		char[][] board = { {' ', ' ', ' ' }, {' ', ' ', ' ' }, {' ', ' ', ' ' } };
		boolean gameEnd = false;
		System.out.print("\nTic-Tac-Toe prototype: 3 by 3 board");
		while(turns < 9) {
			System.out.print("\nEnter the row you'd like to mark: ");
			row = in.nextInt();
			System.out.print("Enter the column you'd like to mark: ");
			col = in.nextInt();
			if (board[row-1][col-1] == ' ') {
				if (turns % 2 == 0) board[row-1][col-1] = 'X';
				else board[row-1][col-1] = 'Y';
			}
			else {
				System.out.print("That was already filled in. Try again!");
				continue;
			}
			turns++;
			printBoard(board);
		}
		System.out.println("Thanks for testing!");
	}
	
	static void printBoard(char[][] m) {
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+ " ");
				// 0 - 20 in all cells in the matrix
			}
			System.out.println();
		} 
	}
}
