package linkedList;

public class LinkedListDriver {

	public static void main(String[] args) {

		/*
		 * SingleLinkedList.createSingleLinkedList(25, "Rohit");
		 * SingleLinkedList.insertAtBeginning(25, "Ahanaa");
		 * SingleLinkedList.insertAtEnd(24, "Akshata"); SingleLinkedList.insertAfter(25,
		 * "Rachita", "Saumya"); SingleLinkedList.insertAfter(24, "Akhila", "Rohit");
		 * SingleLinkedList.traverse(); System.out.println(SingleLinkedList.getSize());
		 * 
		 * SingleLinkedList.deleteFirstNode(); SingleLinkedList.traverse();
		 * System.out.println(SingleLinkedList.getSize());
		 * 
		 * SingleLinkedList.searchNode("Rohit"); SingleLinkedList.searchNode("Rohan");
		 * SingleLinkedList.traverse(); System.out.println(SingleLinkedList.getSize());
		 * 
		 * SingleLinkedList.deleteNode("Saumya");
		 */

		/*
		 * System.out.println(CircularSingleLinkedList.getSize());
		 * CircularSingleLinkedList.createCircularLinkedList(25, "Rohit");
		 * CircularSingleLinkedList.insertAtBeginning(24, "Akshata");
		 * System.out.println(CircularSingleLinkedList.getSize());
		 * CircularSingleLinkedList.traverse();
		 * 
		 * CircularSingleLinkedList.insertAtEnd(23, "Rohan");
		 * System.out.println(CircularSingleLinkedList.getSize());
		 * CircularSingleLinkedList.traverse();
		 * 
		 * CircularSingleLinkedList.insertAfter(25, "Saumya", "Aditi");
		 * System.out.println(CircularSingleLinkedList.getSize());
		 * CircularSingleLinkedList.traverse();
		 * 
		 * CircularSingleLinkedList.deleteNode("Akshata");
		 * System.out.println(CircularSingleLinkedList.getSize());
		 * CircularSingleLinkedList.traverse();
		 * 
		 * CircularSingleLinkedList.deleteLastNode();
		 * System.out.println(CircularSingleLinkedList.getSize());
		 * CircularSingleLinkedList.traverse();
		 */
		
		
		DoubleLinkedList.createDoubleLinkedList(25, "Rohit");
		System.out.println(DoubleLinkedList.getSize());
		DoubleLinkedList.traverse();

		DoubleLinkedList.insertAtBeginning(24, "Akshata");
		System.out.println(DoubleLinkedList.getSize());
		DoubleLinkedList.traverse();

		DoubleLinkedList.insertAtLast(24, "Ahanaa");
		System.out.println(DoubleLinkedList.getSize());
		DoubleLinkedList.traverse();

		DoubleLinkedList.insertBefore(25, "Ankit", "Rohit");
		System.out.println(DoubleLinkedList.getSize());
		DoubleLinkedList.traverse();
		
		DoubleLinkedList.insertAfter(25, "Saumya", "Ankit");
		System.out.println(DoubleLinkedList.getSize());
		DoubleLinkedList.traverse();
	}

}
