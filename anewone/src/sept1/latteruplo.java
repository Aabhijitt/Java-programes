package sept1;

import java.util.Scanner;

public class latteruplo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a char");
		char ch = scn.nextLine().charAt(0);
         char nch = ' ';
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower");
			nch = (char)(ch-'a'+'A');
			

		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("upper");
			nch = (char)(ch-'A'+'a');
		} else {
			System.out.println("invalid");
		}
		System.out.println(nch);
	}

}
