package sept6;

import java.util.Scanner;

public class waved {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 }
				// int [][] arr = {
				// {1,2,3},
				// {4,5,6},
				// {7,8,9},
				// {5,9,3},
				// {1,3,8}
				// };
		};
		display(arr);
		// wavedisplay(arr);
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

	public static void wavedisplay(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.println(arr[row][col]);
				}
			} else {
				for (int row = 0; row < arr.length; row++) {
					System.out.println(arr[row][col]);
				}

			}

			System.out.println();

		}

	}

	public static void spiraldisplay(int[][] arr) {
		int rmin = 0;
		int cmin = 0;
		int rmax = arr.length - 1;
		int cmax = arr[0].length - 1;

		int counter = 1;
		int tne = arr.length * arr[0].length; // total number of elements

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
