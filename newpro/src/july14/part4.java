package july14;

import java.util.Scanner;

public class part4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the number of rows ");
		int n = scn.nextInt();

		int r = 0;
		while (r < n) {
			int c = 0;
			int val = 1; // nc0 = 1
			while (c <= r) {
				System.out.print(val + " ");
				int nv = val * (r - c) / (c + 1);
				val = nv;
				
				c++;
			}

			System.out.println();
			r++;
		}
	}

}
