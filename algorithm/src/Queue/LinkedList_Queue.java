package Queue;


class QueueNode {
	int value;
	QueueNode queueNode;
	public QueueNode(int value) {
		this.value = value;
		queueNode = null;
	}
	
	public int getValue() {
		return value;
	}
	public QueueNode getNextNode() {
		return queueNode;	
	}
	public void setNextNode(QueueNode queueNode) {
		this.queueNode = queueNode;
	}
}



public class LinkedList_Queue {

	QueueNode front, rear;
	
	public LinkedList_Queue() {
		front = rear = null;
	}
	public boolean queueisEmpty() {
		if(front == null && rear == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int value) {
		QueueNode queueNode = new QueueNode(value);
		if(queueisEmpty()) {
			front = rear = queueNode;
		} else {
			front.setNextNode(queueNode);
			front = queueNode;
			
		}
	}
	public QueueNode pop() {
		if(queueisEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		} else {
			QueueNode popNode = rear;
			rear = rear.getNextNode();
			return popNode;
		}
	}
	public QueueNode peek() {
		if(queueisEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		} else {
			return rear;
		}
	}
	
		public int size() {
			QueueNode front2 = front;
			QueueNode rear2 = rear;
			int count = 1;
			while(front2 != rear2 && rear2 != null) {
				count++;
				rear2 = rear2.getNextNode();
			}
			return count;
		}
	
		public static void main(String[] args) {
			LinkedList_Queue queue = new LinkedList_Queue();
			
			
			
			queue.push(3);
			queue.push(5);
			queue.push(7);
			queue.push(4);
			
			System.out.println(queue.peek());
			
		}
	
}
