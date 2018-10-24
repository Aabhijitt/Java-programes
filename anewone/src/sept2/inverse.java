package sept2;

public class inverse {

	public static void main(String[] args) {
		int[] arr = { 3,4,1,0,2};
		int[] inv = new int[arr.length];
		
		for(int i = 0;i < arr.length;i++){
			int val = arr[i];
			inv[val] = i;
		}
		for(int val:inv){
			System.out.println(val+" ");
	}

}
}
