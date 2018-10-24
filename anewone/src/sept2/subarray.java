package sept2;

public class subarray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		printallsubarray(arr);
	}

	public static void printallsubarray(int[] arr) {
		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				starttoend(arr, start, end);
			}

		}

	}

	public static void starttoend(int[] arr, int start, int end) {
		for (int i = start; i <= end; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}
