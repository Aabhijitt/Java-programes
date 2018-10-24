package AUG20;

public class quencom {

	public static void main(String[] args) {
		boolean[]boxes = new boolean[4];
		queencombination(boxes, 1, 3, -1, "");
	}
		public static void queencombination(boolean[] boxes,int qno,int tnq,int plqbno,String asf){
			if (qno > tnq){
				System.out.println(asf);
				return;
			}
			
			for(int qnox =plqbno +1;qnox<boxes.length;qnox++){
				if(boxes[qnox]==false){
					boxes[qnox]=true;
					queencombination(boxes, qno+1, 2,qnox, asf+"q"+qno+""+"b"+qnox);
					boxes[qnox]=false;
				}
			}
			
		}

	

	}


