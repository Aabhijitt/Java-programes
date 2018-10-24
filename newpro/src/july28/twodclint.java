package july28;

public class twodclint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [][] arr = {
    		
    		{10,11,12,13},
    		{21,22,23,24},
    		{31,32,33,34}
    };
    		System.out.print(arr.length);
    		System.out.println(arr[0].length);
    		display(arr);
    }

	private static void display(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[0].length; column++) {
			
			System.out.print(arr[row][column]+" ");
			}
			System.out.println();
		}

	}
}
