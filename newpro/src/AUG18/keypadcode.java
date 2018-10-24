package AUG18;

public class keypadcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printsskpc("579", "");
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mnop", "qrs", "tuv", "wx", "yz" };

	public static void printsskpc(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String options = codes[ch - '0'];

		for (int i = 0; i < options.length(); i++) {

			printsskpc(roq, asf + options.charAt(i));

		}

	}
}
