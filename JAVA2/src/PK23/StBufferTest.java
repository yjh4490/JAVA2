package PK23;

public class StBufferTest {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("Nice Day! ");
		
		System.out.println(buf.toString());
		System.out.println(buf.length());	//���ڿ��� ũ��!
		System.out.println(buf.capacity()); //���ڿ��� ����! 
		buf.ensureCapacity(100);	// �뷮����!
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! "); // ���ڿ� �߰�
		buf.insert(14, "Everybody :)");	// ���ڿ� �߰�
		System.out.println(buf);
		buf.delete(0, 4); // ���ڿ� ����
		System.out.println(buf);











	}
	
}