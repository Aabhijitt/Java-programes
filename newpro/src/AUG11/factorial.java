package AUG11;

public class factorial {

	public static void main(String[] args) {
		System.out.println(fac(5));

	}
	public static int fac(int n){
		if (n == 0){
			return 1;
		}
		int fnm1 =fac(n-1);
		int fn = n* fnm1;
		return fn;
	}

}
