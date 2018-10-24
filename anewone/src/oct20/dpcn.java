package oct20;

public class dpcn {

	public static void main(String[] args) {
		// int[] arr = { 5, 2, 4, 6, 3 };

		// subsetintab(arr, 10);
		// int[] wts = { 2, 5, 1, 3, 4 };
		// int[] prices = { 15, 14, 10, 16, 30 };
		// maxvalofbag(wts, prices, 7);
		// unboundednapsak(wts, prices, 7);
		//
		// System.out.println(eggdropmemo(2, 10, new int[3][11]));
		// int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 };
		// lis(arr);
		// lbs(arr);
		// int[] coins = { 2, 3, 5, 6 };
		// coinchangepermu(coins, 10);
		// int[] arr = {3,4,0,1,2,0,3,1,0,2,1};
		// jumptotar(arr);
		int[] costs = { 0, 3, 5, 6, 15, 10, 25, 12, 24 };
		rodecutting(costs);
	}

	public static void subsetintab(int[] arr, int tar) {
		boolean[][] strg = new boolean[arr.length + 1][tar + 1];
		for (int i = 0; i < strg.length; i++) {
			strg[i][0] = true;
		}
		for (int i = 1; i < strg.length; i++) {
			for (int j = 1; j < strg[0].length; j++) {
				if (strg[i - 1][j]) {
					strg[i][j] = true;
				} else if (j >= arr[i - 1] && strg[i - 1][j - arr[i - 1]]) {
					strg[i][j] = true;
				}
			}
		}
		System.out.println(strg[arr.length][tar]);
		subsetintabac(strg, arr, strg.length - 1, strg[0].length - 1, "");
	}

	public static void subsetintabac(boolean strg[][], int[] arr, int i, int j, String asf) {
		if (j == 0) {
			System.out.println(asf);
			return;
		}
		if (i == 0) {
			return;
		}
		if (strg[i - 1][j] == true) {
			subsetintabac(strg, arr, i - 1, j, asf);
		}
		if (j >= arr[i - 1] && strg[i - 1][j - arr[i - 1]] == true) {
			subsetintabac(strg, arr, i - 1, j - arr[i - 1], asf + " " + arr[i - 1]);
		}
	}

	public static void maxvalofbag(int[] wts, int[] prices, int cap) {
		int[][] strg = new int[wts.length + 1][cap + 1];
		for (int i = 1; i < strg.length; i++) {
			for (int j = 1; j < strg[0].length; j++) {
				strg[i][j] = strg[i - 1][j];
				if (j - wts[i - 1] >= 0) {

					strg[i][j] = Math.max(strg[i][j], strg[i - 1][j] - wts[i - 1] + prices[i - 1]);
				}
			}
		}
		System.out.println(strg[strg.length - 1][strg[0].length - 1]);

	}

	public static int eggdropmemo(int eggs, int floors, int[][] qb) {

		if (eggs == 1) {
			return floors;
		}
		if (floors == 1) {
			return 1;
		}
		if (floors == 0) {
			return 0;
		}
		if (qb[eggs][floors] != 0) {
			return qb[eggs][floors];
		}

		int mint = Integer.MAX_VALUE;
		for (int i = 1; i <= floors; i++) {
			int b = eggdropmemo(eggs - 1, i - 1, qb);
			int c = eggdropmemo(eggs, floors - i, qb);
			if (Math.max(b, c) < mint) {
				mint = Math.max(b, c);

			}

		}
		qb[eggs][floors] = mint + 1;
		return mint + 1;
	}

	public static void lis(int[] arr) {
		int[] strg = new int[arr.length];
		strg[0] = 1;
		int omax = 0;
		for (int i = 1; i < strg.length; i++) {
			strg[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					strg[i] = Math.max(strg[j] + 1, strg[i]);
				}
			}
			omax = Math.max(omax, strg[i]);

		}
		System.out.println(omax);
	}

	public static void lbs(int[] arr) {
		int[] strg = new int[arr.length];
		strg[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			strg[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					strg[i] = Math.max(strg[i], strg[j] + 1);

				}
			}

		}
		int[] lds = new int[arr.length];
		lds[lds.length - 1] = 1;
		for (int i = lds.length - 2; i >= 0; i--) {
			lds[i] = 1;
			for (int j = i + 1; j < lds.length; j++) {
				if (arr[j] < arr[i]) {
					lds[i] = Math.max(lds[i], lds[j] + 1);
				}
			}
		}
		int lbs = 0;
		for (int i = 0; i < arr.length; i++) {
			lbs = Math.max(lbs, lds[i] + strg[i]);
		}

		System.out.println(lbs - 1);

	}

	public static void coinchangepermu(int[] coins, int tar) {
		int[] strg = new int[tar + 1];
		strg[0] = 1;
		for (int i = 0; i <= tar; i++) {
			for (int coin : coins) {
				strg[i] += i >= coin ? strg[i - coin] : 0;
			}

		}
		System.out.println(strg[tar]);
	}

	public static void coinchangecombi(int[] coins, int tar) {
		int[] strg = new int[tar + 1];
		strg[0] = 1;
		for (int coin : coins) {
			for (int i = 0; i <= tar; i++) {

				strg[i] += i >= coin ? strg[i - coin] : 0;
			}

		}
		System.out.println(strg[tar]);
	}

	public static void unboundednapsak(int[] wts, int[] prices, int cap) {
		int[] strg = new int[cap + 1];
		int omax = 0;
		for (int i = 1; i < strg.length; i++) {
			for (int j = 0; j < wts.length; j++) {
				if (wts[j] <= i) {

					strg[i] = Math.max(strg[i], strg[i - wts[j]] + prices[j]);

				}

			}

			omax = Math.max(omax, strg[i]);

		}
		System.out.println(omax);
	}

	public static void jumptotar(int[] arr) {
		Integer strg[] = new Integer[arr.length];
		strg[arr.length - 1] = 0;
		for (int i = strg.length - 2; i >= 0; i--) {
			for (int j = i + 1; j <= i + arr[i] && j < arr.length; j++) {
				if (strg[j] != null) {
					if (strg[i] == null || strg[j] + 1 < strg[i]) {
						strg[i] = strg[j] + 1;
					}

				}
			}
		}
		System.out.println(strg[0]);
	}

	public static void rodecutting(int[] costs) {
		int[] strg = new int[costs.length];
		strg[0] = 0;
		strg[1] = costs[1];
		for (int i = 2; i < strg.length; i++) {
			strg[i] = costs[i];
			int l = 1;
			int r = i - l;
			while (l <= r) {
				strg[i] = Math.max(strg[i], strg[l] + strg[r]);
				l++;
				r--;
			}

		}
		System.out.println(strg[strg.length - 1]);
	}
}
