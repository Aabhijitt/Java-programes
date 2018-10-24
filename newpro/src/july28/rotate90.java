package july28;

public class rotate90 {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 },

		};

		int[][] other = new int[arr.length][arr.length];

		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row < arr.length; row++) {
				other[col][other.length - 1 - row] = arr[row][col];
			}

			System.out.println();

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(other[i][j] + " ");
			}
			System.out.println();
		}
	}
}
