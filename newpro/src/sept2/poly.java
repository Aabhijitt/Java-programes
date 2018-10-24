package sept2;

import java.util.Arrays;

public class poly {

	public static void main(String[] args) {
		// int[]arr = {5,2,18,18,3,2,5,7};
		// int[] arr = {15,6,8,6,15,3,8};
		// int [] arr = {5,2,0,0,9,0,8,0,6,0,0,7};
		// polynomialvalue(2, 3);
		 highestfrequency("abbbccaacddaacd");
		// reorder(arr);
		// unique(arr);
		// doubleunique(arr);
		//soe(100);
	}

	public static void polynomialvalue(int x, int n) {
		int sum = 0;
		int power = 1;
		for (int co = n; co >= 1; co--) {
			power = power * x;
			sum += co * power;
		}
		System.out.println(sum);
	}

	public static void highestfrequency(String str) {
		int[] fmap = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			fmap[ch - 'a']++;
		}
		int maxfi = 0;
		for (int i = 0; i < fmap.length; i++) {
			if (fmap[i] > fmap[maxfi]) {
				maxfi = i;
			}
		}
		System.out.println((char)(maxfi + 'a'));

	}

	public static void reorder(int[] arr) {
		int nz = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == 0) {
				i++;
			} else {
				swap(arr, i, nz);
				i++;
				nz++;
			}
		}

		for (int val : arr) {
			System.out.println(val + " ");
		}
	}

	private static void swap(int[] arr, int i, int nz) {
		int temp = arr[i];
		arr[i] = arr[nz];
		arr[nz] = temp;
	}

	public static void unique(int[] arr) {
		int uni = 0;
		for (int val : arr) {
			uni ^= val;
		}
		System.out.println(uni);

	}

	public static void doubleunique(int[] arr) {
		int xXORy = 0;
		for (int val : arr) {
			xXORy ^= val;
		}
		int rsbm = xXORy & -xXORy;
		int x = xXORy;
		int y = xXORy;
		for (int val : arr) {
			if ((val & rsbm) == 0) {
				x ^= val;
			} else {
				y ^= val;
			}
		}
		System.out.println(x + " " + y);
	}

	public static void soe(int n) {
		boolean[] primes = new boolean[n + 1];

		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (primes[i] == true) {
				for (int j = i; i * j <= n; j++) {
					primes[i * j] = false;
				}
			}
		}
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			}
		}
	}
}
