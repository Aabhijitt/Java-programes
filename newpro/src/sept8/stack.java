package sept8;

public class stack {
	protected int[] data;
	protected int tos = -1;

	public stack(int cap) {
		this.data = new int[cap];
	}

	public boolean isempty() {
		if (tos == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isfull(int cap) {
		if (tos == data.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		int a = tos + 1;
		return a;
	}

	public void push(int val) {
		if (isfull(val) == false) {
			tos++;
			data[tos] = val;

		} else {
			System.out.println("Stack is full");
		}
	}

	public int pop() {
		if (isempty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int rv = data[tos];
		data[tos]= 0;
		tos--;
		return rv;

	}

	public int top() {
		if (isempty()) {
			System.out.println("stack is empty");
			return -1;
		} else {
			return data[tos];
		}

	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
             System.out.println(data[i]+" ");
		}
		System.out.println();
	
	}

}
