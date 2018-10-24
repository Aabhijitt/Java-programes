package newbaug23;

import java.util.Scanner;

public class pat2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();

		int row = 1;
		int val = 1;

		while (row <= n) {
			int col = 1;
			while (col <= row) {
				System.out.print(val + " ");
				val++;
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
