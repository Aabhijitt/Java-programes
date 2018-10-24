package AUG11;

public class fibonaci {

	public static void main(String[] args) {
	System.out.print(fib(10));

	}
	public static int fib(int n){
		
		if(n == 0||n==1){
			return n;
		}
			int fibonaci1 = fib(n-1);
			int fibonaci2 = fib(n-2);
			
			int fn = fibonaci1 + fibonaci2;
			
			return fn;
		
	}

}
