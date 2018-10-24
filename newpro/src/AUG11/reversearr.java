package AUG11;

public class reversearr {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 12 };
		displayreverse(arr, 0);

	}

	public static void displayreverse(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}
		displayreverse(arr, vidx + 1);
		System.out.println(arr[vidx]);

	}
}
