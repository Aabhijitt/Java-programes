package oct14;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public BST(int... args) {
		root = construct(0, args.length - 1, args);
	}

	private Node construct(int lo, int hi, int... args) {
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		Node node = new Node();
		node.data = args[mid];
		node.left = construct(lo, mid - 1, args);
		node.right = construct(mid + 1, hi, args);
		return node;

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

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node.left != null) {
			return min(node.left);
		} else {
			return node.data;
		}

	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node.right != null) {
			return min(node.right);
		} else {
			return node.data;
		}
	}

	public boolean find(int data) {
		return find(root, data);
	}

	private boolean find(Node node, int data) {
		if (data > node.data) {
			return find(node.right, data);
		} else if (data < node.data) {
			return find(node.left, data);
		} else {
			return true;
		}
	}

	public void add(int data) {
		add(root, data);
	}

	private void add(Node node, int data) {

		if (data > node.data) {
			if (node.right != null) {
				add(node.right, data);

			} else {
				node.right = new Node();
				node.right.data = data;
			}
		} else {
			if (node.left != null) {
				add(node.left, data);

			} else {
				node.left = new Node();
				node.left.data = data;
			}
		}

	}
	public void remove(int data){
		root = remove(root, data);
	}
	private Node remove(Node node,int data){
		if(node==null){
			return null;
		}
		if(data>node.data){
			node.right = remove(node.right, data);
			return node;
		}else if(data < node.data){
			node.left = remove(node.left, data);
			return node;
			
		}else if(node.left == null && node.right == null){
			return null;
		}else if(node.left==null){
			return node.right;
		}else if(node.right==null){
			return node.left;
		}else {
			int lmax = max(node.left);
			node.data = lmax;
			node.left = remove(node.left, lmax);
			return node;
		}
	}
	public void pir(int lo,int hi){
		root = pir(root, lo, hi);
			
		}
		
	
	private Node pir(Node node,int lo,int hi){
		if(node==null){
			return null ;
		}
			
		if(node.data < lo){
			pir(node.right, lo, hi);
			
		}else if(node.data > hi){
			pir(node.left, lo, hi);
		}else{
			pir(node.left, lo, hi);
			System.out.print(node.data+" ");
			pir(node.right, lo, hi);
			
		}
		
		
		return node;
		
	}
	public void replacewithlarger(){
		replacewithlargersum(root);
	}
	int sum = 0;
	private void replacewithlargersum(Node node){
		if(node==null){
			return ;
		}
		replacewithlargersum(node.right);
		int temp = node.data;
		node.data = sum;
		sum += temp;
		replacewithlargersum(node.left);
		
	}
}
