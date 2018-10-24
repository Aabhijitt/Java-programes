package AUG18;

public class printssassc {

	public static void main(String[] args) {
		printssascii("abc","");

		}

		public static void printssascii(String ques, String asf) {

			if (ques.length() == 0) {
				System.out.println(asf);
				return;
			}
			char ch = ques.charAt(0);
			String roq = ques.substring(1);

			printssascii(roq, asf);
			printssascii(roq, asf + ch);
			printssascii(roq, asf+(int)ch);
	}

}
