package july25;

import java.util.Currency;

public class sumsubarray {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, -9, 1, 3, 7, -2, 5, -14, 4 };
		print(arr);
	}

	private static void print(int[] arr) {
		int SASummax = 0;
		int SAStartmax = 0;
		int SAEndmax = 0;

		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				int sum = getsumSAFromstarttoend(arr, start, end);
				if (sum > SASummax) {
					SASummax = sum;
					SAStartmax = start;
					SAEndmax = end;
				}
			}
		}

		System.out.println("enter  largest sum of a subarray is " + SASummax);
		System.out.println("content of the largest  sum  subarray are : ");
		printSAFromStartToEnd(arr, SAStartmax, SAEndmax);

	}

	private static int getsumSAFromstarttoend(int[] arr, int start, int end) {

		int sum = 0;
		for (int i = start; i <= end; i++) {

			sum = sum + arr[i];
		}

		return sum;
	}

	private static void printSAFromStartToEnd(int[] arr, int SAStartmax, int SAEndmax) {
		for (int i = SAStartmax; i <= SAEndmax; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
