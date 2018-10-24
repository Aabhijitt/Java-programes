package oct20;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQue {

	public static void main(String[] args) {
		int[] arr = { 30, 20, 10, 60, 50, 40, 80, 70 };
		// printksmallest(arr, 3);
		// printksmallestbet(arr, 3);
		kShorted(arr, 2);
	}

	public static void printksmallest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int val : arr) {
			pq.add(val);
		}
		for (int i = 0; i < k; i++) {
			System.out.println(pq.remove());
		}

	}

	public static void printksmallestbet(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);

		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] < pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		System.out.println(pq);
	}

	public static void kShorted(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < arr.length || pq.size() > 0; i++) {
			if (i <= k) {
				pq.add(arr[i]);

			} else if (i < arr.length) {
				System.out.println(pq.remove());
				pq.add(arr[i]);
			} else {
				System.out.println(pq.remove());
			}

		}
	}
}