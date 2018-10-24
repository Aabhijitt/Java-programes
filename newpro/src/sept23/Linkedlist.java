
package sept23;

public class Linkedlist {
	private class Node {
		int data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public void addLast(int val) {
		Node node = new Node();
		node.data = val;
		node.next = null;

		if (size > 0) {
			tail.next = node;
			tail = node;
		} else {
			head = node;
			tail = node;
		}
		size++;

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public int getfirst() {
		if (size == 0) {
			System.out.println("list is empty");
			return -1;
		}

		return head.data;

	}

	public int getlast() {
		if (size == 0) {
			System.out.println("list is empty");
			return -1;
		}
		return tail.data;

	}

	public int getAt(int idx) {
		if (idx < 0 || idx >= size) {
			System.out.println("index out of bound");
			return -1;
		}
		Node temp = head;
		int i = 0;
		while (i < idx) {
			temp = temp.next;
			i++;
		}
		return temp.data;

	}

	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size) {
			System.out.println("index out of bound");
			return null;
		}
		Node temp = head;
		int i = 0;
		while (i < idx) {
			temp = temp.next;
			i++;
		}
		return temp;
	}

	public void addFirst(int val) {

		Node node = new Node();
		node.data = val;
		node.next = head;
		head = node;
		if (size == 0) {
			tail = node;
		}
		size++;
	}

	public int removefirst() {
		if (size == 0) {
			System.out.println("Empty");
			return -1;
		}
		int n = head.data;
		head = head.next;
		if (size == 1) {
			tail = null;
			head = null;
		}
		size--;
		return n;
	}

	public int removelast() {
		if (size == 0) {
			System.out.println("list is empty");
			return -1;
		} else if (size == 1) {
			int n = tail.data;
			head = tail = null;
			size = 0;
			return n;
		} else {
			int n = tail.data;
			Node sl = getNodeAt(size - 2);
			tail = sl;
			tail.next = null;
			size--;

			return n;

		}

	}

	public void addat(int idx, int val) {
		if (idx < 0 || idx > size) {
			System.out.println("index out of");
			return;
		} else if (idx == 0) {
			addFirst(val);
			return;
		} else if (idx == size) {
			addLast(val);
			return;
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node node = nm1.next;
			Node nn = new Node();
			nn.data = val;
			nm1.next = nn;
			nn.next = node;
			size++;
		}

	}

	public int removeAt(int idx) {
		if (idx < 0 || idx >= size) {
			System.out.println("index out");
			return -1;
		} else if (idx == 0) {
			return removefirst();
		} else if (idx == size - 1) {
			return removelast();

		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node node = nm1.next;
			Node np1 = node.next;
			nm1.next = np1;
			size--;

			return node.data;
		}
	}

	public void reverseDataIterative() {

		int n = 0;
		while (n <= size / 2) {
			Node n1 = getNodeAt(n);
			Node n2 = getNodeAt(size - n - 1);

			int temp = n1.data;
			n1.data = n2.data;
			n2.data = temp;

			n++;
		}

	}

	public void reversePointerIterative() {
		Node p = null;
		Node c = head;
		Node n = c.next;

		while (c != null) {
			c.next = p;
			p = c;
			c = n;
			if (n != null) {
				n = n.next;
			}

		}
		Node temp = head;
		head = tail;
		tail = temp;

	}

	public void displayReverse() {
		displayreversehelp(head);
		System.out.println(" .");
	}

	private void displayreversehelp(Node node) {
		if (node == null) {
			return;
		}
		displayreversehelp(node.next);
		System.out.print(node.data + "->");
	}

	public void reversePointerRecursive() {
		reversePointerhelper(head);
		Node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;

	}

	private void reversePointerhelper(Node node) {
		if (node == tail) {
			return;
		}
		reversePointerhelper(node.next);
		node.next.next = node;
	}

	public void reverseDataRecursive() {
		left = head;
		reversedatahelper(head, 0);

	}

	Node left;

