package sept8;

public class queueclint {
	public static void main(String[] args) {
		queue queue = new dynamicqueue(5);

		queue.enque(10);
		queue.display();

		queue.enque(20);
		queue.display();

		queue.enque(30);
		queue.display();

		queue.enque(40);
		queue.display();

		queue.enque(50);
		queue.display();

		System.out.println(queue.dque());
		queue.display();

		System.out.println(queue.dque());
		queue.display();

		queue.enque(70);
		queue.display();

		queue.enque(80);
		queue.display();

		queue.enque(90);
		queue.display();

	}
}
