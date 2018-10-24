package ne;

import java.util.Scanner;

public class printcount {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int count = 1;
		
		while (count <= n) {
			System.out.println(count);
			count++;
		}
	}

}
