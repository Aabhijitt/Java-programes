package AUG18;

public class boarddice {

	public static void main(String[] args) {
	    pbp(0, 10,"");
	}
	
	public static void pbp(int src, int dest,String psf){
		if (src == dest) {
			System.out.println(psf);
			return;
		}
		
		for(int dice =1;dice<=6;dice++){
			int i = src+dice;
			if(i <= dest){
			pbp(i,dest,psf+dice);
		}
	}

}
}
