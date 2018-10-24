package oct1;

import java.util.LinkedList;

public class clint {

	public static void main(String[] args) {
		genericTree gt = new genericTree(new int[] { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1,
				90, -1, -1, 40, 100, -1, -1, -1 });
		     //  gt.display();
		// System.out.println(gt.size2());
		// System.out.println(gt.max());
		//System.out.println(gt.height());
		//System.out.println(gt.find(110));
//	       System.out.println(gt.nodeToRootPath(20));
//System.out.println(gt.lca(70, 110));
//System.out.println(gt.distanceBTWNodes(70,110));

//gt.display();
//gt.mirror();
//gt.display();

//gt.display();
//gt.removetheleaf();
//gt.display();

//gt.preo();
//gt.display();
		       
		// gt.lowlo();
		// gt.display();
		       
		    //   gt.lowerzig();
		//gt.lvllineariz();
		//gt.display();
	//	gt.linear2();
		//gt.display();
		genericTree gt1 = new genericTree(new int[] { 1, 2, 5, -1, 6, -1, -1, 3, 7, -1, 8, 11, -1, 12, -1, -1,
				9, -1, -1, 4, 10, -1, -1, -1 });
		     System.out.println(gt1.areIsomorphic(gt1));
		     
		     System.out.println(gt1.areMirrorimage(gt1));
		   }

	}


