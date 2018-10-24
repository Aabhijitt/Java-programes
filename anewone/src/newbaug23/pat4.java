package newbaug23;

import java.util.Scanner;

public class pat4 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();

		int row = 0;
		while (row < n) {
			int col = 0;
			int val = 1;
			while (col <= row) {
				System.out.print(val + " ");
				int k = val * (row - col) / (col + 1);
				val = k;
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
