package sept1;

public class abcperque {

	public static void main(String[] args) {
		//abcques("abcd", "");
		abcquessb(new StringBuilder("abc"), new StringBuilder(""));
		}
	private static void abcques(String ques,String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		for(int i = 0;i < ques.length();i++){
			char ch = ques.charAt(i);
			String left = ques.substring(0, i);
			String right = ques.substring(i+1);
			String roq = left + right;
		    abcques(roq, ans+ch);
		}
	}
	
	private static void abcquessb(StringBuilder ques,StringBuilder ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		for(int i = 0;i < ques.length();i++){
			char ch = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			abcquessb(ques, ans);
			ans.deleteCharAt(ans.length() - 1);
			ques.insert(i, ch);
	}
}
}
