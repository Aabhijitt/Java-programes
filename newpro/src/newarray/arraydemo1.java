package newarray;

import java.util.Arrays;

public class arraydemo1 {

	public static void main(String[] args) {
		 int[] arr;

	        arr = new int[4];
	        
	        arr[0] = 46;
	        arr[1] = 79;
	        arr[2] = 99;
	        arr[3] = 36;


	        System.out.println(Arrays.toString(arr));

	        
	        //stem.out.println(arr[0]);
	        //ystem.out.println(arr[1]);
//	        //ystem.out.println(arr[2]);
	        //ystem.out.println(arr[3]);
	        System.out.println(arr.length);
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
	}

}
