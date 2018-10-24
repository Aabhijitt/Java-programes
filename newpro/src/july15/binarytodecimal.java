package july15;

public class binarytodecimal {

	public static void main(String[] args) {
		
         int n = 111000;
		
		int sum = 0;
		int pv = 1;
		while(n != 0){
			int rem = n % 10;
			n = n / 10;
			
			sum = sum + rem * pv;
			
			pv = pv * 2;
		}
		
		System.out.println(sum);
	}

}
