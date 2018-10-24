package AUG11;

public class maxarr {

	public static void main(String[] args) {
		int[] arr = {5,9,4,3,12,4,8};
		System.out.print(max(arr,0));
		}
			
			public static int max(int[]arr,int vidx ){
				if(vidx == arr.length-1){
					return arr[vidx];
				}
				int i = max(arr,vidx+1); //i is max of small array
				if(i > arr[vidx]){
					return i;
				}
				else{
					return arr[vidx];
				}
			}
		}