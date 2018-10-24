package sept2;

public class marge {

	public static void main(String[] args) {
		// int[]one={5,10,15,18,22,27};
		// int[]two={5,7,16,23,28,40,50};
		// int[] result=merged(one, two);
		int[] arr = { 7, 8, 3, 6, 2, 4, 5, 1 };

		int[] result = mergesort(arr, 0, arr.length - 1);

		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	public static int[] merged(int[] one, int[] two) {
		int[] merged = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				merged[k] = one[i];
				i++;
				k++;
			} else {
				merged[k] = two[j];
				j++;
				k++;
			}

		}
		while (j < two.length) {
			merged[k] = two[j];
			j++;
			k++;
		}
		while (i < one.length) {
			merged[k] = one[i];
			i++;
			k++;
		}
		return merged;

	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}
		int mid = (lo + hi) / 2;
		int[] fihalf = mergesort(arr, lo, mid);
		int[] schalf = mergesort(arr, mid + 1, hi);
		int[] sorted = merged(fihalf, schalf);
		return sorted;
	}

}
