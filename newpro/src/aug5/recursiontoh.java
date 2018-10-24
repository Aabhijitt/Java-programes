package aug5;

public class recursiontoh {

	public static void main(String[] args) {
		toh(3, "A", "B", "C");

	}

	public static void toh(int n, String src, String dest, String help) {
		if (n == 0) {
			return;
		}
		toh(n - 1, src, help, dest);
		System.out.println(src + n + dest);
		toh(n - 1, help, dest, src);

	}
}
