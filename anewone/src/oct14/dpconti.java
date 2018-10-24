package oct14;

public class dpconti {

	public static void main(String[] args) {
		int[][] arr = { { 1, 0, 1, 0, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 }, { 1, 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0 }, { 1, 0, 0, 1, 1, 0, 0 },
				{ 1, 0, 1, 1, 1, 0, 1 } };
		squr(arr);
	}

	public static void squr(int[][] arr) {

		int[][] strg = new int[arr.length][arr[0].length];
		int maxi = strg.length - 1, maxj = strg[0].length - 1;
		for (int j = strg[0].length - 1; j >= 0; j--) {
			for (int i = strg.length - 1; i >= 0; i--) {
				if (i == strg.length - 1 && j == strg[0].length) {
					strg[i][j] = arr[i][j];
				} else if (i == strg.length - 1) {
					strg[i][j] = arr[i][j];
				} else if (j == strg[0].length - 1) {
					strg[i][j] = arr[i][j];
				} else {
					if (arr[i][j] == 1) {
						int rp1 = i + 1;
						int cp1 = j + 1;
						strg[i][j] = Math.min(strg[rp1][j], Math.min(strg[rp1][cp1], strg[i][cp1])) + 1;
						if (strg[i][j] > strg[maxi][maxj]) {
							maxi = i;
							maxj = j;
						}
					}
				}
			}
		}
		
		System.out.println(strg[maxi][maxj] + " " + maxi + " " + maxj);
	}
}
