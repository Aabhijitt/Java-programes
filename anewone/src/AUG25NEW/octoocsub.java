package AUG25NEW;

public class octoocsub {

	public static void main(String[] args) {
		int n1 = 1110;
		int n2 = 111;
		int b = 0;
		int sum = 0;
		int p = 1;
		int d = 0;
		while (n1 != 0 || n2 != 0 || b != 0) {
			int d1 = n1 % 10;
			n1 = n1 / 10;
			int d2 = n2 % 10;
			n2 = n2 / 10;
			d1 = d1 - b;
			if (d1 >= d2) {
				d = d1 - d2;
				b = 0;
			} else {
				d = d1 + 8 - d2;
				b = 1;
			}
				sum = sum + d * p;
				p = p * 10;
			}
		
		System.out.println(sum);
	}

}
