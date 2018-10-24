package july14;

import java.util.Scanner;

public class part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of rows ");
		int n = scn.nextInt();
		
		int a = 0;
		int b = 1;
		int s = 0;
		
		int r = 1;
		while(r <= n){
			int c = 1;
			while(c <= r){
				System.out.print(a + "\t");
				
				s = a + b;
				a = b;
				b = s;
					
				c++;
			}
			
			System.out.println();
			r++;
	}

}
}
