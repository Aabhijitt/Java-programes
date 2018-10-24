package oct20;

import java.util.Collections;
import java.util.PriorityQueue;

public class medianpriorityQueue {
	PriorityQueue<Integer> min = new PriorityQueue<>();
	PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
	int size = 0;

	public void add(int val) {

		if (max.size() != 0 && val < max.peek()) {
			max.add(val);
		} else if (min.size() != 0 && val > min.peek()) {
			min.add(val);
		} else {
			max.add(val);
		}
		if (max.size() - min.size() == 2) {
			min.add(max.remove());
		} else if (min.size() - max.size() == 2) {
			max.add(min.remove());
		}
		size++;

	}

	public int remove() {
		if (size == 0) {
			System.out.println("is empty");
			return -1;
		}
		size--;
		return max.size() >= min.size() ? max.remove() : min.remove();

	}

	public int peek() {
		if (size == 0) {
			System.out.println("is empty");
			return -1;
		}
		return max.size() >= min.size() ? max.peek() : min.peek();

	}
}
