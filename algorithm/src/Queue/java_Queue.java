package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class java_Queue {

	
	public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList<Integer>();
	
	queue.offer(1);
	queue.add(2);
	
	while(!queue.isEmpty()) {
		System.out.println(queue.element());
	}
	
	}
	
}
