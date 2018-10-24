package july18;

public class octaladd {

	public static void main(String[] args) {
		int c1 = 7764;
		int c2 =  757;
		int c3 = 0;
		
		int carry = 0;
		int pv = 1;
		
		while (c1 != 0 || c2 != 0 || carry != 0){
			
			int q1 = c1 / 10;
			int r1 = c1 % 10;
			
			int q2 = c2 / 10;
			int r2 = c2 % 10;
			
			int d = r1 + r2 + carry;
			carry = d /8;
			d = d% 8;
			
			c3 = c3 + d* pv ;
			pv = pv * 10;
			
			c1 = q1;
			c2 = q2;
			
		}
		System.out.println(c3);
		
		
		
		
			
			
		}

	}

