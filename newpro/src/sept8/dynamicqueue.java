package sept8;

public class dynamicqueue extends queue {
	public dynamicqueue(int cap) {
		super(cap);
	}

	public void enque(int val) {

		if (isfull()) {
			int[] oa = this.data;
			data = new int[2 * oa.length];
			for (int i = 0; i < size; i++) {
				data[i] = oa[(front + i) % oa.length];

			}
			front = 0;
		}
		super.enque(val);
	}
}
