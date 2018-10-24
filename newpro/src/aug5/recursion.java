package aug5;

public class recursion {

	public static void main(String[] args) {
		
   printdecreseincrease(5);
	}
	public static void printdecreseincrease(int n){
		if(n == 0){
			return;
		}
		System.out.println(n);
		printdecreseincrease(n-1);
		System.out.println(n);
	}

}