	private void reversedatahelper(Node right, int floor) {
		if (right == null) {
			return;
		}
		reversedatahelper(right.next, floor + 1);
		if (floor >= size / 2) {

			int temp = right.data;
			right.data = left.data;
			left.data = temp;
			left = left.next;

		}

	}

	public boolean IsPalindrome() {
		left = head;
		boolean ispal = Ispalindromehelper(head, 0);
		left = null;
		return ispal;

	}

	private boolean Ispalindromehelper(Node right, int floor) {

		if (right == null) {
			return true;

		}
		boolean ispal = Ispalindromehelper(right.next, floor + 1);
		if (ispal == false) {
			return false;
		} else {
			if (floor >= size / 2) {
				if (left.data == right.data) {
					left = left.next;
					return true;
				} else {
					return false;
				}
			} else {
				return ispal;
			}
		}

	}

	public void fold() {
		left = head;
		foldhelper(head, 0);
	}

	private void foldhelper(Node right, int floor) {
		if (right == null) {
			return;
		}
		foldhelper(right.next, floor + 1);
		if (floor >= size / 2) {
			Node temp = left.next;
			left.next = right;
			right.next = temp;
			left = temp;
		}
		if (floor == size / 2) {
			tail = right;
			tail.next = null;
		}

	}

	public void removeduplicates() {

		Node curr = head;
		Node next = head.next;
		size = 1;

		while (true) {
			if (next == null) {
				curr.next = null;
				tail = curr;
				break;
			}
			if (curr.data == next.data) {
				next = next.next;
			} else {
				size++;
				curr.next = next;
				curr = next;
				next = next.next;
			}

		}

	}

	public int mid() {
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	private Node midnode() {
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public int kthFromlast(int k) {
		Node slow = head;
		Node fast = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;

	}

	public static Linkedlist mergersortlist(Linkedlist one, Linkedlist two) {
		Linkedlist res = new Linkedlist();
		Node onode = one.head;
		Node tnode = two.head;
		while (onode != null && tnode != null) {
			if (onode.data < tnode.data) {
				res.addLast(onode.data);
				onode = onode.next;
			} else {
				res.addLast(tnode.data);
				tnode = tnode.next;
			}
		}
		while (onode != null) {
			res.addLast(onode.data);
			onode = onode.next;
		}
		while (tnode != null) {
			res.addLast(tnode.data);
			tnode = tnode.next;
		}

		return res;

	}

	public static Linkedlist merge(Linkedlist list) {
		if (list.size == 1) {
			return list;
		}

		Node mid = list.midnode();
		Node midn = mid.next;
		Linkedlist f = new Linkedlist();
		f.head = list.head;
		f.tail = mid;
		f.size = (list.size + 1) / 2;

		Linkedlist s = new Linkedlist();
		s.head = mid.next;
		s.tail = list.tail;
		s.size = list.size - f.size;
		mid.next = null;
		f = Linkedlist.merge(f);
		s = Linkedlist.merge(s);

		Linkedlist res = Linkedlist.mergersortlist(f, s);

		mid.next = midn;
		return res;

	}

	public void kreverse(int k) {
		Linkedlist nl = new Linkedlist();
		Linkedlist temp = new Linkedlist();
		while (this.size != 0) {
			for (int i = 0; i < k; i++) {

				temp.addFirst(this.removefirst());
			}
			if (nl.size == 0) {
				nl = temp;

			} else {
				nl.tail.next = temp.head;
				nl.tail = temp.tail;
				nl.size += temp.size;

			}
			temp = new Linkedlist();
		}
		head = nl.head;
		tail = nl.tail;
		size = nl.size;

	}

	public void oddeven() {
		Linkedlist odd = new Linkedlist();
		Linkedlist even = new Linkedlist();

		while (this.size != 0) {
			int rem = this.removefirst();
			if (rem % 2 == 0) {
				even.addLast(rem);

			} else {
				odd.addLast(rem);
			}
		}
		odd.tail.next = even.head;
		head = odd.size > 0 ? odd.head : even.head;
		tail = even.size > 0 ? even.tail : odd.tail;
		size = odd.size + even.size;

	}
}
