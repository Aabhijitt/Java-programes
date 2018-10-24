package AUG25NEW;

public class bintodec {

	public static void main(String[] args) {
		int bin =111001;
		 int dec = 0;
		 int p = 1;
		 while(bin!=0){
			 int rem = bin % 10 ;
			 bin = bin /10;
			 dec = dec + rem *p ;
			 p = p * 2;
		}
			
			System.out.println(dec);
	}
	}
