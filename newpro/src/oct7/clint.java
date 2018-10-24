package oct7;

import oct1.genericTree;

public class clint {

	public static void main(String[] args) {
		
//		int[] pre = {50,25,12,10,37,40,75,62,70,87};
//		int[] post = {10,12,40,37,25,70,62,87,75,50};
//		int[] in = {10,12,25,37,40,50,62,70,75,87};
	int[]pre={50,25,12,37,30,24,33,40,75,62,87};
	int[]in = {12,25,24,30,33,37,40,50,62,75,87};
	//	BinaryTree bt = new BinaryTree(post,in);
	//	bt.display();
		
		
	BinaryTree bt = new BinaryTree(pre,in);
	//bt.display();
	//System.out.println(bt.diameter());
	//System.out.println(bt.diameter2());
	//System.out.println(bt.isBalanced());
	System.out.println(bt.isBst());
		
		
		
		// BinaryTree bt = new BinaryTree(new int[]
		// {50,25,37,30,-1,-1,-1,75,62,70,-1,-1,87,90,-1,-1,-1,-1});
//		BinaryTree bt = new BinaryTree(
//				new int[] { 50, 25, 12, -1, 37, 30, -1, 40, -1, -1, -1, 75,62, 60, -1, 70, -1, -1, 87, -1, -1, -1 });
		// bt.display();
		// bt.printsiblingless();
		// bt.removeLeaves();
		// bt.display();

		//bt.rootToLeafPathInRange(150, 250);
		
		//bt.levelor();
//	bt.preo();
//	bt.preoi();
//		bt.posto();
//		bt.Ino();

		// System.out.println(bt.size());
		// System.out.println(bt.max());
		// System.out.println(bt.height());
		// System.out.println(bt.find(87));
		// System.out.println(bt.nodeTorootPath(87));

		// int[] arr = {'a', 'b', 'd', 'f', 'h', -1, -1, 'g', 'i', 'm', 'o',
		// 'v',
		// -1, -1, 'p', 't', -1, -1, -1, 'n', 'q', 'u', -1, 'w', -1, -1, -1, -1,
		// 'j', 'k', 'r', 'x', -1, -1, -1, 'l', 's', 'y',
		// -1, -1, -1, -1, -1, -1, -1, 'c', 'e', 'z', -1, -1, -1, -1};
		// BinaryTree bt1 = new BinaryTree(arr);
		//
	}
}
