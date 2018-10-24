package sept23;

public class clint {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.removefirst();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
		list.display();

		// list.removeAt(2);
		// list.display();
		// list.reverseDataIterative();
		// list.display();
		// list.reversePointerIterative();
		// list.display();

		// list.displayReverse();
		//
		// list.reversePointerRecursive();
		// list.display();
		//
		// list.reverseDataRecursive();
		//
		// list.display();
		// System.out.println(list.IsPalindrome());
		// list.fold();
		// list.display();

		// System.out.println(list.mid());
		// System.out.println(list.kthFromlast(3));

		Linkedlist list1 = new Linkedlist();
		list1.addLast(10);
		list1.addLast(20);
		list1.addLast(30);
		list1.addLast(40);
		list1.addLast(50);

		Linkedlist list2 = new Linkedlist();
		list2.addLast(11);
		list2.addLast(21);
		list2.addLast(31);
		list2.addLast(41);
		list2.addLast(51);
		list2.addLast(61);
		list2.addLast(71);

		Linkedlist list3 = Linkedlist.mergersortlist(list1, list2);
		list3.display();

		// list3.fold();
		// list3.display();
		Linkedlist list4 = Linkedlist.merge(list3);
		list4.display();
		list4.kreverse(3);
		System.out.println("----------------------");
		list4.display();
		list4.oddeven();
		System.out.println("----------------------");
		list4.display();

	}

}
