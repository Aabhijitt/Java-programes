package oct6;

import java.util.Arrays;

public class timecomsp {

	public static void main(String[] args) {
		// System.out.println(polyval(2, 3));
		// int[] one = { 10, 20, 30, 40, 50 };
		// int[] two = { 11, 15, 19, 25, 35, 55, 65, 75, 85 };
		// int[] res = merge(one, two);
		//
		// for (int val : res) {
		// System.out.println(val + " ");

		// int[] arr = { 2, 9, 8, 3, 6, 4, 10, 7 };
		// int[] arr1= mergesort(arr, 0, arr.length - 1);
		// for (int val : arr1) {
		// System.out.println(val);

		// int[] arr = { 10, 5, 28, 27, 9, 22, 17 };
		// Quickshort(arr, 0, arr.length - 1);
		// for (int val : arr) {
		// System.out.print(val + " ");
		//
		// }
		// System.out.println(".");

		// int[] arr = { 0, 1, 2, 2, 2, 1, 0, 1, 0, 2, 1 };
		// Sort2(arr);
		// for (int val : arr) {
		// System.out.print(val);
		//soe(30);
		highestFrequencychar("aaabbababababcdccchdd");
	}

	public static int[] merge(int[] one, int[] two) {
		int[] res = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				res[k] = one[i];
				i++;
				k++;
			} else {
				res[k] = two[j];
				j++;
				k++;
			}

		}
		while (i < one.length) {
			res[k] = one[i];
			i++;
			k++;

		}
		while (j < two.length) {
			res[k] = two[j];
			j++;
			k++;
		}
		return res;

	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}
		int mid = (lo + hi) / 2;
		int[] fhalf = mergesort(arr, lo, mid);
		int[] shalf = mergesort(arr, mid + 1, hi);
		int[] sorted = merge(fhalf, shalf);

		return sorted;
	}

	public static int partition(int[] arr, int lo, int hi, int pivot) {
		int p = lo;
		int i = lo;
		while (i <= hi) {
			if (arr[i] > pivot) {
				i++;
			} else {
				swap(arr, i, p);
				i++;
				p++;
			}
		}
		return p - 1;
	}

	public static void Quickshort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pi = partition(arr, lo, hi, arr[hi]);
		Quickshort(arr, lo, pi - 1);
		Quickshort(arr, pi + 1, hi);

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void Sort2(int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < arr.length) {
			if (arr[k] == 2) {
				k++;
			} else if (arr[k] == 1) {
				swap(arr, j, k);
				k++;
				j++;
			} else {
				swap(arr, j, k);
				k++;
				swap(arr, j, i);
				i++;
				j++;
			}
		}

	}

	public static int polyval(int x, int n) {
		int sum = 0;
		int coeff = n;
		int px = x;
		while (coeff >= 1) {
			sum += coeff * px;
			coeff--;
			px *= x;
		}
		return sum;
	}

	public static void soe(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == true) {
				for (int j = i; i * j <= n; j++) {
					prime[i * j] = false;
				}

			}
		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i]) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void highestFrequencychar(String word){
	int[] arr = new int [26];
	for(int i = 0;i < word.length();i++){
	char ch = word.charAt(i);
	arr[ch - 'a']++;
	
		
	}
	int max = 0;
	for(int i = 1;i < arr.length;i++){
		if(arr[i] > arr[max]){
			max = i;
		}
	}
	System.out.println((char)(max+'a'));
}
}
