package AUG19;

public class diaboardpath {

	public static void main(String[] args) {
		printBPWDiagonals(0, 0, 2, 2, "");
	}

	public static void printBPWDiagonals(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}
		if (sc < dc && sr < dr) {
			printBPWDiagonals(sr, sc + 1, dr, dc, psf + "h");

			printBPWDiagonals(sr + 1, sc, dr, dc, psf + "v");

			printBPWDiagonals(sr + 1, sc + 1, dr, dc, psf + "d");
		}

		else if (sc < dc) {
			printBPWDiagonals(sr, sc + 1, dr, dc, psf + "h");
		} else if (sr < dr) {

			printBPWDiagonals(sr + 1, sc, dr, dc, psf + "v");
		}

	}
}