package PK23;

public class StBufferTest {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("Nice Day! ");
		
		System.out.println(buf.toString());
		System.out.println(buf.length());	//문자열의 크기!
		System.out.println(buf.capacity()); //문자열의 길이! 
		buf.ensureCapacity(100);	// 용량증가!
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! "); // 문자열 추가
		buf.insert(14, "Everybody :)");	// 문자열 추가
		System.out.println(buf);
		buf.delete(0, 4); // 문자열 삭제
		System.out.println(buf);











	}
	
}