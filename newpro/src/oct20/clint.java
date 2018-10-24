package oct20;

public class clint {

	public static void main(String[] args) {
		medianpriorityQueue mpq = new medianpriorityQueue();
		mpq.add(10);
		mpq.add(50);
		mpq.add(30);
		System.out.println(mpq.peek());
		mpq.add(40);
		mpq.add(70);
		System.out.println(mpq.peek());
		mpq.add(90);
		mpq.add(100);
		System.out.println(mpq.remove());
		mpq.add(45);
		System.out.println(mpq.peek());
		System.out.println(mpq.remove());
		mpq.add(75);
		System.out.println(mpq.remove());
		System.out.println(mpq.remove());
	
	}

}
