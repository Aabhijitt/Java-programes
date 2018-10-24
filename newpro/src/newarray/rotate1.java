package newarray;

public class rotate1 {

	public static void main(String[] args) {
		int[] arr ={10,20,30,40,50,60,70,80,90};
		
			int d = 3;
			
			
			
			display(arr);
			rotate(arr, d);
	}
	
	private static void display(int[] arr){
		for(int i=0; i< arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
}
		private static void rotate(int[] arr, int d){
			
			reverse(arr, 0, arr.length - 1 - d);
			reverse(arr, arr.length - d,arr.length-1);
			reverse(arr,0,arr.length-1);
			
	}
		private static void reverse(int[] arr,int  start,int end) {
			
			int left = start;
			int right = end;
			
			while (left <= right) {
				
				swap(arr,left,right);
				 left++;
				 right--;
				 
			}
		}
		private static void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
				
				
				
			}
		}
	

	


