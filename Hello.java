package ImplemantationOfLinkedList;

public class Hello {
public static void main(String[] args) {
//	SinglyLinkedList l=new SinglyLinkedList();
//	l.insert(4);
//	l.insert(4);
//	l.insert(4);
//	l.insert(4);
//	l.insert(4);
//l.show();
//NodeDoubly d=new NodeDoubly();
//DoublyLinkedList n=new DoublyLinkedList();
//n.add(1);
//n.add(2);
//n.add(3);
//n.add(4);
//n.add(5);
//n.add(6);
//n.display();	
//
//CircularLinkedList c=new CircularLinkedList();
//c.add(1);
//c.add(2);
//c.add(3);
//c.add(4);
//c.display();	
//Stack s=new Stack();
//s.push(1);
//s.push(2);
//s.push(3);
//s.push(4);
//s.push(5);
//System.out.println(s.peek());
//s.display();
	
	Quee q=new Quee();
	q.enque(1);
	q.enque(2);
	q.enque(3);
	q.enque(4);
	System.out.println(q.deque());
	System.out.println("*************************");
	q.enque(5);
	q.enque(6);
	q.enque(7);
    q.display();
	System.out.println("*************************");
   System.out.println(q.peek()); 
	
	

}

}
