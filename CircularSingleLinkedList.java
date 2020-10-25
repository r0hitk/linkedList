package linkedList;

public class CircularSingleLinkedList {

	private static SingleNode head;
	private static SingleNode tail;
	private static int size;

	public static void createCircularLinkedList(int age, String name) {

		SingleNode node = new SingleNode(age, name);

		node.setNext(node);

		head = node;
		tail = node;
		size++;

	}

	public static void insertBefore(int age, String name, String beforeThis) {

		if (linkedListExists()) {

			SingleNode node = new SingleNode(age, name);
			SingleNode lagRef = head, advRef = head.getNext();

			if (lagRef.getName().equals(beforeThis)) {

				insertAtBeginning(age, name);
			}

			else {

				while (advRef.getName() != beforeThis) {

					if (advRef.getNext().equals(head)) {
						System.out.println("No such element as " + beforeThis + " in the list.");
						return;
					}

					lagRef = lagRef.getNext();
					advRef = advRef.getNext();

				}
				lagRef.setNext(node);
				node.setNext(advRef);
				size++;
			}

		} else {
			System.out.println("No linked list exists!");
		}

	}

	public static void insertAfter(int age, String name, String afterThis) {

		if (linkedListExists()) {

			SingleNode node = new SingleNode(age, name);
			SingleNode lagRef = head, advRef = head.getNext();

			while (lagRef.getName() != afterThis) {

				if (lagRef.getNext().equals(head)) {
					System.out.println("No such element as " + afterThis + " in the list.");
					return;
				}

				lagRef = lagRef.getNext();
				advRef = advRef.getNext();
			}

			lagRef.setNext(node);
			node.setNext(advRef);
			size++;

		} else {
			System.out.println("No linked list exists!");
		}

	}

	public static void insertAtBeginning(int age, String name) {

		if (linkedListExists()) {

			SingleNode node = new SingleNode(age, name);
			node.setNext(head);

			SingleNode looper = head.getNext(), firstNode = head;

			if (firstNode.getNext().equals(head)) {

				firstNode.setNext(node);
				tail = firstNode;
				head = node;

				size++;

			} else {

				while (looper.getNext() != head) {

					looper = looper.getNext();
				}

				looper.setNext(node);
				head = node;
				// tail = looper;
				size++;
			}

		} else {
			System.out.println("No linked list to insert element.");
		}

	}

	public static void insertAtEnd(int age, String name) {

		if (linkedListExists()) {

			SingleNode node = new SingleNode(age, name);
			SingleNode looper = head;

			while (looper.getNext() != head) {

				looper = looper.getNext();
			}

			looper.setNext(node);
			node.setNext(head);
			tail = node;
			size++;
		}

		else {
			System.out.println("There is no linked list!");
		}

	}

	public static void deleteNode(String name) {

		if (linkedListExists()) {

			SingleNode lagRef = head, advRef = head.getNext();

			if (lagRef.getName().equals(name)) {
				deleteFirstNode();
			}

			else {
				while (advRef.getName() != name) {

					if (advRef.getNext().equals(head)) {
						System.out.println("No such element to delete!");
						return;
					}

					advRef = advRef.getNext();
					lagRef = lagRef.getNext();
				}

				lagRef.setNext(advRef.getNext());
				size--;
			}
		} else {
			System.out.println("There is no linked list to delete elements from!");
		}
	}

	public static void deleteFirstNode() {

		if (linkedListExists()) {
			if (size == 1) {
				head = null;
				tail = null;
				size = 0;
				System.out.println("No more element present in the list.");
			} else {
				head = head.getNext();
				tail = head;
				size--;
			}
		} else {
			System.out.println("No Linked list exists.");
		}

	}

	public static void deleteLastNode() {

		if (linkedListExists()) {

			if (size == 1) {
				head = null;
				tail = null;
				size = 0;
				System.out.println("No more element present in the list.");
			} else {
				
				SingleNode lagRef = head, advRef = head.getNext();

				while (advRef.getNext() != head) {
					advRef = advRef.getNext();
					lagRef = lagRef.getNext();
				}
				
				lagRef.setNext(head);
				tail=lagRef;
				size--;
			}
		} else {
			System.out.println("No linked list is there to delete elements from.");
		}
	}

	public static void traverse() {

		SingleNode node = head;
		for (int i = 0; i < size; i++) {

			System.out.println(node.getName() + " " + node.getAge());
			node = node.getNext();
		}
	}

	public static boolean linkedListExists() {

		if (head != null) {
			return true;
		}

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
