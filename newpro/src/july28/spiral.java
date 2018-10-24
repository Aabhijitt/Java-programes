package july28;

import java.util.Scanner;

public class spiral {

	public static void main(String[] args) {
		int[][] arr = takeinput();
		display(arr);
		wavedisplay(arr);
		spiraldisplay(arr);
	}

	private static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {

				System.out.print(arr[row][col] + " ");
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

	private static void wavedisplay(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.println(arr[row][col]);
				}
			} else {
				for (int row = arr.length - 1; row > 0; row--) {
					System.out.println(arr[row][col]);
				}

			}

			System.out.println();

		}

	}

	private static void spiraldisplay(int[][] arr) {
		int rmin = 0;
		int cmin = 0;
		int rmax = arr.length - 1;
		int cmax = arr[0].length - 1;

		int counter = 1;
		int tne = arr.length * arr[0].length;

		while (counter <= tne) {
			for (int row = rmin; counter <= tne && row <= rmax; row++) {
				System.out.println(arr[row][cmin]);
				counter++;
			}
			cmin++;

			for (int col = cmin; counter <= tne && col <= cmax; col++) {
				System.out.println(arr[rmax][col]);
				counter++;
			}
			rmax--;

			for (int row = rmax; counter <= tne && row >= rmin; row--) {
				System.out.println(arr[row][cmax]);
				counter++;
			}
			cmax--;

			for (int col = cmax; counter <= tne && col >= cmin; col--) {
				System.out.println(arr[rmin][col]);
				counter++;
			}
			rmin++;

		}

	}
}
