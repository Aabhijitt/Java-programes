package newbaug23;

import java.util.Scanner;

public class pat7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();

		int row = 1;
		int i = n / 2; // number of space
		int j = 1; // number of star
         int stp = 1;
		while (row <= n) {
			int val = 1;
			int sp = 1;
			while (sp <= i) {
				System.out.print("  ");
				
				sp++;
			}

			int st = 1;
			while (st <= j) {
				System.out.print(val+ "");
				if(sp <= j/2){
					val++;
				}else{
					val--;
				}
				st++;
			}
			
			if (row <= n / 2) {
				i--;
				j += 2;
				stp ++;

			} else {
				i++;
				j -= 2;
				stp --;
			}
			System.out.println();
			row++;
		}

	}

}
