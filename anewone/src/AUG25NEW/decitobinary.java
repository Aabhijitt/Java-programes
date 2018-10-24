package AUG25NEW;

public class decitobinary {

	public static void main(String[] args) {
		int dec = 57;
		int bin = 0;
		int p = 1;
		while (dec != 0) {
			int rem = dec % 2;
			dec = dec / 2;
			bin = bin + rem * p;
			p = p * 10;
		}

		System.out.println(bin);
	}
}
