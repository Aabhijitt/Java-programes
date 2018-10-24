package oct1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import javax.xml.soap.Node;

import sept23.Linkedlist;

public class genericTree {
	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();

	}

	private Node root;
	private int size;

	public genericTree(int[] arr) {
		Stack<Node> stack = new Stack<>();
		for (int val : arr) {
			if (val != -1) {
				Node node = new Node();
				node.data = val;

				if (stack.size() > 0) {
					stack.peek().children.add(node);

				} else {
					root = node;
				}
				stack.push(node);
				size++;

			} else {
				stack.pop();

			}
		}

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		display(root);

	}

	private void display(Node node) {
		String str = node.data + " ";
		for (Node child : node.children) {

			str += child.data + ",";
		}
		System.out.println(str + ".");
		for (Node child : node.children) {
			display(child);
		}
	}

	public int size2() {
		return size2(root);
	}

	private int size2(Node node) {
		int size = 0;
		for (Node child : node.children) {
			int cfsize = size2(child);
			size += cfsize;
		}
		size += 1;
		return size;

	}

	public int max() {
		return max(root);

	}

	private int max(Node node) {
		int r = node.data;
		for (Node child : node.children) {
			int cmax = max(child);
			r = Math.max(r, cmax);
		}
		return r;
	}

	public int height() {
		return height(root);

	}

	private int height(Node node) {
		int size = 0;
		for (Node child : node.children) {
			int h = height(child);
			size = Math.max(size, h);

		}
		size += 1;
		return size;

	}

	public boolean find(int data) {

		return find(root, data);
	}

	private boolean find(Node node, int data) {
		if (node.data == data) {
			return true;
		}
		for (Node child : node.children) {
			boolean fic = find(child, data);
			if (fic == true) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Integer> nodeToRootPath(int data) {
		return nodeToRootPath(root, data);

	}

	private ArrayList<Integer> nodeToRootPath(Node node, int data) {
		if (node.data == data) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(node.data);
			return list;
		}
		for (Node child : node.children) {
			ArrayList<Integer> clist = nodeToRootPath(child, data);
			if (clist.size() > 0) {
				clist.add(node.data);
				return clist;

			}
		}
		return new ArrayList<>();

	}

	public int lca(int d1, int d2) {
		ArrayList<Integer> ntrp1 = nodeToRootPath(d1);
		ArrayList<Integer> ntrp2 = nodeToRootPath(d2);
		int i = ntrp1.size() - 1;
		int j = ntrp2.size() - 1;
		while (true) {
			if (ntrp1.get(i) != ntrp2.get(j)) {
				return ntrp1.get(i + 1);
			}
			i--;
			j--;

		}

	}

	public int distanceBTWNodes(int d1, int d2) {
		ArrayList<Integer> ntrp1 = nodeToRootPath(d1);
		ArrayList<Integer> ntrp2 = nodeToRootPath(d2);
		int i = ntrp1.size() - 1;
		int j = ntrp2.size() - 1;
		int count = 0;
		while (true) {
			if (ntrp1.get(i) != ntrp2.get(j)) {
				return ntrp1.size() + ntrp2.size() - 2 * count;
			}
			i--;
			j--;
			count++;
		}

	}

	public void mirror() {
		mirror(root);

	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);

		}
		int l = 0;
		int r = node.children.size() - 1;
		while (l < r) {
			Node lnode = node.children.get(l);
			Node rnode = node.children.get(r);

			node.children.set(l, rnode);
			node.children.set(r, lnode);

			l++;
			r--;
		}

	}

	public void removetheleaf() {
		removetheleaf(root);

	}

	private void removetheleaf(Node node) {
		for (int i = node.children.size() - 1; i >= 0; i--) {
			Node child = node.children.get(i);
			if (child.children.size() == 0) {
				node.children.remove(child);
			}
		}
		for (Node child : node.children) {
			removetheleaf(child);
		}
	}

	public void preo() {
		preo(root);

	}

	private void preo(Node node) {
		System.out.println(node.data);
		for (Node child : node.children) {
			preo(child);
		}
	}

	public void posto() {
		posto(root);

	}

	private void posto(Node node) {
		for (Node child : node.children) {
			posto(child);
		}
		System.out.println(node.data);
	}

	public void printAtKthlevel(int k) {
		printAtKthlevel(0, root, k);
	}

	private void printAtKthlevel(int depth, Node node, int k) {
		if (depth == k) {
			System.out.print(node.data);
			return;
		}
		for (Node child : node.children) {
			printAtKthlevel(depth + 1, child, k);

		}
	}

	public void levelorder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		while (queue.size() > 0) {
			Node temp = queue.removeFirst();
			System.out.println(temp.data);
			for (Node child : temp.children) {
				queue.addLast(child);
			}
			System.out.println(".");
		}

	}

	public void lowlo() {
		LinkedList<Node> cl = new LinkedList<>();
		LinkedList<Node> nl = new LinkedList<>();

		cl.add(root);
		while (cl.size() > 0) {
			Node temp = cl.removeFirst();
			System.out.println(temp.data + " ");
			for (Node child : temp.children) {
				nl.addLast(child);
			}
			if (cl.size() == 0) {
				System.out.println();
				cl = nl;
				nl = new LinkedList<>();
			}
			System.out.println(" ");
		}
	}

	public void lowerzig() {
		boolean ltr = true;
		LinkedList<Node> clq = new LinkedList<>();
		LinkedList<Node> nls = new LinkedList<>();

		clq.add(root);
		while (clq.size() > 0) {
			Node temp = clq.removeFirst();
			System.out.print(temp.data + " ");
			if (ltr) {
				for (int i = 0; i < temp.children.size(); i++) {
					nls.addFirst(temp.children.get(i));
				}
			} else {
				for (int i = temp.children.size() - 1; i >= 0; i--) {
					nls.addFirst(temp.children.get(i));
				}
			}
			if (clq.size() == 0) {

				clq = nls;
				nls = new LinkedList<>();
				ltr = !ltr;
				System.out.println();

			}
		}
	}

	public void lvllineariz() {
		lvllineariz(root);

	}

	private void lvllineariz(Node node) {
		for (Node child : node.children) {
			lvllineariz(child);
		}
		while (node.children.size() > 1) {
			Node last = node.children.remove(node.children.size() - 1);
			Node sl = getTail(node.children.get(node.children.size() - 1));
			sl.children.add(last);
		}
	}

	private Node getTail(Node node) {
		if (node.children.size() == 0) {
			return node;
		} else {
			return getTail(node.children.get(0));
		}
	}

	public void linear2() {
		linear2(root);
	}

	private Node linear2(Node node) {
		if (node.children.size() == 0) {
			return node;
		}
		Node otail = linear2(node.children.get(node.children.size() - 1));
		for (int i = node.children.size() - 2; i >= 0; i--) {
			Node ctail = linear2(node.children.get(i));
			ctail.children.add(node.children.remove(i + 1));
		}

		return otail;

	}

	public boolean areIsomorphic(genericTree other) {
		return areIsomorpic(this.root, other.root);

	}

	private boolean areIsomorpic(Node tnode, Node onode) {
		if (tnode.children.size() != onode.children.size()) {
			return false;
		}
		for (int i = 0; i < onode.children.size(); i++) {

			boolean flag = areIsomorpic(tnode.children.get(i), onode.children.get(i));
			if (flag == false) {
				return false;
			}

		}
		return true;
	}

	public boolean areMirrorimage(genericTree other) {
		return areMirrorimage(this.root, other.root);
	}

	private boolean areMirrorimage(Node tnode, Node onode) {
		if (tnode.children.size() != onode.children.size()) {
			return false;
		}
		for (int i = 0, j = tnode.children.size() - 1; i < onode.children.size(); i++, j--) {

			boolean flag = areMirrorimage(tnode.children.get(i), onode.children.get(i));
			if (flag == false) {
				return false;
			}

		}
		return true;
	}

	public boolean IsSymetric() {
		return areMirrorimage(root, root);
	}

	int sizems = 0;
	int heightms = 0;
	int minms = Integer.MAX_VALUE;
	int maxms = Integer.MIN_VALUE;
	boolean find = false;

	public void multisolver(int data) {
		multisolver(data);
		System.out.println("size = " + sizems);
		System.out.println("heightms = " + heightms);
		System.out.println("minms = " + minms);
		System.out.println("maxms = " + maxms);
		System.out.println("find = " + find);
	}

	public void multisolver(int data, Node node, int depth) {
		size++;
		heightms = Math.max(depth, heightms);
		minms = Math.min(minms, node.data);
		maxms = Math.max(maxms, node.data);
		find = find || node.data == data;
		for (Node child : node.children) {
			multisolver(data);
		}
	}
}
 