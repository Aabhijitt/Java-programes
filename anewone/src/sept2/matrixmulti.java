package sept2;

public class matrixmulti {

	public static void main(String[] args) {
		int[][] one = { { 5, 0, 1 }, { 2, 4, 2 } };
		int[][] two = { { 1, 0, 1, 0 }, { 0, 1, 1, 1 }, { 0, 0, 1, 1 } };

		multiply(one, two);

	}

	private static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {

				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	private static void multiply(int[][] one, int[][] two) {
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;

		if (c1 != r2) {
			System.out.println("can't multiply");
			return;
		}
		int[][] res = new int[r1][c2];
		for (int r = 0; r < res.length; r++) {
			for (int c = 0; c < res[0].length; c++) {
				for (int k = 0; k < c1; k++) {
					res[r][c] += one[r][k] * two[k][c];
				}
			}
		}
		display(res);

	}
	
	
}
