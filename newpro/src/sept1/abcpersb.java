package sept1;

public class abcpersb {

	public static void main(String[] args) {
		abcpermutationsb(new StringBuilder("abc"), new StringBuilder(""));
	}

	private static void abcpermutationsb(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		ques.deleteCharAt(0);
		for (int i = 0; i <= ans.length(); i++) {
			ans.insert(i, ch);
			abcpermutationsb(ques, ans);
			ans.deleteCharAt(i);

		}
		ques.insert(0, ch);

	}
}
