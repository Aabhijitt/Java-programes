package oct20;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// hfc("abdaaadsa");
		// Integer[] one = { 2, 1, 3, 1, 2, 5, 2 };
		// Integer[] two = { 4, 5, 1, 2, 1, 2, 1 };
		// gce2(one, two);
		Integer[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		printlong(arr);
	}

	public static void hfc(String word) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (char ch : word.toCharArray()) {
			hmap.put(ch, hmap.containsKey(ch) ? hmap.get(ch) + 1 : 1);

		}

		ArrayList<Character> key = new ArrayList<>(hmap.keySet());
		char mfc = key.get(0);
		for (char keys : key) {
			mfc = hmap.get(keys) > hmap.get(mfc) ? keys : mfc;
		}
		System.out.println(mfc);
	}

	public static void gce1(Integer[] one, Integer[] two) {

		HashMap<Integer, Integer> hmap = new HashMap<>();

		for (int val : one) {
			hmap.put(val, hmap.containsKey(val) ? hmap.get(val) + 1 : 1);

		}

		for (int val : two) {
			if (hmap.containsKey(val)) {
				System.out.println(val + " ");
				hmap.remove(val);
			}
		}
		System.out.println(".");

	}

	public static void gce2(Integer[] one, Integer[] two) {
		HashMap<Integer, Integer> hmap = new HashMap<>();

		for (int val : one) {
			hmap.put(val, hmap.containsKey(val) ? hmap.get(val) + 1 : 1);

		}

		for (int val : two) {
			if (hmap.containsKey(val) && hmap.get(val) > 0) {
				System.out.println(val + " ");
				hmap.put(val, hmap.get(val) - 1);
			}
		}
		System.out.println(".");

	}

	public static void printlong(Integer[] arr) {
		HashMap<Integer, Boolean> hmap = new HashMap<>();

		for (int val : arr) {
			hmap.put(val, true);
		}
		for (int val : arr) {
			if (hmap.containsKey(val - 1)) {
				hmap.put(val, false);
			}
		}
		int ms = -1;
		int ml = 0;

		for (int val : arr) {
			if (hmap.get(val) == true) {
				int ts = val;
				int tl = 1;
				while (hmap.containsKey(ts + tl)) {
					tl++;
				}
				if (tl > ml) {
					ml = tl;
					ms = ts;

				}
			}
		}
		for (int i = 0; i < ml; i++) {
			System.out.println(ms + i);
		}

	}

}