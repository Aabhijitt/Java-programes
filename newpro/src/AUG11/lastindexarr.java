package AUG11;

public class lastindexarr {

	public static void main(String[] args) {
		int[] arr = { 2, 9, 8, 7, 8, 3, 6, 4, 2, 8 };
		System.out.print(lastindex(arr, 8, 0));

	}

	public static int lastindex(int[] arr, int data, int vidx) {
		
		if(vidx == arr.length){
			return -1;
		}
		int k = lastindex(arr, data, vidx + 1);
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

}
