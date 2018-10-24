package ne;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();

		int count = 2;
		while (count * count <= n) {
			if (n % count == 0) {
				System.out.println("number is not prime");
				return;
			}

			count++;
		}
		System.out.println("prime");
	}
}
