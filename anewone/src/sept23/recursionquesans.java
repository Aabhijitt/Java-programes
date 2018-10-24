package sept23;

public class recursionquesans {

	public static void main(String[] args) {
		// printsswAscii("abc", " ");
		// printKPC("357", "");
		// printBoardpath(0, 10, "");
		// printMazepath(0, 0, 3, 3, "");
		// printallmove(0, 0, 3, 3, "");
		int[][] maze = new int[6][7];
		maze[0][1] = 1;
		maze[1][1] = 1;
		maze[3][1] = 1;
		maze[4][1] = 1;
		maze[5][1] = 1;
		maze[1][3] = 1;
		maze[3][3] = 1;
		maze[4][3] = 1;
		maze[1][4] = 1;
		maze[4][4] = 1;
		maze[1][5] = 1;
		maze[2][5] = 1;
		maze[4][5] = 1;
		floodfillrec(maze, new boolean[6][7], 0, 0, "");

		// int [][] maze = {{0,1,0,0,0,0,0},
		// {0,1,0,1,1,1,0},
		// {0,0,0,0,0,1,0},
		// {0,1,0,1,0,0,0},
		// {0,1,0,1,1,1,0},
		// {0,1,0,0,0,0,0},
		//
		// };
		//
		// floodfill(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mnop", "qrs", "tuv", "wx", "yz" };
	static int count = 0;

	public static void printss(String ques, String asf) {
		if (ques.length() == 0) {
			count++;
			System.out.println(count + " " + asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		printss(roq, asf + ch);
		printss(roq, asf + "");
	}

	public static void printsswAscii(String ques, String asf) {
		if (ques.length() == 0) {
			count++;
			System.out.println(count + " " + asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printsswAscii(roq, asf);
		printsswAscii(roq, asf + ch);
		printsswAscii(roq, asf + (int) ch);
	}

	public static void printKPC(String ques, String asf) {

		if (ques.length() == 0) {
			count++;
			System.out.println(count + ". " + asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String options = codes[ch - '0'];

		for (int i = 0; i < options.length(); i++) {

			printKPC(roq, asf + options.charAt(i));

		}
	}

	public static void printBoardpath(int src, int dest, String psf) {
		if (src == dest) {
			count++;
			System.out.println(count + " ." + psf);
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			int i = src + dice;
			if (i <= dest) {
				printBoardpath(i, dest, psf + dice);
			}

		}
	}

	public static void printMazepath(int sr, int sc, int dr, int dc, String asf) {
		if (sr == dr && sc == dc) {
			count++;
			System.out.println(count + " " + asf);
			return;
		}
		if (sr < dr) {
			printMazepath(sr + 1, sc, dr, dc, asf + "V");
		}
		if (sc < dc) {
			printMazepath(sr, sc + 1, dr, dc, asf + "H");
		}
	}

	public static void printallmove(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			count++;
			System.out.println(count + ". " + psf);
			return;
		}

		for (int i = 1; i <= dc - sc; i++) {
			printallmove(sr, sc + i, dr, dc, psf + "h" + i);
		}
		for (int i = 1; i <= dr - sr; i++) {
			printallmove(sr + i, sc, dr, dc, psf + "v" + i);
		}
		for (int i = 1; i <= Math.min(dc - sc, dr - sr); i++) {
			printallmove(sr + i, sc + i, dr, dc, psf + "d" + i);
		}
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
		if (sc + 1 <= maze[0].length && maze[sr][sc + 1] != 1 && visited[sr][sc + 1] == false) {
			floodfill(maze, sr, sc + 1, psf + "r", visited);
		}
		if (sc - 1 >= 0 && maze[sr][sc - 1] != 1 && visited[sr][sc - 1] == false) {
			floodfill(maze, sr, sc - 1, psf + "l", visited);
		}

		if (sr + 1 <= maze.length && maze[sr + 1][sc] != 1 && visited[sr + 1][sc] == false) {
			floodfill(maze, sr + 1, sc, psf + "d", visited);
		}
		visited[sr][sc] = false;
	}

	public static void floodfillrec(int[][] maze, boolean[][] visited, int sr, int sc, String psf) {
		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(psf);
			return;
		}

		if (isthisvalid(maze, visited, sr, sc) == true) {
			return;
		}
		visited[sr][sc] = true;
		floodfillrec(maze, visited, sr - 1, sc, psf + "T");
		floodfillrec(maze, visited, sr, sc + 1, psf + "R");
		floodfillrec(maze, visited, sr + 1, sc, psf + "D");
		floodfillrec(maze, visited, sr, sc - 1, psf + "L");
		visited[sr][sc] = false;
	}

	private static boolean isthisvalid(int[][] maze, boolean[][] visited, int sr, int sc) {

		return sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1
				|| visited[sr][sc] == true;
	}

}
