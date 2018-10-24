package sept8;

public class stackinqueue {

	queue dq;
	queue hq;

	public stackinqueue(int cap) {
		dq = new queue(cap);
		hq = new queue(cap);

	}

	public int size() {
		return dq.size();

	}

	public boolean isempty() {
		return dq.isempty();

	}

	public boolean isfull() {
		return dq.isfull();

	}

	public void push(int val) {
		if (isfull()) {
			return;
		}
		while (dq.size() > 0) {
			hq.enque(dq.dque());
		}
		dq.enque(val);
		while (hq.size() > 0) {
			dq.enque(hq.dque());
		}

	}

	public int pop() {
		if (isempty()) {
			System.out.println("stack is empty");
			return -1;
		} else {
			return dq.dque();
		}

	}

	public void display() {
		dq.display();

	}
}
