package sept1;

import java.util.Scanner;

public class celcius {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the min");
		int min = scn.nextInt();
		System.out.println("Enter the step");
		int step = scn.nextInt();
		System.out.println("Enter the max");
		int max = scn.nextInt();
		for (int far = min; far <= max; far = far + step) {
			int cel = (int) ((5d / 9) * (far - 32));
			System.out.println(far + " " + cel);
		}

	}

}
