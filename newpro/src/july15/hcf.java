package july15;

import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int rem = n2 % n1;
		while(rem != 0){
			n2 = n1;
			n1 = rem;
			rem = n2 % n1;
		}
		
		System.out.println(n1);
		
		
	}

}
