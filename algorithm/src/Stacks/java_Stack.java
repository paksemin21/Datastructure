package Stacks;

import java.util.Stack;

import javax.lang.model.element.Element;

public class java_Stack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 1; i<=5; i++) { // 스택에 1,2,3,4,5를 넣음
			stack.push(i); // push를 통해 넣어줌
			System.out.println(stack.peek()); // 가장 최근에 들어간 값 출력
		}
		stack.pop(); // 제일 최근에들어간 값 제거
		System.out.println("Pop()"); 
        System.out.println(stack.peek()); // 4를 출력    
        System.out.println(stack.search(3)); // 인덱스 위치 값을 출력    
        System.out.println(stack.empty());  // 비어있는지 참, 거짓 값을 반환
	}
	
}
