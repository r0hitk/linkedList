package linkedList;

public class SingleNode {

	private int age;
	private String name;
	private SingleNode next;

	SingleNode(int age, String name) {
		this.age = age;
		this.name = name;
		next = null;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SingleNode getNext() {
		return next;
	}

	public void setNext(SingleNode next) {
		this.next = next;
	}

}
