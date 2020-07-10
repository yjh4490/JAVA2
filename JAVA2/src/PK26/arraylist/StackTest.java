package PK26.arraylist;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
//		public Element push(Element item); // 데이터 추가
//		public Element pop(); // 최근에 추가된(Top) 데이터 삭제
//		public Element peek(); // 최근에 추가된(Top) 데이터 조회
//		public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
//		public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음

		Object obj;
		//empty 스택생성
		Stack<Object> st=new Stack<Object>();
		if(st.empty()) {
			for (int i = 0; i < 3; i++) {
				st.push(new String(i + "Hi!"));
				System.out.println("입력" + i + "번째 : " + st.peek()); //peek 최근에 추가된(Top) 데이터 조회(보기)
			}
		}// of
		st.pop();
		System.out.println("현재 Top의 위치 (peek) : " + st.peek());
		st.pop();
		System.out.println("현재 Top의 위치 (peek) : " + st.peek());
		st.push(new String("every body!"));
		System.out.println(st.peek());
		st.push(new String("Nice Day!"));
		System.out.println(st.peek());
		

	}
}