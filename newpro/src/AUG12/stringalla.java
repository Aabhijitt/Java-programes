package AUG12;

import java.util.ArrayList;

public class stringalla {

	public static void main(String[] args) {

		System.out.println(getKPC("784"));
	}

	static String[] codes = { ".;", "abc", "de", "fghi", "jkl", "mn", "opq", "rstu", "vw", "xyz" };

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recresult = getKPC(ros);
		ArrayList<String> myresult = new ArrayList<>();
		for (String val : recresult) {
			String code = codes[ch - '0'];
			for (int i = 0; i < code.length(); i++) {
				char chcode = code.charAt(i);
				myresult.add(chcode + val);
			}

		}
		return myresult;
	}
}
