package recursion;

public class reconreverse {

	public static void main(String[] args) {
		int[]arr = {5,3,9,12};
		displayreverse(arr,0);
		}
	public static void displayreverse(int[]arr,int i){
		if(i == arr.length){
			return ;
		}
		displayreverse(arr,i+1);

		System.out.println(arr[i]);
		
	}

}
