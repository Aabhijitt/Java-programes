package AUG12;

import java.util.ArrayList;

public class arrascii {

	public static void main(String[] args) {
		 System.out.println(getssAscii("ab"));
			}

			public static ArrayList<String>getssAscii(String str) {
				if (str.length() == 0) {
					ArrayList<String> bresult = new ArrayList<>();
					bresult.add("");
					return bresult;
				}
				char ch = str.charAt(0);
				String ros = str.substring(1);
				ArrayList<String> recresult = getssAscii(ros);
				ArrayList<String> myresult = new ArrayList<>();
				for (String val : recresult) {
					myresult.add(val);
					myresult.add(ch + val);
                    myresult.add((int)ch+ val);
                    
				
				
				
			}
				return myresult;

}
}
