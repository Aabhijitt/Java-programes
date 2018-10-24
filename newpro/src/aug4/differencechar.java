package aug4;

public class differencechar {

	public static void main(String[] args) {
		String s = modify2("bdcnm");
		System.out.println(s);

	}

	public static String modify2(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length() - 1; i++) {
			char chat = str.charAt(i);
			char chatp1 = str.charAt(i + 1);

			sb.append(chat);
			sb.append(chatp1 - chat);
		}
		sb.append(str.charAt(str.length() - 1));
		return sb.toString();

	}

}
