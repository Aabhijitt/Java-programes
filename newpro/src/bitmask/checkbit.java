package bitmask;

public class checkbit {

	public static void main(String[] args) {
		

		int n = 57 ;
		
		int k = 0;
		
		System.out.println(n + " = " + Integer.toBinaryString(n));
		
		int mask = 1 << k;
		
		if ((n & mask) == mask) {
			System.out.println("on");
			
		}else{
			System.out.println("off");
		}
	}

}
