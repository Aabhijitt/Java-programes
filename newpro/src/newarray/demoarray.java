package newarray;

public class demoarray {

	public static void main(String[] args) {
		int [] arr = {11,55,22,66,33};
		 int max = arr[0];
		
		 for (int i = 1; i < arr.length;i++){
			 if(arr[i]> max){
				 max = arr[i];
			
				 
			 }
		 }
		System.out.println(max);
		
		   
	
		
	}

}
