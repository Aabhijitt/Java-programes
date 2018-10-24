package july29;

public class stringtest1 {

	public static void main(String[] args) {
		String s = "abccdeef";
		printAllpalindromicSS("abccdeef");
	}

	public static void printAllpalindromicSS(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				boolean res = IsPalindrome(ss);
				if (res == true) {
					System.out.println(ss);
				}
			}
		}
	}

	public static boolean IsPalindrome(String s) {
		boolean res = true;
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				res = false;
				break;
			}

			left++;
			right--;

		}

		return res;
	}

}
