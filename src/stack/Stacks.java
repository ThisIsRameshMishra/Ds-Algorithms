package stack;

import linkedlist.MyLinkedList;

public class Stacks<E> {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stacks<Integer> s=new Stacks<>();
		s.push(5);
		s.push(7);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
	}
	private MyLinkedList<E> ll = new MyLinkedList<>();

	void push(E e) {
		ll.add(e);//adding the element in the last node of the linked list
	}

	E pop() throws Exception {
//handling the empty linked list while trying to pop
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");

		}
		return ll.removeLast();
	}

	E peek() throws Exception {
//handling the empty linked list while trying to peek
		if(ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed");

		}
		return ll.getLast();
	}

}
