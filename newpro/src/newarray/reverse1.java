package newarray;

public class reverse1 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print(" ");
	}

	private static void reverse(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			swap(arr, left, right);
			left++;
			right--;

		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
