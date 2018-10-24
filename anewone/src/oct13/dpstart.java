package oct13;

public class dpstart {

	public static void main(String[] args) {
		// System.out.println(cbp(0, 10));
		 System.out.println(cbpm(0, 10, new int[11]));
		// System.out.println(cbpta(10));
		// int[][] arr = { { 1, 2, 5, 3, 5 }, { 4, 2, 2, 6, 0 }, { 0, 8, 1, 1, 4
		// }, { 4, 0, 2, 5, 100 }, { 0, 2, 6, 7, 1 }

		// };
		//int[][] arr = { { 2, 1, 3, 10, 2 }, { 6, 0, 8, 1, 8 }, { 3, 9, 5, 6, 7 }, { 4, 2, 4, 7, 4 },
				//{ 1, 5, 0, 2, 3 } };
		// System.out.println(cmpt(3, 3));
		// System.out.println(mcpt(arr));
		//System.out.println(goldmine(arr));
	}

	public static int cbp(int s, int d) {    // s----source......\\ d- destination.....
		int count = 0;
		if (s == d) {
			return 1;
		}

		for (int dice = 1; dice <= 6 && s + dice <= d; dice++) {
			int i = s + dice;
			int citod = cbp(i, d);
			count += citod;

		}

		return count;
	}

	public static int cbpm(int s, int d, int[] qb) {

		int count = 0;
		if (s == d) {
			return 1;
		}
		if (qb[s] != 0) {
			return qb[s];
		}

		for (int dice = 1; dice <= 6 && s + dice <= d; dice++) {
			int i = s + dice;
			int citod = cbpm(i, d, qb);
			count += citod;

		}

		qb[s] = count;
		return count;

	}

	public static int cbpt(int d) {

		int[] f = new int[d + 1];
		f[d] = 1;
		for (int x = d - 1; x >= 0; x--) {
			for (int dice = 1; dice <= 6 && x + dice <= d; dice++) {
				f[x] += f[x + dice];
			}

		}
		return f[0];

	}

	public static int cbpta(int d) {
		int[] s = new int[6];
		s[0] = 1;
		for (int i = 1; i <= d; i++) {
			int nv = s[0] + s[1] + s[2] + s[3] + s[4] + s[5];
			s[5] = s[4];
			s[4] = s[3];
			s[3] = s[2];
			s[2] = s[1];
			s[1] = s[0];
			s[0] = nv;
		}
		return s[0];
	}

	public static int cmpt(int r, int c) {
		int[][] strg = new int[r + 1][c + 1];
		strg[r][c] = 1;
		for (int i = r; i >= 0; i--) {
			for (int j = c; j >= 0; j--) {
				if (i == r && j == c) {
					strg[i][j] = 1;
				} else if (i == r) {
					strg[i][j] = strg[i][j + 1];
				} else if (j == c) {
					strg[i][j] = strg[i + 1][j];
				} else {
					strg[i][j] = strg[i][j + 1] + strg[i + 1][j];
				}

			}

		}
		return strg[0][0];

	}

	public static int mcpt(int[][] arr) {
		int[][] strg = new int[arr.length][arr[0].length];
		for (int i = strg.length - 1; i >= 0; i--) {
			for (int j = strg[0].length - 1; j >= 0; j--) {
				if (i == strg.length - 1 && j == strg[0].length - 1) {
					strg[i][j] = arr[i][j];
				} else if (i == strg.length - 1) {
					strg[i][j] = arr[i][j] + strg[i][j + 1];

				} else if (j == strg[0].length - 1) {
					strg[i][j] = arr[i][j] + strg[i + 1][j];
				} else {

					strg[i][j] = arr[i][j] + Math.min(strg[i][j + 1], strg[i + 1][j]);
				}

			}

		}
		return strg[0][0];

	}

	public static int goldmine(int[][] arr) {

		int[][] strg = new int[arr.length][arr[0].length];
		for (int j = strg[0].length - 1; j >= 0; j--) {
			for (int i = strg.length - 1; i >= 0; i--) {

				if (j == arr[0].length-1) {
					strg[i][j] = arr[i][j];
				} else if (i == 0) {
					strg[i][j] = arr[i][j] + Math.max(strg[i][j + 1], strg[i + 1][j + 1]);

				} else if (i == arr.length - 1) {
					strg[i][j] = arr[i][j] + Math.max(strg[i - 1][j + 1], strg[i][j + 1]);

				} else {
					strg[i][j] = arr[i][j] + Math.max(strg[i - 1][j + 1], Math.max(strg[i][j + 1], strg[i + 1][j + 1]));
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < strg.length; i++) {
			max = Math.max(max, strg[i][0]);
		}
		return max;

	}

}
