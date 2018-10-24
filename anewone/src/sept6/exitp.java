package sept6;

public class exitp {

	public static void main(String[] args) {
		int[][] maze = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 } };

		int r = 0;
		int c = 0;
		int dir = 0; // e-0 s-1 w-2 n-3
		while (true) {
			dir = dir + maze[r][c] % 4;
			int nr = r; // new row
			int nc = c; // new col
			if (dir == 0) { // east
				nc++;
			} else if (dir == 1) { // south
				nr++;
			} else if (dir == 2) { // west
				nc--;
			} else if (dir == 3) { // north
				nr--;
			}
			if (nr < 0 || nr >= maze.length || nc < 0 || nc >= maze[0].length) {
				System.out.println(r + " " + c);
				break;
			} else {
				r = nr;
				c = nc;
			}

		}

	}

}
