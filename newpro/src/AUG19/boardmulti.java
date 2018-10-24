package AUG19;

public class boardmulti {

	public static void main(String[] args) {
		printBPWithMultimoves(0, 0, 2, 2, "");
	}

	static int count = 0;

	public static void printBPWithMultimoves(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			count++;
			System.out.println(count + "." + psf);
			return;
		}
		for (int i = 1; i <= dc - sc; i++) {
			printBPWithMultimoves(sr, sc + i, dr, dc, psf + "h" + i);
		}
		for (int i = 1; i <= dr - sr; i++) {
			printBPWithMultimoves(sr + i, sc, dr, dc, psf + "v" + i);
		}
		for (int i = 1; i <=Math.min(dc - sc,dr - sr); i++) {
			printBPWithMultimoves(sr + i, sc + i, dr, dc, psf + "d" + i);
		}

	}
}
