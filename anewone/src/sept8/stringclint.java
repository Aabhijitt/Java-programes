package sept8;

public class stringclint {

	public static void main(String[] args) {
		String s = "abccbc";
		//String s = "malayalam";
		// String s = "abcd";
		// printChars(s);
		// printss(s);
		//System.out.println(isPalindrome(s));
	    printAllPalindromicss(s);
	}

	public static void printChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}

	public static void printss(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	public static boolean isPalindrome(String s) {
		int l = 0;
		int r = s.length() - 1;
		while (l <= r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;

		}
		return true;

	}

	public static void printAllPalindromicss(String s){
		for(int i = 0;i < s.length();i++){
			for(int j = i+ 1;j <=s.length();j++){
				String ss = s.substring(i, j);
				boolean palindromic = isPalindrome(ss);
				if(palindromic== true){
					System.out.println(ss);
				}
			}
		}
	}
	
}
