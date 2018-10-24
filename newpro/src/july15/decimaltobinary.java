package july15;

public class decimaltobinary {

	public static void main(String[] args) {
		   
         int n = 56;
		
		int sum = 0;
		int pv = 1;
		while(n != 0){
			int rem = n % 2;
			n = n / 2;
			
			sum = sum + rem * pv;
			
			pv = pv * 10;
		}
		
		System.out.println(sum);
	}

}
