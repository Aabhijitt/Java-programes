package sept29;

public class pncRecursion {

	public static void main(String[] args) {
		boolean[] boxes = new boolean[4];
		// permutations(boxes, 2, 0, "");
		// combination(boxes, 2, 0, "", -1);
		int[] coins = { 2, 3, 5, 6 };
		// coinpermutation(coins, 10, 0, "");
		// coinCombination(coins, 10, 0, 0, "");
		//permutation(0, 4, 2, 0, "");
combinations(4, 0, 2, 0,"");
	}

	public static void permutations(boolean[] boxes, int titems, int citem, String asf) {
		if (citem == titems) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;

				permutations(boxes, titems, citem + 1, asf + "b" + i + "i" + citem + " ");
				boxes[i] = false;
			}
		}
	}

	public static void combination(boolean[] boxes, int titems, int citem, String asf, int lit) {
		if (citem == titems) {
			System.out.println(asf);
			return;
		}
		for (int i = lit + 1; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				combination(boxes, titems, citem + 1, asf + "b" + i + "i" + citem + " ", i);
				boxes[i] = false;
			}
		}

	}

	public static void coinpermutation(int[] coins, int amount, int psf, String asf) { // psf
																						// =
																						// paid
																						// so
																						// far
		if (psf == amount) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			if (psf + coins[i] <= amount) {
				coinpermutation(coins, amount, psf + coins[i], asf + coins[i]);
			}
		}
	}

	public static void coinCombination(int[] coins, int amount, int clp, int psf, String asf) { // coin
																								// use
																								// in
																								// last
																								// payment--clp
		if (psf == amount) {
			System.out.println(asf);
			return;
		}
		for (int i = clp; i < coins.length; i++) {
			if (psf + coins[i] <= amount) {
				coinCombination(coins, amount, i, psf + coins[i], asf + coins[i]);
			}
		}
	}

	public static void permutation(int boxes, int tboxes, int titems, int citem, String asf) {
		if (citem == titems) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < tboxes; i++) {
			if ((boxes & (1 << i)) == 0) {
				boxes = boxes ^ (1 << i);

				permutation(boxes, tboxes, titems, citem + 1, asf + "b" + i + "i" + citem + " ");
				boxes = boxes ^ (1 << i);

			}

		}

	}
	public static void combinations(int tboxes,int cbox,int titems,int citems,String asf){
		
		if (citems == titems) {
			System.out.println(asf);
			return;
		}
		if(cbox == tboxes){
			return;
		}
		
		combinations(tboxes, cbox+1, titems, citems+1, asf+"b"+cbox+"i"+citems);
		combinations(tboxes, cbox+1, titems, citems, asf);
		
	}

	}
	
