package recursion;

public class larelement {

	public static void main(String[] args) {
		int[] arr = {5,9,23,9,2,9,1,9};
	System.out.print(max(arr,0));
	}
		
		public static int max(int[]arr,int i){
			if(i == arr.length-1){
				return i;
			}
			int k = max(arr,i+1); //k is max of small array
			if(k > arr[i]){
				return k;
			}
			else{
				return arr[i];
			}
		}
	}


