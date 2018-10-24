package newarray;

public class binarysearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int data = 40;

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end / 2);

			if (arr[mid] == data) {

				System.out.println(mid);
				return;
			}

			else if (data > arr[mid])
				start = mid + 1;

			else if (data < arr[mid])
				end = mid - 1;
		}

		System.out.println(-1);

	}

}
