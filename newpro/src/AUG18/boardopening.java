package AUG18;

public class boardopening {

	public static void main(String[] args) {
		pbpWith16Opening(0, 10, "");

	}

	static int count = 0;

	public static void pbpWith16Opening(int src, int dest, String psf) {
		if (src == dest) {
			count++;
			System.out.println(count + "." + psf);
			return;

		}
		if (src == 0) {
			pbpWith16Opening(1, dest, psf + 1);
			pbpWith16Opening(1, dest, psf + 6);

		} else {
			for (int dice = 1; dice <= 6; dice++) {
				int i = src + dice;
				if (i <= dest) {
					pbpWith16Opening(i, dest, psf + dice);

				}

			}
		}
	}
}
