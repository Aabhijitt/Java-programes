package july18;

public class uctalsub {

	public static void main(String[] args) {
		
		int o1 = 10743;
		int o2 = 757;
		int o3 = 0;
		
		int b = 0;
		int pv = 1;
		while(o1 !=0 || o2 !=0 || b !=0){
			
			int r1 = o1 % 10;
			int r2 = o2 % 10;
			
			o1 = o1 / 10;
			o2 = o2 / 10;
			
			r1 = r1 - b;
			int d = 0;
			if (r1 >= r2){
				d = r1 - r2;
				b = 0;
			}
			else {
				
				d = r1 + 8 - r2;
				b = 1;
			}
			o3 = o3 + d* pv;
			pv = pv * 10;
		}
		System.out.println(o3);

	}

}
