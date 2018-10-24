package bitmask;

public class offthebit {

	public static void main(String[] args) {
         int n = 57 ; 
		
		int k = 2;
		
		System.out.println(n + " = " + Integer.toBinaryString(n));
		
		int mask = -(1 << k);
		
         n = n & mask ;
		
		System.out.println(n + " = " + Integer.toBinaryString(n));

		if ((n & mask) == mask) {
			System.out.println("on");
			
		}else{
			System.out.println("off");
	}

	}
}
