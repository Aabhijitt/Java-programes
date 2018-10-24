package sept1;

import java.util.ArrayList;

public class target {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		targetset(arr, 70, 0, 0, new ArrayList<Integer>());
	}

	private static void targetset(int[] arr, int tar, int vidx, int setsum, ArrayList<Integer> set) {
		if (vidx == arr.length) {
			if (setsum == tar) {
				System.out.println(set);
			}
			return;
		}
		set.add(arr[vidx]);
		targetset(arr, tar, vidx + 1, setsum + arr[vidx], set);
		set.remove(set.size() - 1);
		targetset(arr, tar, vidx + 1, setsum, set);
	}
}
