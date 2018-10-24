package bitmask;

public class toglethebit {

	public static void main(String[] args) {
		
		int n = 57 ; 
		
		int k = 3;
		
		System.out.println(n + " = " + Integer.toBinaryString(n));
		
		int mask = 1 << k;
		
         n = n ^ mask ;
		
		System.out.println(n + " = " + Integer.toBinaryString(n));

		

	}

}

