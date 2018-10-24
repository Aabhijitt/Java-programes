package sept2;

public class reverse {

	public static void main(String[] args) {
		int[] arr = { 10,20,30,44,60,78,99};
		
		int l = 0;
		int r = arr.length-1;
		while(l<=r){
			int temp = arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			
			l++;
			r--;
		}
		for(int val:arr){
			System.out.println(val+" ");
		}
	}

	
		
		
	}


