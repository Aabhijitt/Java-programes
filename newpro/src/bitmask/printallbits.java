package bitmask;

public class printallbits {

	public static void main(String[] args) {
		
		int n = -200;
		int k = 0;
		System.out.println(n + " = " + Integer.toBinaryString(n));
		
		for (int j = 0;j <= n;j++);
		 
	    int mask = 1 << k;
	    
	    if ((n & mask) == mask) {
			System.out.println("on");
			
		}else{
			System.out.println("off");
		}
		

	}

}
