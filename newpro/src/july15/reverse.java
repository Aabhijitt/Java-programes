package july15;

public class reverse {

	public static void main(String[] args) {
		
		int n = 95324;
		while(n != 0){
			int q = n / 10;
			int r = n % 10;
			System.out.print(r);
			n = q;
		}
	}

}
