package sept15;

public class disarr {

	public static void main(String[] args) {
		int[] arr = { 2, 8, 19, 33, 8, 64, 8, 7 };
		int[] idces = allIndices(arr, 8, 0,0);
		for(int val : idces){
			System.out.println(val);
		}
		//System.out.println(allIndices(arr, 8, 0, 0));
		// int[] arr = { 12, 15, 23, 56, 77 };
		// display(arr, 0);
		// displayr(arr, 0);
		// System.out.println(max(arr, 0));
		// System.out.println(find(arr,23 , 0));
		// System.out.println(firstIndex(arr,15,0));
		// System.out.println(LastIndex(arr, 12, 0));
	}

	public static void display(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}
		System.out.println(arr[vidx]);
		display(arr, vidx + 1);
	}

	public static void displayr(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}
		displayr(arr, vidx + 1);
		System.out.println(arr[vidx]);
	}

	public static int max(int[] arr, int vidx) {
		if (vidx == arr.length - 1) {
			return arr[vidx];
		}
		int i = max(arr, vidx + 1);// i is the max in smaller array

		if (i > arr[vidx]) {
			return i;
		} else {
			return arr[vidx];
		}
	}

	public static boolean find(int[] arr, int data, int vidx) {
		if (vidx == arr.length) {
			return false;

		}
		if (arr[vidx] == data) {
			return true;
		} else {
			boolean k = find(arr, data, vidx + 1);
			return k;
		}
	}

	public static int firstIndex(int[] arr, int data, int vidx) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == data) {
			return vidx;
		} else {
			int k = firstIndex(arr, data, vidx + 1);
			return k;
		}

	}

	public static int LastIndex(int[] arr, int data, int vidx) {
		if (vidx == arr.length) {
			return -1;
		}
		int k = LastIndex(arr, data, vidx + 1);
		if (k != -1) {
			return k;
		} else {
			if (arr[vidx] == data) {
				return vidx;
			} else {
				return -1;
			}
		}
	}

	public static int[] allIndices(int[] arr, int data, int vidx, int csf) {
		if(vidx == arr.length){
			int [] ba = new int[csf];
			return ba;
		}
		if (arr[vidx] == data) {
			int[] res = allIndices(arr, data, vidx + 1, csf+ 1);
			res[csf]= vidx;
			return res;

		} else {
			
			int[] res = allIndices(arr, data, vidx + 1, csf);
		
		return res;
	}
	
}
}
