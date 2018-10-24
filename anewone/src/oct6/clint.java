package oct6;

public class clint {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		//printNqueenspA(board, 1, 1, "");
		//printNqueenss(board, 1, 1, " ");
	}

	public static void printNqueenspA(boolean[][] board, int cq, int lqp, String asf) {
		if (cq > board.length) {

			System.out.println(asf);
			return;
		}
		for (int i = lqp + 1; i < board.length * board.length; i++) {
			int row = (i - 1) / board.length;
			int col = (i - 1) % board.length;
			if (board[row][col] == false && theQueenissafe(board, row, col) == true) {
				board[row][col] = true;
				printNqueenspA(board, cq + 1, i, asf + i);
				board[row][col] = false;

			}
		}
	}

	public static void printNqueenss(boolean[][] board, int cq, int cb, String asf) {
		if (cq > board.length ) {
			System.out.println(asf);
			return;
		}
		if(cb > board.length * board.length){
			return;
		}
		printNqueenss(board, cq, cb + 1, asf);

		int row = (cb - 1) / board.length;
		int col = (cb - 1) % board.length;
		if (board[row][col] == false && theQueenissafe(board, row, col) == true) {
			board[row][col] = true;
			printNqueenss(board, cq + 1, cb + 1, asf + cb);
			board[row][col] = false;

		}
	}

	private static boolean boardissafe(boolean[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				if (board[row][col] == true) {
					if (theQueenissafe(board, row, col) == false) {
						return false;
					}
				}
			}
		}
		return true;
	}

	private static boolean theQueenissafe(boolean[][] board, int row, int col) {
		int[][] dirs = { { -1, 0 }, { -1, +1 }, { 0, +1 }, { +1, +1 }, { +1, 0 }, { +1, -1 }, { 0, -1 }, { -1, -1 }, };
		for (int rad = 1; rad < board.length; rad++) {
			for (int[] dir : dirs) {
				int ren = row + rad * dir[0];
				int cen = col + rad * dir[1];
				if (ren >= 0 && ren < board.length && cen >= 0 && cen < board.length && board[ren][cen] == true) {
					return false;
				}
			}

		}
		return true;

	}

}
