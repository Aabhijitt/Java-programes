package AUG19;

public class somewayboard {

	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 0, 0 }, };

		floodfill(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);

	}

	public static void floodfill(int[][] maze, int sr, int sc, String psf, boolean[][] visited) {
		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(psf);
			return;
		}

		visited[sr][sc] = true;
		if (sr - 1 >= 0 && maze[sr - 1][sc] != 1 && visited[sr - 1][sc] == false) {
			floodfill(maze, sr - 1, sc, psf + "t", visited);
		}
		if (sc + 1 < maze[0].length && maze[sr][sc + 1] != 1 && visited[sr][sc + 1] == false) {
			floodfill(maze, sr, sc + 1, psf + "r", visited);
		}
		if (sc - 1 >= 0 && maze[sr][sc - 1] != 1 && visited[sr][sc - 1] == false) {
			floodfill(maze, sr, sc - 1, psf + "l", visited);
		}

		if (sr + 1 < maze.length && maze[sr + 1][sc] != 1 && visited[sr + 1][sc] == false) {
			floodfill(maze, sr + 1, sc, psf + "d", visited);
		}
		visited[sr][sc] = false;
	}

}
