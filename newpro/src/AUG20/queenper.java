package AUG20;

public class queenper {

	public static void main(String[] args) {
		boolean[]boxes = new boolean[4];
		//queenPermutation(boxes, 1, 3, "");
        queencombination(boxes, 0, 1, 3, "");
	}
	/*public static void queenPermutation(boolean[] boxes,int qno,int tnq,String asf){
		if (qno > tnq){
			System.out.println(asf);
			return;
		}
		
		for(int i = 0;i<boxes.length;i++){
			if(boxes[i]==false){
				boxes[i]=true;
				queenPermutation(boxes, qno+1, 2, asf+"q"+qno+" "+"b"+i);
				boxes[i]=false;
			}
		}
		
	}*/
	public static void queencombination(boolean[] boxes,int bno,int qno,int tnq,String asf){
	
	if (qno > tnq){
		System.out.println(asf);
		return;
	}
	if (bno==boxes.length){
		return;
	}
			queencombination(boxes, bno+1,qno,tnq,asf );
			queencombination(boxes, bno+1, qno+1, tnq, asf+"q"+qno+""+"b"+bno);
			
		}
	}

	

