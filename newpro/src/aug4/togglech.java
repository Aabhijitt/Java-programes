package aug4;

public class togglech {

	public static void main(String[] args) {
		String s = toggleChars("aBZdNmk");
		System.out.println(s);

	}

	public static String toggleChars(String str) {

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 'a' + 'A');
				sb.setCharAt(i,ch);
			} else {
				ch = (char) (ch - 'A' + 'a');
				sb.setCharAt(i,ch);
			}
		}

		return sb.toString();

	}

}
