package JULY21;

import java.util.Scanner;

public class detectcase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a char");
		char ch = scn.nextLine().charAt(0);
		
		if(ch >= 'a' && ch <= 'z'){
			System.out.println("lower");
		} else
			
			if(ch >= 'A' && ch <= 'Z'){
			System.out.println("upper");
		} 
			else {
			System.out.println("special");
		}

	}

}
