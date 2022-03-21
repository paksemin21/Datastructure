package Stacks;

public class ArrayStack {

	int top; // �ε��� ��
	int size; // (������)�迭�� ũ��
	int [] stack;
	public ArrayStack(int size) { // �����ڸ� ���� �� ����
		this.size = size;
		stack = new int[size];
		top = -1;
		
	}
	
	public void push(int item) {
		stack[++top] = item;
		System.out.println(stack[top] + " �� Push �߽��ϴ�.");
	}
	public void pop() {
		System.out.println(stack[top] + "�� Pop �߽��ϴ�.");
		int pop = stack[top];
		stack[top--] = 0;
	}
	public void peek() {
		System.out.println(stack[top] + "�� ���� �ֱ��� ���Դϴ�.");
	}
	
	public void search(int index) {
		for(int j = 0; j < size; j++) {
			if(index == stack[j]) {
				System.out.println(index + "�� ���� " + j + "��° �ε����� �����մϴ�.");
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		
		for(int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		stack.peek();
		stack.search(3);
	
		
	}
}
