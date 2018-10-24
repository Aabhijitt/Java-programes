package oct14;

public class AVL {
	private class Node {
		int data;
		Node left;
		Node right;
		int ht;
		int bal;

	}

	private Node root;

	public AVL(int... args) {
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
		node.ht = getheight(node);
		node.bal = getbalence(node);
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
		str += "<-" + node.data + "[" + node.ht + ", " + node.bal + "]->";
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
		if(node == null){
			return false;
		}
		
		else if (data > node.data) {
			return find(node.right, data);
		} else if (data < node.data) {
			return find(node.left, data);
		} else if(data == node.data) {
			return true;
		}else{
			return false;
		}
	}

	public void add(int data) {
		root = add(root, data);
	}

	private Node add(Node node, int data) {
		if (node == null) {
			Node bn = new Node();
			bn.data = data;
			bn.ht = 1;
			bn.bal = 0;
			return bn;
		}
		if (data < node.data) {
			node.left = add(node.left, data);

		} else if (data > node.data) {
			node.right = add(node.right, data);
		}
		node.ht = getheight(node);
		node.bal = getbalence(node);
		if (node.bal > 1) {

			if (getbalence(node.left) > 0) {
				node = rightrotate(node);

			} else {
				node.left = leftrotate(node.left);
				node = rightrotate(node);
			}
		} else if (node.bal < -1) {
			if (getbalence(node.right) < 0) {
				node = leftrotate(node);
			} else {
				node.right = rightrotate(node.right);
				node = leftrotate(node);
			}
		}
		return node;
	}

	public void remove(int data) {
		root = remove(root, data);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (data > node.data) {
			node.right = remove(node.right, data);

		} else if (data < node.data) {
			node.left = remove(node.left, data);

		} else if (node.left == null && node.right == null) {
			return null;
		} else if (node.left == null) {
			node = node.right;
		} else if (node.right == null) {
			node = node.left;
		} else {
			int lmax = max(node.left);
			node.data = lmax;
			node.left = remove(node.left, lmax);

		}

		node.ht = getheight(node);
		node.bal = getbalence(node);
		if (node.bal > 1) {

			if (getbalence(node.left) > 0) {
				node = rightrotate(node);

			} else {
				node.left = leftrotate(node.left);
				node = rightrotate(node);
			}
		} else if (node.bal < -1) {
			if (getbalence(node.right) < 0) {
				node = leftrotate(node);
			} else {
				node.right = rightrotate(node.right);
				node = leftrotate(node);
			}
		}
		return node;
	}

	public void pir(int lo, int hi) {
		root = pir(root, lo, hi);

	}

	private Node pir(Node node, int lo, int hi) {
		if (node == null) {
			return null;
		}

		if (node.data < lo) {
			pir(node.right, lo, hi);

		} else if (node.data > hi) {
			pir(node.left, lo, hi);
		} else {
			pir(node.left, lo, hi);
			System.out.print(node.data + " ");
			pir(node.right, lo, hi);

		}

		return node;

	}

	public void replacewithlarger() {
		replacewithlargersum(root);
	}

	int sum = 0;

	private void replacewithlargersum(Node node) {
		if (node == null) {
			return;
		}
		replacewithlargersum(node.right);
		int temp = node.data;
		node.data = sum;
		sum += temp;
		replacewithlargersum(node.left);

	}

	private int getheight(Node node) {
		if (node == null) {
			return 0;
		}
		int lht = node.left != null ? node.left.ht : 0;
		int rht = node.right != null ? node.right.ht : 0;
		return Math.max(lht, rht) + 1;
	}

	private int getbalence(Node node) {
		if (node == null) {
			return 0;
		}
		int lht = node.left != null ? node.left.ht : 0;
		int rht = node.right != null ? node.right.ht : 0;
		return lht - rht;

	}

	private Node rightrotate(Node x) {
		Node y = x.left;
		Node t3 = y.right;
		y.right = x;
		x.left = t3;
		x.ht = getheight(x);
		x.bal = getbalence(x);
		y.ht = getheight(y);
		y.bal = getbalence(y);
		return y;

	}

	private Node leftrotate(Node x) {
		Node y = x.right;
		Node t2 = y.left;
		y.left = x;
		x.right = t2;
		x.ht = getheight(x);
		x.bal = getbalence(x);
		y.ht = getheight(y);
		y.bal = getbalence(y);
		return y;
	}
	public int lca(int lo,int hi){
		return lca(root, lo, hi);
	}
	private int lca(Node node,int lo,int hi){
		if(node.data < lo){
			return lca(node.right, lo, hi);
					
		}else if(node.data > hi){
			return lca(node.left, lo, hi);
		}
		else{ 
			return node.data;
		}
	}
	public void targetsum(int tar){
		targetsum(root, tar);
	}
	private void targetsum(Node node,int tar){
      if(node==null){
    	  return;
		
		}
      if(node.data < tar /2 && find(tar-node.data)){
    	  System.out.println(node.data+" "+(tar-node.data));
    	  
      }
      targetsum(node.left, tar);
      targetsum(node.right, tar);
		
	}
}
