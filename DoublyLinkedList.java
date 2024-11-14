package ImplemantationOfLinkedList;

public class DoublyLinkedList {

NodeDoubly head,tail;

public void add(int data) {
	NodeDoubly newNode=new NodeDoubly();
	newNode.data=data;
	newNode.prev=null;
	newNode.next=null;
	if(head==null) {
		head=tail=newNode;
		newNode.prev=null;
		tail.next=null;
	}else {
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		tail.next=null;
	}
}
public void display() {
	NodeDoubly current=head;
	while(current!=null) {
		System.out.println(current.data);
		current=current.next;
	}
}

}
