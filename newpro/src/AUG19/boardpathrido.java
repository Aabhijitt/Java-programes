package AUG19;

public class boardpathrido {

	public static void main(String[] args) {
		printBP(0, 0, 3, 3, "");
	}

	public static void printBP(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}
		if (sc < dc) {
			printBP(sr, sc + 1, dr, dc, psf + "h");
		}

			if (sr < dr) {
				printBP(sr + 1, sc, dr, dc, psf + "v");
			}

		}

	}


