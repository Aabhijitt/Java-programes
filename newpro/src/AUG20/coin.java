package AUG20;

public class coin {

	public static void main(String[] args) {
		int[] coins = { 2, 3, 5, 6 };
		coinChange(coins, 10, 0, "");
		//coinChangecombi(coins, 10, 0, 0, "");
	}

	static int count = 0;

	public static void coinChange(int[] coins, int amt, int psf, String asf) {   //paid so far
		if (psf == amt) {                                                           // ans so far
			count++;
			System.out.println(count + "." + asf);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			if (psf + coins[i] <= amt) {
				coinChange(coins, amt, psf + coins[i], asf + coins[i]);

			}

		}

	}
	public static void coinChangecombi(int[] coins, int amt,int ipo, int psf, String asf) {
		if (psf == amt) {
			count++;
			System.out.println(count + "." + asf);
			return;
		}
		for (int i = ipo; i < coins.length; i++) {
			if (psf + coins[i] <= amt) {
				coinChangecombi(coins, amt,i, psf + coins[i], asf + coins[i]);

			}

		}
	
}
}
