package sept1;

public class abcper {

	public static void main(String[] args) {
		abcpermutation("abcd", "");
	}

	private static void abcpermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String res = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			
			String left = ans.substring(0, i);
			String right = ans.substring(i);
			
			abcpermutation(res, left+ch+right);
		}

	}

}
