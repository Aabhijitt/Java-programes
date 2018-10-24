package sept2;

public class bubblesort {

	public static void main(String[] args) {
		int arr[] = { 9, 6, 5, 4, 1 };
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	public static void bubblesrt(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
