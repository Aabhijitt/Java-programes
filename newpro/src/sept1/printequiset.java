package sept1;

import java.util.ArrayList;

public class printequiset {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		printEquisets(arr, 0, 0, new ArrayList<Integer>(), 0, new ArrayList<Integer>());
	}

	private static void printEquisets(int[] arr, int vidx, int setsum1, ArrayList<Integer> set1, int setsum2,
			ArrayList<Integer> set2) {
		if (vidx == arr.length) {
			if (setsum1 == setsum2) {
				System.out.println(set1 + " & " + set2);
			}
			return;

		}
		set1.add(arr[vidx]);
		printEquisets(arr, vidx + 1, setsum1 + arr[vidx], set1, setsum2, set2);
		set1.remove(set1.size() - 1);

		set2.add(arr[vidx]);
		printEquisets(arr, vidx + 1, setsum1, set1, setsum2 + arr[vidx], set2);
		set2.remove(set2.size() - 1);
	}
}
