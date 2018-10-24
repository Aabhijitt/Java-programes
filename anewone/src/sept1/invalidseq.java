package sept1;

import java.util.Scanner;

public class invalidseq {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		System.out.println("enter firstnumber");
		int fn = scn.nextInt();
		System.out.println("enter secondnumber");
		int sc = scn.nextInt();
		boolean down = false;
		if (sc < fn) {
			down = true;
		} else {
			down = false;
		}
		for (int i = 3; i <= n; i++) {
			fn = sc;
			System.out.println("enter the " + i + "th number");
			sc = scn.nextInt();
			if (down == true) {
				//System.out.println(sc + "  " + fn);
				if (sc > fn) {
					down = false;

				}
			} else {/// going up, next should be greater sc > fn
				if (sc < fn) {
					System.out.println("invalid");
					return;
				}
			}

		}
		System.out.println("valid");
	}
}
