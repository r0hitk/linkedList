package linkedList;

public class CircularDoubleLinkedList {

	private static int size;
	private static DoubleNode head;
	private static DoubleNode tail;

	public static void createCircularDoubleLinkedList(int age, String name) {

		DoubleNode node = new DoubleNode(age, name);

		node.setNext(node);
		node.setPrev(node);
		head = node;
		tail = node;

	}

	public static void insertAtBeginning(int age, String name) {

	}

	public static boolean linkedListExists() {

		if (head != null)
			return true;

		return false;
	}

	public int getSize() {
		return size;
	}

	public DoubleNode getHead() {
		return head;
	}

	public DoubleNode getTail() {
		return tail;
	}

}
