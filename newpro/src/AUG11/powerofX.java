package AUG11;

public class powerofX {

	public static void main(String[] args) {
		System.out.println(power(2,4));
	}
	public static int power(int x,int n){
		if (n == 0){
			return 1;
		}
		int xpnm1 = power(x,n/2);
		int xpn = xpnm1 * xpnm1;
		
		if (n % 2 == 1){
			xpn = xpn * x ;
		}
		return xpn;
	}

}
