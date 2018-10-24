package oct23;

public class lazysegment {

	static int[] sa;
	static int[] lazy;
	static int[] ba;

	public static void main(String[] args) {
		ba = new int[] { 2, 5, 9, -3, -6, 0, 7, 1, -1, 8, -7, 3, -4, -5, 6, 7 };
		int h = getlog(ba.length, false);
		int sz = (1 << (h + 1)) - 1;
		sa = new int[sz];
		lazy = new int[sz];

		build(0, 0, ba.length - 1);
		System.out.println(query(0, 0, ba.length - 1, 3, 7));
		reupdate(0, 0, ba.length - 1, 5, 9, 4);
		reupdate(0, 0, ba.length - 1, 2, 6, -2);
		System.out.println(query(0, 0, ba.length - 1, 3, 7));

	}

	public static void build(int si, int ss, int se) {
		if (ss == se) {
			sa[si] = ba[ss];
			return;
		}
		int mid = (ss + se) / 2;
		build(2 * si + 1, ss, mid);
		build(2 * si + 2, mid + 1, se);
		sa[si] = sa[2 * si + 1] + sa[2 * si + 2];

	}

	public static void reupdate(int si, int ss, int se, int us, int ue, int delta) {
		handelpendingupdate(si, ss, se);
		if (se < us || ss > ue) {
			return;

		} else if (ss >= us && se <= ue) {
			sa[si] += delta * (se - ss + 1);
			if (ss != se) {
				lazy[2 * si + 1] += delta;
				lazy[2 * si + 2] += delta;
			}
		} else {
			int mid = (ss + se) / 2;
			reupdate(2 * si + 1, ss, mid, us, ue, delta);
			reupdate(2 * si + 2, mid + 1, se, us, ue, delta);
			sa[si] = sa[2 * si + 1] + sa[2 * si + 2];

		}

	}

	public static int query(int si, int ss, int se, int qs, int qe) {
		handelpendingupdate(si, ss, se);
		if (ss >= qs && se <= qe) {
			return sa[si];
		} else if (se < qs || ss > qe) {
			return 0;
		} else {
			int mid = (ss + se) / 2;
			int lc = query(2 * si + 1, ss, mid, qs, qe);
			int rc = query(2 * si + 2, mid + 1, se, qs, qe);

			return lc + rc;
		}
	}

	private static void handelpendingupdate(int si, int ss, int se) {
		sa[si] += lazy[si] * (se - ss + 1);
		if (ss != se) {
			lazy[2 * si + 1] += lazy[si];
			lazy[2 * si + 2] += lazy[si];
		}
		lazy[si] = 0;

	}

	public static void update(int si, int ss, int se, int bi, int delta) {
		if (ss == se) {
			ba[bi] += delta;
			sa[si] += delta;
			return;
		}
		int mid = (ss + se) / 2;
		if (bi <= mid) {
			update(2 * si + 1, ss, mid, bi, delta);

		} else {
			update(2 * si + 2, mid + 1, se, bi, delta);
		}
		sa[si] = sa[2 * si + 1] + sa[2 * si + 2];

	}

	private static int getlog(int n, boolean floor) {
		int log = 0;
		while ((1 << log) < n) {
			log++;
		}
		if (floor && (1 << log) > n) {
			log--;
		}

		return log;
	}

}
