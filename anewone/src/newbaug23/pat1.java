package newbaug23;

import java.util.Scanner;

public class pat1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		int row = 1;
		while(row <= n){
			int col = 1;
			while(col <= row){
				System.out.print("* ");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
