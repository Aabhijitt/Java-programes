package AUG18;

public class snakeladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] snl = new int[29];
        snl[3] = 19 ; 
        snl[9] = 24;
        snl[26] = 2;
        snl[20] = 4;
        
        int[] moves = {2,6,6,5,3,6,5,1,6,4,3,1,4};
        pbpWithsnkldr(0, 28, snl, moves, 0);
		  
	}
	public static void pbpWithsnkldr(int src, int dest, int[]snl,int[]moves,int midx) {
		if(src == dest){
			System.out.println("true");
			return;
		}
		if (midx >=moves.length){
			System.out.println("false");
			return;
		}
		if (src ==0){
			
			if(moves[midx] == 1 || moves[midx] == 6){
			pbpWithsnkldr(1, dest, snl, moves, midx+1);
		}else{
			pbpWithsnkldr(0, dest, snl, moves, midx+1);
		}
		}
		else{
			if(src+moves[midx]> dest){
				pbpWithsnkldr(src, dest, snl, moves, midx+1);
			}else{
				int inter = src +moves[midx];
				
				if(snl[inter] == 0){
					pbpWithsnkldr(inter, dest, snl, moves, midx+1);
				}else{
					pbpWithsnkldr(snl[inter], dest, snl, moves, midx+1);
					
					
				}
			}
			
			
		}
}
		
	}

