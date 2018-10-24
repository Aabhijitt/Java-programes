package AUG25;

public class nqueensubse {

	public static void main(String[] args) {
		boolean[][] chess = new boolean[4][4];
		long start = System.currentTimeMillis();
		nQueenlikeSS(chess, 0, 0, "");
		long end = System.currentTimeMillis();
		System.out.println(end-start);

	}
  public static void nQueenlikeSS(boolean[][] chess, int box, int qpsf , String asf){
	  if(qpsf == chess.length){
		  System.out.println(asf);
		  return;
	  }
	  if(box >= chess.length * chess.length){
		  return;
	  }
	  nQueenlikeSS(chess, box+1, qpsf, asf);
	  
	  int row = box / chess.length;
	  int col = box % chess.length;
	  if(chess[row][col]== false){
		  if(queenissafe(chess, row, col)==true){
		  chess[row][col] = true;
		  nQueenlikeSS(chess, box+1, qpsf+1, asf + "q" + (qpsf + 1) + "b" +box + " ");
		  chess[row][col] = false;
		  }
	  }
  }

private static boolean chessboardissafe(boolean[][] chess) {
	for (int row = 0; row < chess.length; row++) {
		for (int col = 0; col < chess.length; col++) {
			if (chess[row][col] == true) {
				if (queenissafe(chess, row, col) == false) {
					return false;

				}
			}
		}
	}
	return true;

}

private static boolean queenissafe(boolean[][] chess, int row, int col) {
	int[][] dirs = { { 0, -1 }, // North >-- x , y
			{ +1, -1 }, // NE
			{ +1, 0 }, // East
			{ +1, +1 }, // SE
			{ 0, +1 }, // South
			{ -1, +1 }, // SW
			{ -1, 0 }, // West
			{ -1, -1 }, // NW
	};
	for (int di = 0; di < dirs.length; di++) { // di - direction index.
		for (int dist = 1; true; dist++) { // dist ---
											// distance..........true ---
											// don't know the distance.as
											// long as the board goes...

			int encol = col + dist * dirs[di][0]; // encol -- enemy column..
			int enrow = row + dist * dirs[di][1]; // enrow -- enemy row..
			if (encol < 0 || enrow < 0 || encol >= chess[0].length || enrow >= chess.length) {
				break;
			}
			if (chess[enrow][encol] == true) {
				return false;
			}
		}
	}
	return true;
}

}
