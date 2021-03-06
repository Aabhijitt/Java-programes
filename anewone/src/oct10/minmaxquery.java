package oct10;

public class minmaxquery {

	static int[] arr;
	static int[][] st;

	public static void main(String[] args) {
		arr = new int[] { 2, 14, -1, 15, 7, 9, 4, 18, -3, 7, 17, 19, -9, 12, 0, 100 };
		int sz = logf(arr.length, false);
		st = new int[arr.length][sz];
		preprocess();
		System.out.println(query(2, 15));

	}

	public static int logf(int n, boolean floor) {
		int log = 0;

		while ((1 << log) < n) {
			log++;
		}
		if (floor) {
			if ((1 << log) > n) {
				log--;
			}
		}
		return log;

	}

	public static int query(int left, int right) {
		int count = right - left + 1;
		int log = logf(count, true);
		int f1 = st[left][log];
		int f2 = st[right - (1 << log) + 1][log];
		return Math.min(f1, f2);
	}

	public static void preprocess() {
		for (int j = 0; j < st.length; j++) {
			st[j][0] = arr[j];
		}
		for (int j = 1; j < st[0].length; j++) {
			for (int i = 0; i <= st.length - (1 << j); i++) {
				st[i][j] = Math.min(st[i][j - 1], st[i + (1 << (j - 1))][j - 1]);
			}
		}
	}

}
