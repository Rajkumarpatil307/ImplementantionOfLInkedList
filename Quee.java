package ImplemantationOfLinkedList;

public class Quee {
	NodeQ front,rear;
	public void enque(int data) {
		NodeQ newNode=new NodeQ();
		newNode.data=data;
		if(rear==null) {
			rear=front=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
		}
	}
	public int  deque() {
		NodeQ temp=front;
		front=front.next;
		return temp.data;
	}
     public int peek() {
    	 return front.data;
     }
     public void display() {
    	 NodeQ temp=front;
    	 while(temp!=null) {
    		 System.out.println(temp.data);
    		 temp=temp.next;
    	 }
     }
     
     
}
