package ImplemantationOfLinkedList;

public class SinglyLinkedList {
Node head;

public void insert(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	
	if(head==null) {
		head=node;
		
	}else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
}
public void show() {
	Node temp =head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}

}
