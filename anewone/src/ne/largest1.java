package ne;

public class largest1 {

	public static void main(String[] args) {

		int a = 50;
		int b = 40;
		int c = 30;

		if (a >= b) {
			if (a >= c) {
				System.out.println(a + "is largest");
			} else {
				System.out.println(c + "is largest");
			}
		} else {
			if (b >= c) {
				System.out.println(b + "is largest");
			} else {
				System.out.println(c + "is largest");
			}
		}
			
		}
	}


