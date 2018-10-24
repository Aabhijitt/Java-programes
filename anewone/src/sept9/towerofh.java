package sept9;

public class towerofh {

	public static void main(String[] args) {
		//tohhigh("A", "B", "C", 3);
		//System.out.println(factorial(5));;
		//System.out.println(power(2, 4));
		System.out.println(powers(2, 4));
	}

	public static void tohhigh(String src, String dest, String help, int n) {
		if (n == 0) {
			return;
		}

		tohhigh(src, help, dest, n - 1);
		System.out.println("move" + n + "th disc from" + src + "to" + dest);
		tohhigh(help, dest, src, n - 1);
	}

public static int factorial(int x){
	if(x==0){
		return 1;
		
	}
	
	int fnm1 = factorial(x-1);
	int fn = x * fnm1;
	return fn;
	
	
}
public static int power(int x,int n){
	if(n==0){
		return 1;
	}
	int xpnm1 = power(x, n-1);
	int xpn = x * xpnm1;
	return xpn;
}
public static int powers(int x,int n){
	if (n == 0){
		return 1;
	}
	int xpnm1 = powers(x,n/2);
	int xpn = xpnm1 * xpnm1;
	
	if (n % 2 == 1){
		xpn = xpn * x ;
	}
	return xpn;
}
}