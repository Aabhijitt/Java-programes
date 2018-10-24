package PRACTICOFRECUR;

import java.util.ArrayList;

public class subascii {

	
		public static void main(String[] args) {
			
			System.out.println(getssascii("abc"));
				}
				public static ArrayList<String> getssascii(String str){
					if(str.length()==0){
						ArrayList<String> bres = new ArrayList<>();
						bres.add("");
						return bres;
					}
					
					char ch = str.charAt(0);
					String roc = str.substring(1);
					
					ArrayList<String> recres = getssascii(roc);
					ArrayList<String> myresult = new ArrayList<>();
					
					for(String  rec : recres){
					myresult.add(rec);
					myresult.add(ch + rec);
					myresult.add((int)(ch) +rec);
				}

				    return myresult;

	}

}
