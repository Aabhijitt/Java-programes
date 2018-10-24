package newarray;

public class linearsearch {

	public static void main(String[] args) {
		int[] arr = {11,55,22,88,9,13,6};
		int data = 88;
		int i=0;
		
		for(i= 0; i<arr.length; i++){
			if(arr[i]==data){
				System.out.println(i);
				return;
			}
			
			}
		
			System.out.println("not found");
		
		

	}

}
