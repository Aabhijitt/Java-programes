package oct23;

public class fenwicktree {
	static int[] fa;
	static int[] arr;

	public static void main(String[] args) {
		arr = new int[] { 2, 5, 9, -3, -6, 0, 7, 1, -1, 8, -7, 3, -4, -5, 6, 7 };
		fa = new int[arr.length + 1];
		build();
		System.out.println(query(3, 10));
		System.out.println(query(5, 12));
		update(6, 5);
		System.out.println(query(3, 10));
		System.out.println(query(5, 12));

	}

	public static int prefixsum(int idx) {
		idx++;
		int sum = 0;
		while (idx > 0) {
			sum = sum + fa[idx];
			idx = idx - (idx & -idx);
		}
		return sum;
	}

	public static int query(int l, int r) {
		return prefixsum(r) - prefixsum(l - 1);
	}

	public static void update(int idx, int delta) {
		idx++;
		while (idx < fa.length) {
			fa[idx] += delta;
			idx += (idx & -idx);
		}
	}

	public static void build() {
		for (int i = 0; i < arr.length; i++) {
			update(i, arr[i]);
		}
	}

}
