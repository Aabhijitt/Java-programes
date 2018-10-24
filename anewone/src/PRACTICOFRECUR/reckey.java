package PRACTICOFRECUR;

import java.util.ArrayList;

public class reckey {

	public static void main(String[] args) {
		System.out.print(getkpc("579"));
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mnop", "qrs", "tuv", "wx", "yz" };

	public static ArrayList<String>getkpc(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}

		char ch = str.charAt(0);
		String roc = str.substring(1);

		ArrayList<String> recres = getkpc(roc);
		ArrayList<String> myresult = new ArrayList<>();

		for (String rec : recres) {
			String chcode = codes[ch - '0'];

			for (int i = 0; i < chcode.length(); i++) {
				
				myresult.add(chcode.charAt(i) + rec);
			}

		}
		return myresult;
	}
}