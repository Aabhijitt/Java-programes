package AUG25NEW;

public class octaltoctal {

	public static void main(String[] args) {
		int n1 = 4567;
		int n2 = 7757;
		int c = 0;
		int sum = 0;
		int p = 1;
		while (n1 != 0 || n2 != 0 || c != 0) {
			int d1 = n1 % 10;
			n1 = n1 / 10;
			int d2 = n2 % 10;
			n2 = n2 / 10;

			int d = d1 + d2 + c;
			c = d / 8;
			d = d % 8;
			sum = sum + d * p;
			p = p * 10;

		}
		System.out.println(sum);
	}
}
