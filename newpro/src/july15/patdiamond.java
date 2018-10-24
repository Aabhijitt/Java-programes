package july15;

import java.util.Scanner;

public class patdiamond {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = scn.nextInt();

		int tstars = 1;
		int tspaces = n / 2;

		int r = 1;
		while (r <= n) {
			for (int i = 1; i <= tspaces; i++) {
				System.out.print(" ");
			}

			for (int i = 1; i <= tstars; i++) {
				System.out.print("*");
			}

			if (r <= n / 2) {
				tstars += 2;
				tspaces--;
			} else {
				tstars -= 2;
				tspaces++;
			}

			System.out.println();
			r++;
		}

	}

}
