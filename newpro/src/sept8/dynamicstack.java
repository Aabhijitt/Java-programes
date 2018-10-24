package sept8;

public class dynamicstack extends stack {

	public dynamicstack(int cap) {
		super(cap);
	}

	public void push(int val) {
		if (isfull(val)) {
			int[] oa = this.data;
			data = new int[2 * oa.length];
			for (int i = 0; i < oa.length; i++) {
				data[i] = oa[i];
			}

		}
		super.push(val);
	}
}
