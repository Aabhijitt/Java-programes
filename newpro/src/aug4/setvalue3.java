package aug4;

public class setvalue3 {

	public static void main(String[] args) {
		String s = comprese2("aaabbbaaaccdddeffghh");
		System.out.println(s);
	}

	public static String comprese2(String str) {
		StringBuilder sb = new StringBuilder();

		int Count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i + 1);

			if (ch1 != ch2) {
				sb.append(ch1);
				if (Count > 1) {
					sb.append(Count);
					Count = 1;
				}
			} else {
				Count++;
			}

		}
		sb.append(str.charAt(str.length() - 1));
		sb.append(Count);

		return sb.toString();

	}
}
