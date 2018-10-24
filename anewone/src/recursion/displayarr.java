package recursion;

public class displayarr {

	public static void main(String[] args) {
		int[]arr = {5,3,9,12};
		display(arr,0);
		}
	public static void display(int[]arr,int i){   // i -index
		if(i == arr.length){
			return ;
		}
		System.out.println(arr[i]);
		display(arr,i+1);
	}

}
