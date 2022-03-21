package Stacks;

public class ArrayStack {

	int top; // 인덱스 값
	int size; // (스택의)배열의 크기
	int [] stack;
	public ArrayStack(int size) { // 생성자를 통해 값 주입
		this.size = size;
		stack = new int[size];
		top = -1;
		
	}
	
	public void push(int item) {
		stack[++top] = item;
		System.out.println(stack[top] + " 를 Push 했습니다.");
	}
	public void pop() {
		System.out.println(stack[top] + "를 Pop 했습니다.");
		int pop = stack[top];
		stack[top--] = 0;
	}
	public void peek() {
		System.out.println(stack[top] + "가 가장 최근의 값입니다.");
	}
	
	public void search(int index) {
		for(int j = 0; j < size; j++) {
			if(index == stack[j]) {
				System.out.println(index + "의 값은 " + j + "번째 인덱스에 존재합니다.");
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
