package sept15;

public class bubbles {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 2, -1, 7 };

		int c = 1;
		while (c <= arr.length - 1) {
			for (int i = 0; i < arr.length - c; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);

				}
			}
			c++;
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
