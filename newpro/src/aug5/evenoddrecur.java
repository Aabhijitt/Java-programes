package aug5;

public class evenoddrecur {

	public static void main(String[] args) {

		pdiskip(11);
	}

	public static void pdiskip(int n) {
		if (n == 0) {
			return;
		}
		if( n % 2 == 1){
		System.out.println(n);
		}
		pdiskip(n-1);
		
		if(n % 2 == 0){
		System.out.println(n);

	}
}
}
