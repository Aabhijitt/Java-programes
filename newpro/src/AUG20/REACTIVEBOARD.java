package AUG20;

public class REACTIVEBOARD {

	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 0, 0 }, };
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		floodfillreactive(maze, 0, 0, "", visited);
	}

	public static void floodfillreactive(int[][] maze, int sr, int sc, String psf, boolean[][] visited) {  //sr  source row// sc-source col-//psf-path so far
		
	
		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(psf);
			return;
		}
		if (amivisited(maze, sr, sc, visited) == false) {
			return;
		}
		visited[sr][sc] = true;

		floodfillreactive(maze, sr - 1, sc, psf + "t", visited);
		floodfillreactive(maze, sr, sc + 1, psf + "r", visited);
		floodfillreactive(maze, sr, sc - 1, psf + "l", visited);
		floodfillreactive(maze, sr + 1, sc, psf + "d", visited);

		visited[sr][sc] = false;
	}

	public static boolean amivisited(int[][] maze, int sr, int sc, boolean[][] visited) {
		if (sc < 0 || sr < 0 || sc >= maze[0].length || sr >= maze.length) {
			return false;

		} else if (maze[sr][sc] == 1) {
			return false;
		} else if (visited[sr][sc] == true) {
			return false;
		} else {
			return true;
		}

	}
}
