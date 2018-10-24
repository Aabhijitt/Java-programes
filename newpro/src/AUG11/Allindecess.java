package AUG11;

public class Allindecess {

	public static void main(String[] args) {
		
	}
	public static int allind(int[]arr,int data,int vidx,int count){
		if(vidx == arr.length){
			return count;
		}
		if(arr[vidx] ==data){
			allind(arr,data,vidx +1,count+1);
		}else{
			allind(arr,data,vidx+1,count);
		}
		return count;
		
		
		
		
	}

}
