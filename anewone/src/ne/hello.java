package ne;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i <= n; i++) {
             System.out.println();
			for (int j = 1; j <=n- i; j++)
				System.out.print(j+" ");
			for (int j = 0; j < 2 * i; j++)
				System.out.print("  ");
			for (int j = n - i; j > 0; j--)
				System.out.print(j+" ");
		}
	}
}
