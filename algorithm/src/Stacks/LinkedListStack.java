package Stacks;

class Node {

	private int item;
	private Node node;
	
	public Node(int item) {
		this.item = item;
		this.node = null;
	}
	
	protected void linkNode(Node node) {
		this.node = node;
		
	}
	
	protected int getData() {
		return this.item;
	}
	
	protected Node getNextNode() {
		return this.node;
	}
}


public class LinkedListStack {
	Node top;
	
	public LinkedListStack() {
		this.top = null;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.linkNode(top);
		top = node;
	}
	
	public void pop() {
		top = top.getNextNode();
		
	}
	public int peek() {
		return top.getData();
	}
	
	public static void main(String[] args) {
		
		
		LinkedListStack stack = new LinkedListStack();
		

		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.peek());
		
		
		
		
	}
}
