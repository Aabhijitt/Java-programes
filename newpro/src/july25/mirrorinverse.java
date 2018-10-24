package july25;

import java.awt.CheckboxMenuItem;

public class mirrorinverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 0, 3, 1, 2 };
		checkMI(arr);
	}

	public static void checkMI(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (arr[temp] != i) {
				System.out.println("no");
				return;
			}
		}
		System.out.println(arr);

	}

}
