package sept1;

public class anotherpermabab {

	public static void main(String[] args) {
      ababques1("abc","");
	}
	private static void ababques1(String ques,String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		boolean[] dupli = new boolean[26];
		for(int i = 0;i < ques.length();i++){
			char ch = ques.charAt(i);
			if(dupli[ch - 'a'] == false){
				dupli[ch - 'a'] = true;
				String left = ques.substring(0, i);
				String right = ques.substring(i+1);
				ababques1(left+right, ans+ch);
			}
			
			
	}

}
}