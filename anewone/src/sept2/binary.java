package sept2;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		int[] arr = { 10,20,30,44,60,78,99};

		
		int n = 44;

		int low = 0;

		int high = arr.length -1;
		
		while(low <= high){
			int mid = (low+high)/2;
			if(n > arr[mid]){
				low = mid+1;
			}else if(n < arr[mid]){
				high = mid - 1;
			}else{
				System.out.println(mid);
				return;
			}
		}
		System.out.println(-1);
	}

}
