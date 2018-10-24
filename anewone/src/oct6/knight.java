package oct6;

public class knight {

	public static void main(String[] args) {
		boolean[][] board = new boolean[3][3];
		
		
	//	Knightproactive(board, 1, "", 1);
		printKnightss(board, 1, 1, "");
	 
		
	}

	static int count = 0;

	public static void Knightproactive(boolean[][] board, int Kno, String asf, int plqbno) {
		if (Kno == board.length) {
			count++;

			System.out.println(count + "." + asf);

			return;
		}
		for (int Kno1 = plqbno + 1; Kno <board.length * board.length; Kno++) {

			int row = Kno / board.length;
			int col = Kno % board.length;

			if (board[row][col] == false) {
				if (Knightissafe(board, row, col) == true) {
					board[row][col] = true;
					Knightproactive(board, Kno + 1, asf + "k" + (Kno + 1) + "b" + Kno + " ", Kno);
					board[row][col] = false;
				}
			}
		}

	}
	public static void printKnightss(boolean[][] board, int cq, int cb, String asf) {
		if (cq > board.length ) {
			count++;
			System.out.println(count+" ."+asf);
			return;
		}
		if(cb > board.length * board.length){
			return;
		}
		printKnightss(board, cq, cb + 1, asf);

		int row = (cb - 1) / board.length;
		int col = (cb - 1) % board.length;
		if (board[row][col] == false && Knightissafe(board, row, col) == true) {
			board[row][col] = true;
			printKnightss(board, cq + 1, cb + 1, asf + cb);
			board[row][col] = false;

		}
	}

	private static boolean chessboardissafe(boolean[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				if (board[row][col] == true) {
					if (Knightissafe(board, row, col) == false) {
						return false;

					}
				}
			}
		}
		return true;

	}

	private static boolean Knightissafe(boolean[][] board, int row, int col) {
		int[][] dirs = { { -2 , -1},
				{ -2, +1 }, 
				{ -1, -2 },
				{ -1, +2 }, 
				{ +1, -2 }, 
				{ +1,+2 }, 
				{ +2, -1 }, 
				{+2,+1},
		};
		for (int di = 0; di < dirs.length; di++) {

			int enkcol = col + dirs[di][0]; 
			int enkrow = row + dirs[di][1];
			if (enkcol < 0 || enkrow < 0 || enkcol >= board[0].length || enkrow >= board.length) {
				continue;
			}
			if (board[enkrow][enkcol] == true) {
				return false;
			}
		}
		return true;
	}
	}



