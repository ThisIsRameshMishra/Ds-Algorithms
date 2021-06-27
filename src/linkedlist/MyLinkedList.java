package linkedlist;

public class MyLinkedList<E> {
	Node<E> head;
	public static void main(String[] args) {
		MyLinkedList<Integer> ll=new MyLinkedList<>();
		for(int i=0;i<=5;i++) {
			ll.add(i);
		}
		ll.display();
	}
	public void add(E data) {
	Node<E> toadd=new Node<E>(data);
	if(head==null) {
		head=toadd;
		return;
	}
	Node<E> temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=toadd;
}
	public boolean isEmpty() {
		return head==null;
	}
	public E removeLast() throws Exception {
		Node<E> temp = head;

		if (temp == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}

		if (temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}

		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	public E getLast() throws Exception {
		Node<E> temp = head;

		if (temp == null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	void display() {
		if(head==null) return;
		Node<E> temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
}
class Node<E>{
	public Node<E> next;
	public E data;
	public Node(E data){
		this.data=data;
		next=null;
	}
}
