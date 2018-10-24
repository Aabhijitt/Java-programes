package recursion;

public class findelemen {

	public static void main(String[] args) {
		
		int[] arr = {5,9,23,9,2,9,1,9};
		System.out.print(find(arr,9,0));

	}
	public static boolean find(int[]arr,int e,int i){ // e - data,i - index
		boolean k = find(arr,e,i - 1);
		if(k == true){
			return true;
		}
		else {
			if(arr[i] == e){
				return true ;
				
			}else
			{
				return false;
			}
		}
	}
}



