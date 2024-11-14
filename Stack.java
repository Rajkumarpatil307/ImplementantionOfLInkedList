package ImplemantationOfLinkedList;

public class Stack {
	NodeS top;
	public void push(int data) {
		NodeS newNode =new NodeS();
		newNode.data=data;
		if(top==null) {
			top=newNode;
		}else {
			newNode.next=top;
			top=newNode;
		}
		
	}
	public int pop() {
		
		top=top.next;
		return top.data;
	}
	public int peek() {
		return top.data;
	}
	 public void display() {
	        if (top == null) {
	            System.out.println("Stack is empty.");
	            return;
	        }
	        NodeS temp = top;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	}


