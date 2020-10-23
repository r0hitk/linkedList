package linkedList;

public class DoubleLinkedList {

	private static DoubleNode head;
	private static DoubleNode tail;
	private static int size;

	public static void createDoubleLinkedList(int age, String name) {

		DoubleNode node = new DoubleNode(age, name);
		head = node;
		tail = node;
		size = 1;
	}

	public static void insertBefore(int age, String name, String beforeThis) {

		DoubleNode node = new DoubleNode(age, name);
		if (size == 1) {
			insertAtBeginning(age, name);

		} else {

			DoubleNode advRef = head;
			while (advRef.getName() != beforeThis) {
				advRef = advRef.getNext();
			}

			node.setPrev(advRef.getPrev());
			node.setNext(advRef);
			advRef.getPrev().setNext(node);
			advRef.setPrev(node);
			size++;
		}

	}

	public static void insertAfter(int age, String name, String afterThis) {

		DoubleNode node = new DoubleNode(age, name);

		DoubleNode advRef = head;
		
		try{while (advRef.getName() != afterThis) {
			advRef = advRef.getNext();
		}

		node.setPrev(advRef);
		node.setNext(advRef.getNext());
		advRef.getNext().setPrev(node);
		advRef.setNext(node);
		size++;
		
		}catch(NullPointerException e) {
			System.out.println("The element "+afterThis+" is not found!");
		}
	}

	public static void insertAtBeginning(int age, String name) {

		DoubleNode node = new DoubleNode(age, name);
		node.setNext(head);
		head.setPrev(node);
		head = node;
		size++;

	}

	public static void insertAtLast(int age, String name) {

		DoubleNode node = new DoubleNode(age, name);
		DoubleNode looper = head;
		while (looper.getNext() != null) {
			looper = looper.getNext();
		}
		looper.setNext(node);
		tail = node;
		size++;
	}

	public static void traverse() {

		int i = 0;
		DoubleNode node = head;

		while (i < size) {

			System.out.println(node.getName() + " " + node.getAge());
			node = node.getNext();
			i++;
		}
	}

	public static DoubleNode getHead() {
		return head;
	}

	public static DoubleNode getTail() {
		return tail;
	}

	public static int getSize() {
		return size;
	}

}
