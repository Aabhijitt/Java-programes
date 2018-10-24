package july25;

public class kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 2, -9, 1, 3, 7, -2, 5, -15, 4 };

		int csum = arr[0];
		int cstart = 0;
		int cend = 0;

		int osum = arr[0];
		int ostart = 0;
		int oend = 0;

		for (int i = 0; i < arr.length; i++) {

			if (csum > 0) {
				csum += arr[i];
				cend++;
			} else {

				csum = arr[i];
				cstart = cend = i;
			}
			if (csum > osum) {
				osum = csum;
				ostart = cstart;
				oend = cend;
			}

		}

		for (int i = ostart; i <= oend; i++) {
			System.out.println(arr[i]);
		}
	}
}
