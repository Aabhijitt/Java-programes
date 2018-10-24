package aug4;

public class setvalue1 {

	public static void main(String[] args) {
		String s = comprese1("aaabbbaaaccdddeffghh") ;
		System.out.println(s);
	}
	public static String comprese1(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length()-1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			
			if(ch1 != ch2){
				sb.append(ch1);
				
			}
			sb.append(str.charAt(str.length() - 1));
			
			

}
		return sb.toString();
		
	}
}
