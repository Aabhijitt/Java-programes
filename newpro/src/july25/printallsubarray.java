package july25;

public class printallsubarray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		print(arr);

	}

	private static void print(int[] arr) {

		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				SAFromstarttoend(arr, start, end);
			}

		}

	}

	public static void SAFromstarttoend(int[] arr, int start, int end) {
		for (int i = start; i <= end; i++) {

			System.out.print(arr[i]+ " ");
		}
		System.out.println();

	}
}