package oct7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {
	private class Node {

		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

	public BinaryTree(int[] arr) {
		Stack<Node> stack = new Stack<>();
		for (int val : arr) {
			if (val == -1) {
				stack.pop();
			} else {
				Node node = new Node();
				node.data = val;
				size++;

				if (stack.size() == 0) {
					root = node;
				} else {
					Node top = stack.peek();
					if (top.left == null) {
						top.left = node;
					} else {
						top.right = node;
					}
				}
				stack.push(node);
			}

		}

	}

	public void display() {
		display(root);

	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		str += node.left != null ? node.left.data + " " : ".";
		str += "<-" + node.data + "->";
		str += node.right != null ? node.right.data + " " : ".";
		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		int lsize = size(node.left);
		int rsize = size(node.right);
		return lsize + rsize + 1;

	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node == null) {
			return 0;
		}
		int lmax = max(node.left);
		int rmax = max(node.right);
		return Math.max(node.data, Math.max(lmax, rmax));

	}

	public int height() {
		return height(root);

	}

	private int height(Node node) {
		if (node == null) {
			return 0;
		}
		int lsize = height(node.left);
		int rsize = height(node.right);
		return Math.max(rsize, lsize) + 1;

	}

	public boolean find(int data) {
		return find(root, data);

	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		}
		boolean filc = find(node.left, data);
		if (filc == true) {
			return true;
		}
		boolean firc = find(node.right, data);
		if (firc == true) {
			return true;

		}
		return false;

	}

	private Node findNode(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (node.data == data) {
			return node;
		}
		Node filc = findNode(node.left, data);
		if (filc != null) {
			return filc;
		}
		Node firc = findNode(node.right, data);
		if (firc != null) {
			return firc;

		}
		return null;

	}

	public ArrayList<Integer> nodeTorootPath(int data) {
		return nodeTorootPath(root, data);

	}

	private ArrayList<Integer> nodeTorootPath(Node node, int data) {
		if (node == null) {
			return new ArrayList<>();
		}
		if (node.data == data) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(node.data);
			return list;
		}
		ArrayList<Integer> Llist = nodeTorootPath(node.left, data);
		if (Llist.size() > 0) {
			Llist.add(node.data);
			return Llist;
		}
		ArrayList<Integer> Rlist = nodeTorootPath(node.right, data);
		if (Rlist.size() > 0) {
			Rlist.add(node.data);
			return Rlist;

		}
		return new ArrayList<>();
	}

	public void printKDown(int data, int k) {
		Node node = findNode(root, data);
	}

	private void printKDown(Node node, int depth, int k) {
		if (node == null) {
			return;
		}

		if (depth == k) {
			System.out.println(node.data);
			return;
		}
		printKDown(node.left, depth + 1, k);
		printKDown(node.right, depth + 1, k);

	}

	private ArrayList<Node> nodeTorootPathNode(Node node, int data) {
		if (node == null) {
			return new ArrayList<>();
		}
		if (node.data == data) {
			ArrayList<Node> list = new ArrayList<>();
			list.add(node);
			return list;
		}
		ArrayList<Node> Llist = nodeTorootPathNode(node.left, data);
		if (Llist.size() > 0) {
			Llist.add(node);
			return Llist;
		}
		ArrayList<Node> Rlist = nodeTorootPathNode(node.right, data);
		if (Rlist.size() > 0) {
			Rlist.add(node);
			return Rlist;

		}
		return new ArrayList<>();
	}

	public void printKDown1(int data, int k) {
		Node node = findNode(root, data);
	}

	private void printKDown1(Node node, int depth, int k) {
		if (node == null) {
			return;
		}

		if (depth == k) {
			System.out.println((char) (node.data));
			return;
		}
		printKDown1(node.left, depth + 1, k);
		printKDown1(node.right, depth + 1, k);

	}

	public void printKfar(int data, int k) {
		ArrayList<Node> path = nodeTorootPathNode(root, data);
		printKDown(path.get(0), 0, k);
		for (int i = 1; i <= k - 1 && i < path.size(); i++) {
			Node im1node = path.get(i - 1);
			Node inode = path.get(i);

			if (inode.left == im1node) {
				printKDown(inode.right, 0, k - i - 1);
			} else {
				printKDown(inode.left, 0, k - i - 1);
			}
		}
		System.out.println((char) (path.get(k).data));
	}

	public void printsiblingless() {
		printsiblingless(root, null);
	}

	private void printsiblingless(Node node, Node par) {
		if (node == null) {
			return;
		}
		if (par != null && par.left == node && par.right == null) {
			System.out.println(node.data);
		} else if (par != null && par.right == null && par.left == null) {
			System.out.println(node.data);
		}
		printsiblingless(node.left, node);
		printsiblingless(node.right, node);

	}

	public void removeLeaves() {
		removeLeaves(root, null);

	}

	private void removeLeaves(Node node, Node par) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			if (node == par.left) {
				par.left = null;
			} else if (node == par.right) {
				par.right = null;
			}
			return;
		}
		removeLeaves(node.left, node);
		removeLeaves(node.right, node);

	}

	public void rootToLeafPathInRange(int d1, int d2) {
		// rootToLeafPathInRange(root, d1, d2, 0, " ");
		rootToLeafPathInRange(root, d1, d2, 0, new ArrayList<>());
	}

	private void rootToLeafPathInRange(Node node, int d1, int d2, int ssf, String psf) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			ssf += node.data;
			psf += " " + node.data;
			if (ssf >= d1 && ssf <= d2) {
				System.out.println(psf);
			}
			return;
		}

		rootToLeafPathInRange(node.left, d1, d2, ssf + node.data, psf + " " + node.data);
		rootToLeafPathInRange(node.right, d1, d2, ssf + node.data, psf + " " + node.data);
	}

	private void rootToLeafPathInRange(Node node, int d1, int d2, int ssf, ArrayList<Integer> psf) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			ssf += node.data;
			psf.add(node.data);
			if (ssf > d1 && ssf < d2) {
				System.out.println(psf);
			}
			psf.remove(psf.size() - 1);
			return;
		}

		psf.add(node.data);
		rootToLeafPathInRange(node.left, d1, d2, ssf + node.data, psf);
		rootToLeafPathInRange(node.right, d1, d2, ssf + node.data, psf);
		psf.remove(psf.size() - 1);

	}

	public void preo() {
		preo(root);
	}

	private void preo(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preo(node.left);
		preo(node.right);

	}

	public void posto() {
		posto(root);
	}

	private void posto(Node node) {
		if (node == null) {
			return;
		}

		posto(node.left);
		posto(node.right);
		System.out.print(node.data + " ");

	}

	public void Ino() {
		Ino(root);
	}

	private void Ino(Node node) {
		if (node == null) {
			return;
		}

		Ino(node.left);
		System.out.print(node.data + " ");
		Ino(node.right);

	}

	public void levelor() {
		levelo(root);
	}

	private void levelo(Node node) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);

		while (queue.size() > 0) {
			Node temp = queue.removeFirst();
			System.out.print(temp.data + " ");

			if (temp.left != null) {
				queue.addLast(temp.left);

			}
			if (temp.right != null) {
				queue.addLast(temp.right);

			}
		}
		System.out.println(".");
	}

	private class pair {

		Node node;
		boolean self;
		boolean left;
		boolean right;

		pair(Node node, boolean self, boolean left, boolean right) {
			this.node = node;
			this.self = self;
			this.left = left;
			this.right = right;

		}

	}

	public void preoi() {
		Stack<pair> st = new Stack<>();

		st.add(new pair(root, false, false, false));
		while (st.size() > 0) {
			pair top = st.peek();
			if (top.self == false) {
				top.self = true;
				System.out.println(top.node.data + " ");

			} else if (top.left == false) {
				top.left = true;
				if (top.node.left != null) {
					pair lpair = new pair(top.node.left, false, false, false);
					st.push(lpair);
				}
			} else if (top.right == false) {
				top.right = true;
				if (top.node.right != null) {
					pair rpair = new pair(top.node.right, false, false, false);
					st.push(rpair);
				}
			} else {
				st.pop();
			}

		}
	}

	// public BinaryTree(int[] post, int[] in) {
	// root = construct(post, in, 0, post.length - 1, 0, in.length - 1);
	//
	// }
	//
	// private Node construct(int[] post, int[] in, int psi, int pei, int isi,
	// int iei) {
	//
	// if (isi > iei || psi > pei) {
	// return null;
	// }
	//
	// Node node = new Node();
	// node.data = post[pei];
	// int idx = -1;
	// for (int i = isi; i <= iei; i++) {
	// if (node.data == in[i]) {
	// idx = i;
	// break;
	// }
	// }
	//
	// int lhs = idx - isi;
	//
	// node.left = construct(post, in, psi, psi + lhs - 1, isi, idx - 1);
	// node.right = construct(post, in, psi + lhs, pei - 1, idx + 1, iei);
	//
	// return node;
	//
	// }

	public BinaryTree(int[] pre, int[] in) {
		root = construct(pre, in, 0, pre.length - 1, 0, in.length - 1);

	}

	private Node construct(int[] pre, int[] in, int psi, int pei, int isi, int iei) {

		Node node = new Node();
		if (isi > iei || psi > pei) {
			return null;
		}

		node.data = pre[psi];
		int idx = -1;
		for (int i = isi; i <= iei; i++) {
			if (node.data == in[i]) {
				idx = i;
				break;
			}
		}

		int lhs = idx - isi;

		node.left = construct(pre, in, psi + 1, psi + lhs, isi, idx - 1);
		node.right = construct(pre, in, psi + lhs + 1, pei, idx + 1, iei);

		return node;

	}

	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node node) {

		if (node == null) {
			return 0;
		}
		int lh = height(node.left);
		int rh = height(node.right);

		int ld = diameter(node.left);
		int rd = diameter(node.right);

		return Math.max(lh + rh + 1, Math.max(ld, rd));
	}

	private class diapair {
		int dia;
		int height;

		public diapair(int dia, int height) {
			this.dia = dia;
			this.height = height;
		}
	}

	public int diameter2() {
		diapair bp = diameter2(root);
		return bp.dia;

	}

	private diapair diameter2(Node node) {
		if (node == null) {
			diapair bp = new diapair(0, 0);
			return bp;
		}

		diapair lp = diameter2(node.left);
		diapair rp = diameter2(node.right);

		int f1 = lp.height + rp.height + 1;
		int mydia = Math.max(f1, Math.max(lp.dia, rp.dia));

		int myheight = Math.max(lp.height, rp.height) + 1;

		diapair mp = new diapair(mydia, myheight);
		return mp;
	}

	public boolean isBalanced() {
		BalPair bp = isBalanced(root);
		return bp.isBalanced;
	}

	private BalPair isBalanced(Node node) {
		if (node == null) {
			BalPair bp = new BalPair(0, true);
			return bp;
		}
		BalPair lb = isBalanced(node.left);
		BalPair rb = isBalanced(node.right);

		boolean mybal = lb.isBalanced && rb.isBalanced && Math.abs(lb.height - rb.height) <= 1;
		int myheight = Math.max(lb.height, rb.height) + 1;

		BalPair mp = new BalPair(myheight, mybal);
		return mp;

	}

	private class BalPair {
		int height;
		boolean isBalanced;

		public BalPair(int height, boolean isBalanced) {
			this.height = height;
			this.isBalanced = isBalanced;
		}
	}

	private class ibst {
		int max;
		int min;
		boolean isbst;
		int lbsize;
		Node lbroot;

		public ibst(int max, int min, boolean isbst) {
			this.max = max;
			this.min = min;
			this.isbst = isbst;
		}
	}

	public boolean isBst() {
		ibst ib = isbst(root);
		System.out.println(ib.lbroot.data + " " + ib.lbsize);
		return ib.isbst;

	}

	private ibst isbst(Node node) {
		if (node == null) {
			ibst bp = new ibst(0, 0, false);
			bp.isbst = true;
			bp.min = Integer.MAX_VALUE;
			bp.max = Integer.MIN_VALUE;
			return bp;
		}

		ibst lb = isbst(node.left);
		ibst rb = isbst(node.right);

		ibst mp = new ibst(0, 0, false);
		mp.isbst = lb.isbst && rb.isbst && node.data > lb.max && node.data < rb.min;
		mp.min = Math.min(node.data, Math.min(lb.min, rb.min));
		mp.max = Math.max(node.data, Math.max(lb.max, rb.max));
		if (mp.isbst) {
			mp.lbroot = node;
			mp.lbsize = lb.lbsize + rb.lbsize + 1;
		} else if (lb.lbsize > rb.lbsize) {
			mp.lbroot = lb.lbroot;
			mp.lbsize = lb.lbsize;
		} else {
			mp.lbroot = rb.lbroot;
			mp.lbsize = rb.lbsize;
		}

		return mp;

	}

}
