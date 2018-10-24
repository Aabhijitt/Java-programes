package sept8;

public class queue {
	protected int[] data;
	protected int front = 0;
	protected int size = 0;

	public queue(int cap) {
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isempty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isfull() {
		if (size == data.length) {
			return true;
		} else {
			return false;
		}
	}

	public void enque(int val) {
		if (isfull()) {
			System.out.println("queue is full");
		}
		int rear = (front + size) % data.length;
		data[rear] = val;
		size++;
	}

	public int dque() {
		if (isempty()) {
			System.out.println("queue is empty");
			return -1;
		}
		int rv = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;
		size--;

		return rv;
	}

	public int front() {
		if (isempty()) {
			System.out.println("queue is empty");
			return -1;
		}
		int rv = data[front];

		return rv;

	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(data[(front + i) % data.length] + " ");
		}
		System.out.println(" .");
	}

}
