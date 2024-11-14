package ImplemantationOfLinkedList;

public class CircularLinkedList {
	
	NodeC tail, head;
	public void add(int data) {
		NodeC newNode=new NodeC();
		newNode.data=data;
		//newNode.next=null;
		if(head==null) {
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}else {
			tail.next=newNode;
			tail=newNode;
			tail.next=head; //its circular LinkedList
			
		}
	}
	public void display() {
		NodeC current=head;
		do {
			System.out.println(current.data);
			current=current.next;
		}while(current!=head);
		
		
	}

}
