package Queue;

public class ArrayQueue {

	final int MAX = 1000;
	int front;
	int rear;
	int [] queue;
	
	public ArrayQueue() {
		front = rear = 0;
		queue = new int[MAX];
		
	}
	
	public boolean queueisEmpty() {
		return front == rear;
	}
	
	public boolean queueisFull() {
		if(rear == MAX - 1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int size() {
		return front - rear;
	}
	
	public void push(int value) {
		if(queueisFull()) {
			System.out.println("가득 찼습니다.");
			return;
		}
		queue[rear++] = value;
	}
	
	public int pop() {
		if(queueisEmpty()) {
			System.out.println("비어있습니다.");
			return -1;
		}
		int popValue = queue[front++];
		return popValue;
		
	}
	
	public int peek() {
		if(queueisEmpty()) {
			System.out.println("비어있습니다.");
			return -1;
		}
		int popValue = queue[front];
		return popValue;
			
	}
	
	public void clear() {
		for(int i = 0; i < rear; i++) {
			queue[i] = 0;
		}
		front = rear = 0;
		
		
	}
	
	public String element() {
		for(int i = 0; i < rear; i++) {
			System.out.println(queue[i]);
		}
		
		return "끝입니다.";
	}
	
	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue();
	
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.push(6);
		
		queue.pop();
		
		
		System.out.println(queue.element());
		queue.clear();
		System.out.println(queue.peek());
		
	
	}
	
}
