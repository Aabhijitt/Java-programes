package july28;

import java.util.Scanner;

public abstract class twod {

	public static void main(String[] args) {
		int[][] arr = takeinput();
		display(arr);

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] takeinput() {
		int[][] arr;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = scn.nextInt();
		System.out.println("Enter the number of columns");
		int cols = scn.nextInt();

		arr = new int[rows][cols];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println("Enter value for cell[" + i + ", " + j + "]");
				arr[i][j] = scn.nextInt();

			}
		}
		return arr;

	}

}