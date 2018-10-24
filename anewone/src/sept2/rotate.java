package sept2;

public class rotate {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 9, 7, 2, 6, 3 };
		int d = 3;
		reverse(arr, 0, arr.length - 1 - d);
		reverse(arr, arr.length - d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println(".");
	}

	public static void reverse(int[] arr, int l, int r) {
		while (l < r) {

			swap(arr, l, r);
			l++;
			r--;
		}
	}

	private static void swap(int[] arr, int l, int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

}
