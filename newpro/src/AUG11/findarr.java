 package AUG11;

public class findarr {

	public static void main(String[] args) {
		int[] arr = { 2, 9, 8, 7, 8, 3, 6, 4, 2, 8 };
		System.out.print(find(arr, 8, 0));
	}

	public static boolean find(int[] arr, int data, int vidx) {
		if(vidx == arr.length){
			return false;
			
		}
		if(arr[vidx]== data){
			return true;
		}else{
			boolean k = find(arr,data,vidx + 1);
			return k ;
			}

		}
	}

	
	

