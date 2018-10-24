package oct14;

public class DPCon {

	public static void main(String[] args) {
		// countpalendromess("abccbc");
		// String s = "abccbc";
		// System.out.println(minimumpalindromiccut(s, 0, s.length()-1));
		// System.out.println(minimumpalindromiccutmemo(s, 0, s.length()-1, new
		// Integer[s.length()][s.length()]));
//		int dims[] = { 10, 20, 30, 40, 50, 60 };
//		mcmtab(dims);
//		System.out.println(eggdrop(2, 64));
	}

	public static void countpalendromess(String s) {
		boolean[][] strg = new boolean[s.length()][s.length()];
		for (int gap = 0; gap <= s.length() - 1; gap++) {
			for (int i = 0; i + gap < s.length(); i++) {
				int j = i + gap;
				if (gap == 0) {
					strg[i][j] = true;

				} else if (gap == 1) {
					strg[i][j] = s.charAt(i) == s.charAt(j);
				} else {
					strg[i][j] = s.charAt(i) == s.charAt(j) && strg[i + 1][j - 1];
				}
				if (strg[i][j]) {
					System.out.println(s.substring(i, j + 1));
				}

			}

		}
	}

	public static int minimumpalindromiccut(String s, int i, int j) {
		if (ispalindrome(s, i, j) == true) {
			return 0;

		}
		int mic = Integer.MAX_VALUE;
		for (int cp = i; cp < j; cp++) {

			int c1 = minimumpalindromiccut(s, i, cp);
			int c2 = minimumpalindromiccut(s, cp + 1, j);

			int tc = c1 + c2 + 1;
			mic = Math.min(mic, tc);

		}
		return mic;

	}

	private static boolean ispalindrome(String s, int i, int j) {
		int left = i;
		int right = j;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static int minimumpalindromiccutmemo(String s, int i, int j, Integer[][] qb) {
		if (ispalindrome(s, i, j) == true) {
			return 0;
		}
		if (qb[i][j] != null) {
			return qb[i][j];

		}
		int mic = Integer.MAX_VALUE;
		for (int cp = i; cp < j; cp++) {

			int c1 = minimumpalindromiccutmemo(s, i, cp, qb);
			int c2 = minimumpalindromiccutmemo(s, cp + 1, j, qb);

			int tc = c1 + c2 + 1;
			mic = Math.min(mic, tc);

		}
		qb[i][j] = mic;
		return mic;
	}

	public static int mcm(int[] dims, int i, int j) {
		if (j == i + 1) {
			return 0;
		}
		int mc = Integer.MAX_VALUE;
		for (int cp = i + 1; cp <= j - 1; cp++) {
			int c1 = mcm(dims, i, cp);
			int c2 = mcm(dims, cp, j);
			int muc = dims[i] * dims[cp] * dims[j];
			int tc = c1 + c2 + muc;
			mc = Math.min(mc, tc);

		}
		return mc;
	}

	public static void mcmtab(int[] dims) {
		int[][] strg = new int[dims.length - 1][dims.length - 1];
		for (int d = 0; d < strg.length - 1; d++) {
			for (int i = 0; i + d < strg.length; i++) {
				int j = i + d;
				if (d == 0) {
					strg[i][j] = 0;
				} else {
					int mic = Integer.MAX_VALUE;

					for (int k = 1; k <= d; k++) {
						int c1 = strg[i][i + k - 1];
						int c2 = strg[i + k][j];
						int muc = dims[i] * dims[i + k] * dims[j + 1];
						int tc = c1 + c2 + muc;
						mic = Math.min(mic, tc);
					}

					strg[i][j] = mic;
				}
			}
		}

		System.out.println(strg[0][strg.length - 1]);
	}
	
	
	
	
	
}
