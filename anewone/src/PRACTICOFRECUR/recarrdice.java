package PRACTICOFRECUR;

import java.util.ArrayList;

public class recarrdice {

	public static void main(String[] args) {
	System.out.println(getdice(0, 10).size());	

	}
	public static ArrayList<String> getdice(int src,int dest){
		if (src == dest) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		if(src > dest){
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		
		ArrayList<String> myres = new ArrayList<>();
		for(int dice = 1;dice<=6;dice++){
			int i = src + dice ; 
			ArrayList<String>  j = getdice(i, dest);
			
			for (String ir : j){
				myres.add(dice + ir);
			}
			
		}
		return myres;
	}

}
