package PK26.arraylist;

import java.util.ArrayList;

class MyStack{	// ArrayList를 Stack화 해주는 작업!!!
	
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len=arrayStack.size();
		if (len==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return(arrayStack.remove(len-1)); //끝에서 뽑기위해서 -1
	}
	
}




public class StackTest2 {
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());


	}
}