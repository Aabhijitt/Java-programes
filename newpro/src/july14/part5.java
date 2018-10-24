package july14;

import java.util.Scanner;

public class part5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the number of rows ");
		int n = scn.nextInt();

		int r = 1;
		while (r <= n) {
			int c = 1;
			while (c <= n) {
				if(r == c || r + c == n + 1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				c++;
			}

			System.out.println();
			r++;
		}
	}

}
