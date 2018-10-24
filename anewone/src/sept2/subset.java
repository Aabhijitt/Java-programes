package sept2;

public class subset {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		subset(arr);
	}

	public static void subset(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < (1 << n); i++) {

			for (int j = n - 1; j >= 0; j--) {
				int m = 1 << j;
				;
				if ((i & (1 << j)) != 0) {
					System.out.print("["+arr[arr.length - 1 - j] + " ");
				}

			
			}
			System.out.println("]");
		
	}
}
}