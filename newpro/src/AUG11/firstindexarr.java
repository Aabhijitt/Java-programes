package AUG11;

public class firstindexarr {

	public static void main(String[] args) {
		int[] arr = { 2, 9, 8, 7, 8, 3, 6, 4, 2, 8 };
		System.out.print(firstindex(arr, 8, 0));

	}
	public static int firstindex(int[]arr,int data , int vidx){
		
		if(vidx == arr.length){
			return -1;
		}
		if (arr[vidx] == data){
			return vidx;
		}else
		{
			int k =firstindex(arr, data, vidx + 1);
			return k ;
		}
	}

}
