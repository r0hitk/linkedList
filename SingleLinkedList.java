package linkedList;

public class SingleLinkedList {

	private static SingleNode head = null;
	private static SingleNode tail = null;
	private static int size = 0;

	// Creates a LinkedList for the first time
	public static void createSingleLinkedList(int age, String name) {

		SingleNode node = new SingleNode(age, name);
		head = node;
		tail = node;
		size = 1;

	}

	public static void insertAtBeginning(int age, String name) {

		if (linkedListExists()) {

			SingleNode node = new SingleNode(age, name);
			node.setNext(head);
			head = node;

			size++;

		} else {
			System.out.println("There is no Linked List for adding this node to!");
		}
	}

	public static void insertAtEnd(int age, String name) {

		if (linkedListExists()) {

			SingleNode node = new SingleNode(age, name);
			tail.setNext(node);
			tail = node;

			size++;
		} else {
			System.out.println("There is no Linked List for adding this node to!");
		}
	}

	public static void insertAfter(int age, String name, String afterThis) {

		if (linkedListExists()) {

			SingleNode advRef = head.getNext();
			SingleNode lagRef = head;

			try {
				while (lagRef.getName() != afterThis) {

					advRef = advRef.getNext();
					lagRef = lagRef.getNext();

				}

				SingleNode node = new SingleNode(age, name);

				node.setNext(advRef);
				lagRef.setNext(node);

				size++;
			} catch (NullPointerException e) {
				System.out.println("No such element!!");
			}
		} else {
			System.out.println("There is no Linked List for adding this node to!");
		}
	}

	public static void insertBefore(int age, String name, String beforeThis) {

		if (linkedListExists()) {

			SingleNode advRef = head.getNext();
			SingleNode lagRef = head;
			try {
				while (advRef.getName() != beforeThis) {

					lagRef = lagRef.getNext();
					advRef = advRef.getNext();
				}

				SingleNode node = new SingleNode(age, name);

				node.setNext(advRef);
				lagRef.setNext(node);

				size++;
			} catch (NullPointerException e) {
				System.out.println("Element is not present in the list!");
			}
		} else {

			System.out.println("There is no Linked List for adding this node to!");
		}
	}

	public static void deleteNode(String name) {

		SingleNode lagRef = head;
		SingleNode advRef = head.getNext();

		if (linkedListExists()) {

			if (lagRef.getName().equals(name)) {

				deleteFirstNode();

			} else {

				try {
					// null.getName() is tried to be executed,thus the try catch block
					while (advRef.getName() != name) {

						lagRef = lagRef.getNext();
						advRef = advRef.getNext();
					}

					lagRef.setNext(advRef.getNext());
					advRef.setNext(null);
					size--;

				} catch (NullPointerException e) {
					System.out.println("No such element!");
				}
			}
		}

		else
			System.out.println("There is no linked list to delete elements.");
	}

	public static void deleteFirstNode() {

		SingleNode node = head;
		head = head.getNext();
		node.setNext(null);
		size--;
	}

	public static void deleteLastNode() {

		SingleNode lagRef, advRef;

		lagRef = head;
		advRef = head.getNext();

		while (advRef.getNext() != null) {

			lagRef = lagRef.getNext();
			advRef = advRef.getNext();

		}

		lagRef.setNext(null);
		tail = lagRef;
		size--;

	}

	public static void searchNode(String name) {

		if (linkedListExists()) {

			SingleNode node;
			int count = 1;
			node = head;

			while (node != null) {

				if (node.getName().equals(name)) {

					System.out.println("The element \"" + name + "\" is at the position: " + count);
					break;
				}

				node = node.getNext();
				count++;

			}

			if (node == null)
				System.out.println("There is no element as \"" + name + "\" in the linked list.");
		}

		else
			System.out.println("There is no linked list to search in.");

	}

	public static void traverse() {

		SingleNode node = head;
		while (node != null) {
			// we can also use size of linked list too loop through.

			System.out.println(node.getName() + " " + node.getAge());
			node = node.getNext();

		}
	}

	public static boolean linkedListExists() {

		if (head != null)
			return true;

		return false;
	}

	public static SingleNode getHead() {
		return head;
	}

	public static SingleNode getTail() {
		return tail;
	}

	public static int getSize() {
		return size;
	}

}
