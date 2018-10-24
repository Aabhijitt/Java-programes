package july29;

public class clint {

	public static void main(String[] args) {
		int[][] one = { { 10,0, 3 }, { 5, 2, 6 } };

		int[][] two = { { 0, 1, 3, 4 }, { 3, 5, 8, 6 }, { 4, 6, 8, 9 }

		};
		multiply(one, two);
	}

	public static void multiply(int[][] one, int[][] two) {
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;

		if (c1 != r1) {
			System.out.println("can't multiply");
			return;
		}

		int[][] prd = new int[r1][c2];

		for (int i = 0; i < prd.length; i++) {
			for (int j = 0; j < prd[0].length; j++) {
				for (int k = 0; k < c1; k++) {

					prd[i][j] += one[i][k] * two[k][j];

				}

			}
			july28.twod.display(prd);
		}
	}
}
