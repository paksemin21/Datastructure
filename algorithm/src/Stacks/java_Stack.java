package Stacks;

import java.util.Stack;

import javax.lang.model.element.Element;

public class java_Stack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 1; i<=5; i++) { // ���ÿ� 1,2,3,4,5�� ����
			stack.push(i); // push�� ���� �־���
			System.out.println(stack.peek()); // ���� �ֱٿ� �� �� ���
		}
		stack.pop(); // ���� �ֱٿ��� �� ����
		System.out.println("Pop()"); 
        System.out.println(stack.peek()); // 4�� ���    
        System.out.println(stack.search(3)); // �ε��� ��ġ ���� ���    
        System.out.println(stack.empty());  // ����ִ��� ��, ���� ���� ��ȯ
	}
	
}
