package sept2;

public class quicks {

	public static void main(String[] args) {
		 int[]arr = {10,20,2,17,8,25,9,16};
		//int[] arr = { 2, 25, 10, 16, 18, 1, 17, 44 };
		quicksort(arr, 0, arr.length - 1);

		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

	public static int partition(int[] arr, int lo, int hi, int pivot) {

		int i = lo;
		int pidx = lo;
		while (i <= hi) {
			if (arr[i] <= pivot) {
				swap(arr, i, pidx);
				i++;
				pidx++;
			} else {
				i++;
			}
		}
		return pidx - 1;
	}

	public static void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pivot = arr[hi];
		int pidx = partition(arr, lo, hi, pivot);

		quicksort(arr, lo, pidx - 1);
		quicksort(arr, pidx + 1, hi);

	}

	private static void swap(int[] arr, int i, int pidx) {
		int temp = arr[i];
		arr[i] = arr[pidx];
		arr[pidx] = temp;

	}

}
