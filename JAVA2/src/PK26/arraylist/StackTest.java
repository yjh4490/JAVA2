package PK26.arraylist;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
//		public Element push(Element item); // ������ �߰�
//		public Element pop(); // �ֱٿ� �߰���(Top) ������ ����
//		public Element peek(); // �ֱٿ� �߰���(Top) ������ ��ȸ
//		public boolean empty(); // stack�� ���� ������� Ȯ��, ������� true, �ƴϸ� false
//		public int seach(Object o); // ���ڰ����� ���� �������� ��ġ ��ȯ, �׸����� �����ϰ���

		Object obj;
		//empty ���û���
		Stack<Object> st=new Stack<Object>();
		if(st.empty()) {
			for (int i = 0; i < 3; i++) {
				st.push(new String(i + "Hi!"));
				System.out.println("�Է�" + i + "��° : " + st.peek()); //peek �ֱٿ� �߰���(Top) ������ ��ȸ(����)
			}
		}// of
		st.pop();
		System.out.println("���� Top�� ��ġ (peek) : " + st.peek());
		st.pop();
		System.out.println("���� Top�� ��ġ (peek) : " + st.peek());
		st.push(new String("every body!"));
		System.out.println(st.peek());
		st.push(new String("Nice Day!"));
		System.out.println(st.peek());
		

	}
}