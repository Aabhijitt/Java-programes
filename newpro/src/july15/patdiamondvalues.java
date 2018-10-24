package july15;

import java.util.Scanner;

public class patdiamondvalues {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = scn.nextInt();

		int tstars = 1;
		int tspaces = n / 2;

		int row = 1;
		int val = 1;
		while (row <= n) {
			for (int i = 1; i <= tspaces; i++) {
				System.out.print(" ");
			}

			val = row <= n / 2 ? row : n + 1 - row;
			for (int i = 1; i <= tstars; i++) {
				System.out.print(val);
				val = i <= tstars / 2 ? val + 1 : val - 1;
			}

			if (row <= n / 2) {
				tstars += 2;
				tspaces--;
			} else {
				tstars -= 2;
				tspaces++;
			}

			System.out.println();
			row++;
		}
	}

}
