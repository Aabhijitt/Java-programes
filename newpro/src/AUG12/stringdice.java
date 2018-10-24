package AUG12;

import java.util.ArrayList;

public class stringdice {

	public static void main(String[] args) {

		ArrayList<String> finalarray =  getBP(2, 10);
		System.out.println(finalarray);

	}

	public static ArrayList<String> getBP(int src, int dest) {
		if (src == dest) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		if (src > dest) {
			ArrayList<String> bresult = new ArrayList<>();
			return bresult;
		}
		ArrayList<String> myresult = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			int inter = src + dice;
			ArrayList<String> pitod = getBP(inter, dest);

			for (String itod : pitod) {
				myresult.add(dice + itod);

			}

		}
		return myresult;
	}
}
