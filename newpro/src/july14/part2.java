package july14;

import java.util.Scanner;

public class part2 {

	public static void main(String[] args) {
		
     Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of rows ");
		int n = scn.nextInt();
		
		int r = 1;
		int val = 1;
		while(r <= n){
			int c = 1;
			while(c <= r){
				System.out.print(val + "\t");
				val++;
				c++;
			}
			
			System.out.println();
			r++;
		}
	}

}
