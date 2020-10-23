package linkedList;

public class DoubleNode {

	int age;
	String name;
	DoubleNode next;
	DoubleNode prev;

	DoubleNode(int age, String name) {
		this.age = age;
		this.name = name;
		next = null;
		prev = null;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}

	public DoubleNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}

}
