package AUG11;

public class displayarr {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 12 };
		display(arr, 2);

	}

	public static void display(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}

		System.out.println(arr[vidx]);
		display(arr, vidx + 1);
	}

}
