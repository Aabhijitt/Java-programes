package sept9;

public class recursion1 {

	public static void main(String[] args) {
printskip(5);
	}
public static void printskip(int n){
	if(n==0){
		return;
	}
	if(n % 2 == 1){
	System.out.println(n);
	}
	printskip(n-1);
	
	if(n %2 ==0){
	System.out.println(n);
	}
	
	
	
}
}
