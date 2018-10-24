package sept2;

public class sorts {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 0, 1, 1, 0, 0, 1, 2, 0 };

		
		//sortss(arr);

		display(arr);
	}

	

	public static void display(int[] arr) {

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			}
			private static void sortsS(int[] arr){
				int z = 0;
				int o = 0;
				int t = 0;
				
				while(t < arr.length){
					if(arr[t]==2){
						t++;
					}else 
						if(arr[t]==1){
							swap(arr,t,o);
							o++;
							t++;
						}
						else 
							if(arr[t]==0){
								swap(arr,t,o);
								t++;
								swap(arr,o,z);
								o++;
								z++;
								
							}
				}
				
				
			}
	private static void swap(int[] arr, int o, int t) {
		int temp = arr[o];
		arr[o] = arr[t];
		arr[t] = temp;			
	}

			}
		
	

