package aug4;

public class modifychar {

	public static void main(String[] args) {
		String s =modify1("bdcnm") ;
		System.out.println(s);
		
	}

	public static String modify1(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);

			if (i % 2 == 0) {
				ch = (char) (ch - 1);
				sb.setCharAt(i, ch);
			} else {
				ch = (char) (ch + 1);
                 sb.setCharAt(i, ch);
			}
		}
		return sb.toString();

	}
}
