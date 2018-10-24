package AUG25NEW;

public class octaltobinary {

	public static void main(String[] args) {
		int oct = 642;
		int bin = 0;
		int p = 1;
		while (oct != 0) {
			int rem = oct % 10;
			oct = oct / 10;
			if (rem == 0) {
				rem = 0;
			} else if (rem == 1) {
				rem = 1;
			} else if (rem == 2) {
				rem = 10;
			} else if (rem == 3) {
				rem = 11;
			} else if (rem == 4) {
				rem = 100;
			} else if (rem == 5) {
				rem = 101;
			} else if (rem == 6) {
				rem = 110;
			} else if (rem == 7) {
				rem = 111;
			}

			bin = bin + rem * p;
			p = p * 1000;
		}

		System.out.println(bin);
	}
}
