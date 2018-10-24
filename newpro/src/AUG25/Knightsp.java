package AUG25;

public class Knightsp {

	public static void main(String[] args) {
		boolean[][] chess = new boolean[2][2];
		long start = System.currentTimeMillis();
		Knightproactive(chess, 0, "", -1);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	static int count = 0;

	private static void Knightproactive(boolean[][] chess, int qno, String asf, int plqbno) {
		if (qno == chess.length) {
			count++;

			System.out.println(count + "." + asf);

			return;
		}
		for (int bno = plqbno + 1; bno < chess.length * chess.length; bno++) {

			int row = bno / chess.length;
			int col = bno % chess.length;

			if (chess[row][col] == false) {
				if (Knightissafe(chess, row, col) == true) {
					chess[row][col] = true;
					Knightproactive(chess, qno + 1, asf + "q" + (qno + 1) + "b" + bno + " ", bno);
					chess[row][col] = false;
				}
			}
		}

	}

	private static boolean chessboardissafe(boolean[][] chess) {
		for (int row = 0; row < chess.length; row++) {
			for (int col = 0; col < chess.length; col++) {
				if (chess[row][col] == true) {
					if (Knightissafe(chess, row, col) == false) {
						return false;

					}
				}
			}
		}
		return true;

	}

	private static boolean Knightissafe(boolean[][] chess, int row, int col) {
		int[][] dirs = { { +1, -2 }, // North >-- x , y
				{ +2, -1 }, // NE
				{ +2, +1 }, // East
				{ +1, +2 }, // SE
				{ -1, +2 }, // South
				{ -2, +1 }, // SW
				{ -2, -1 }, // West
				{ -1, -2 }, // NW
		};
		for (int di = 0; di < dirs.length; di++) { // di - direction index.

			int enkcol = col + dirs[di][0]; // enkcol -- enemy knight column..
			int enkrow = row + dirs[di][1]; // enkrow -- enemy row..
			if (enkcol < 0 || enkrow < 0 || enkcol >= chess[0].length || enkrow >= chess.length) {
				continue;
			}
			if (chess[enkrow][enkcol] == true) {
				return false;
			}
		}
		return true;
	}

}
