package AUG12;

import java.util.ArrayList;

public class stringsubce {

	public static void main(String[] args) {
     System.out.println(getss("abc"));
	}

	public static ArrayList<String>getss(String str) {
		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recresult = getss(ros);
		ArrayList<String> myresult = new ArrayList<>();
		for (String val : recresult) {
			myresult.add(val);
			myresult.add(ch + val);

		
		
		
	}
		return myresult;

}
}