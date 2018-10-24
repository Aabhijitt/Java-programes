package AUG18;

public class printsub {

	public static void main(String[] args) {
		printss("abc","");

	}

	public static void printss(String ques, String asf) {

		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printss(roq, asf);
		printss(roq, asf + ch);
	}

}
