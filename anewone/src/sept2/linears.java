package sept2;

import java.util.Scanner;

public class linears {

	public static void main(String[] args) {
		int[] arr = { 10, 50, 100, 20, 99, 33, 66 };

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] ==n ) {
				System.out.println(i);
				return;
			}
				
		
		
		}
		System.out.println(-1);
	}
	

}
