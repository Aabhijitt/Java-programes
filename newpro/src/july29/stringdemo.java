package july29;

public class stringdemo {

	public static void main(String[] args) {

//String s = "hello";
//System.out.println(s.length());
//System.out.println(s.charAt(4));

//System.out.println(s.substring(0, 2));
//System.out.println(s.substring(2));
		String s = "abcd";
		printAllSubstrings( "abcde");
    
	}
	public static void printAllCharOnSeparateLine(String s){
		for(int i = 0;i< s.length();i++){
			System.out.println(s.charAt(i));
		}
		
	}
public static void printAllSubstrings(String s){
	 for(int i = 0;i < s.length();i++){
		 for(int j= 1;j<=s.length();j++)
			 System.out.println(s.substring(i, j));
	 }
	
	
}
}
